import java.util.*;

public class Graph<V extends Comparable, E extends Comparable> {
    LinkedList<graphNode<V, E>> list = new LinkedList<>();
    int edgeCounter = 0;


    public int numVertices() {
        return list.size();
    }


    public ArrayList<Vertex<V>> vertices() {
        ArrayList<Vertex<V>> verticesList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            verticesList.add(list.get(i).getVertex());
        }
        return verticesList;
    }

    public int numEdges() {
       return edgeCounter;
    }

    public ArrayList<Edge<E>> edges() {
        ArrayList<Edge<E>> edgesList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            for(Vertex<V> key : currentNode.getMap().keySet()) {
                boolean edgeCheck = true;
                Edge<E> currentEdge = currentNode.getMap().get(key);
                if(i == 0) {
                    edgesList.add(currentEdge);
                }
                for (int j = 0; j < edgesList.size(); j++) {
                    if (currentEdge.getData().compareTo(edgesList.get(j).getData()) == 0) {
                        edgeCheck = false;
                    }
                }
                if(edgeCheck) {
                    edgesList.add(currentEdge);
                }
            }
        }
        return edgesList;
    }

    public Edge<E> getEdge(Vertex u, Vertex v) {
        for(int i = 0; i < list.size(); i++) {
            for(Vertex<V> key: list.get(i).getMap().keySet()) {
                if(v.getData().compareTo(key.getData()) == 0) {
                    return list.get(i).getMap().get(key);
                }
            }
        }
        return null;
    }

    public ArrayList<Vertex> endVertices(Edge e) {
        ArrayList<Vertex> edgeVertices = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentVertex = list.get(i);
            for(Vertex<V> key: currentVertex.getMap().keySet()) {
                Edge<E> value = currentVertex.getMap().get(key);
                if(value.getData().compareTo(e.getData()) == 0) {
                    edgeVertices.add(currentVertex.getVertex());
                }
            }

        }
        return edgeVertices;
    }

    public Vertex<V> opposite(Vertex v, Edge e) {
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            if(currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                for (Vertex<V> key : currentNode.getMap().keySet()) {
                    Edge<E> value = currentNode.getMap().get(key);
                    if(value.getData().compareTo(e.getData()) == 0) {
                        return key;
                    }
                }
            }
        }
        return null;
    }
//
    public int outDegree(Vertex v) {
        int counter = 0;
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            if(currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                counter = currentNode.getMap().keySet().size();
            }
        }
        return counter;
    }

    public int inDegree(Vertex v) {
        int counter = 0;
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            if(currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                counter = currentNode.getMap().keySet().size();
            }
        }
        return counter;
    }

    public ArrayList<Edge<E>> outgoingEdges(Vertex<V> v) {
        ArrayList<Edge<E>> counter = new ArrayList<Edge<E>>();
        for (int i = 0; i < list.size(); i++) {
            graphNode<V, E> currentNode = list.get(i);
            if (currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                for (Vertex<V> key : currentNode.getMap().keySet()) {
                    Edge<E> value = currentNode.getMap().get(key);
                    counter.add(value);
                }
            }
        }
        return counter;
    }

    public ArrayList<Edge<E>> incomingEdges(Vertex<V> v) {
        ArrayList<Edge<E>> counter = new ArrayList<Edge<E>>();
        for (int i = 0; i < list.size(); i++) {
            graphNode<V, E> currentNode = list.get(i);
            if (currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                for (Vertex<V> key : currentNode.getMap().keySet()) {
                    Edge<E> value = currentNode.getMap().get(key);
                    counter.add(value);
                }
            }
        }
        return counter;
    }

    public void insertVertex(Vertex x) {
        list.add(new graphNode<V, E>(x));
    }

    public void insertEdge(Vertex<V> u, Vertex<V> v, Edge<E> x) {
        for(int i = 0; i < list.size(); i++) {
            graphNode currentNode = list.get(i);
            if(currentNode.getMap().containsKey(u.getData()) || currentNode.getMap().containsKey(v.getData())) {
                i += list.size();
            }
            else if(currentNode.getVertex().getData().compareTo(u.getData()) == 0)  {
                currentNode.getMap().put(v, x);
            }
            else if(currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                currentNode.getMap().put(u,x);
            }
        }
        edgeCounter++;
    }


    public void removeVertex(Vertex v) {
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            if(currentNode.getVertex().getData().compareTo(v.getData()) == 0) {
                list.remove(i);
                i--;
            }
            else if(currentNode.getMap().containsKey(v)) {
                currentNode.getMap().remove(v);
            }
        }
    }

    public void removeEdge(Edge e) {
        for(int i = 0; i < list.size(); i++) {
            graphNode<V,E> currentNode = list.get(i);
            for(Vertex<V> key: currentNode.getMap().keySet()) {
                Edge<E> currentEdge = currentNode.getMap().get(key);
                if(currentEdge.getData().compareTo(e.getData()) == 0) {
                    currentNode.getMap().remove(key);
                    break;
                }
            }
        }
        edgeCounter--;
    }

    public void depthFirstSearch(Graph<V,E> graphList, Vertex<V> startVertex) {
        ArrayList<Vertex<V>> vertexList = new ArrayList<>();
        vertexList.add(startVertex);
        Vertex<V> currentVertex = startVertex;
        boolean endCode = false;
        System.out.println("Start at " + currentVertex.toString());
        while(vertexList.size() != numVertices() && !endCode) {
            ArrayList<Edge<E>> currentVertexEdges = incomingEdges(currentVertex);
            int randomNum = (int)(Math.random() * currentVertexEdges.size());
            Edge<E> currentEdge = currentVertexEdges.get(randomNum);
            while(vertexList.indexOf(opposite(currentVertex,currentEdge)) > -1) {
                currentVertexEdges.remove(currentEdge);
                if(currentVertexEdges.size() == 0) {
                    if(currentVertex == startVertex) {
                        endCode = true;
                    }
                    else {
                        System.out.println("No Edges Work");
                        currentVertex = vertexList.get(vertexList.indexOf(currentVertex) - 1);
                        vertexList.add(currentVertex);
                        currentVertexEdges = incomingEdges(currentVertex);
                        randomNum = (int) (Math.random() * currentVertexEdges.size());
                        currentEdge = currentVertexEdges.get(randomNum);
                        System.out.println(" back to " + currentVertex.getData());
                    }
                }
                else {
                    //System.out.println(" " + currentEdge.toString() + " DOES NOT WORK ");
                    randomNum = (int)(Math.random() * currentVertexEdges.size());
                    currentEdge = currentVertexEdges.get(randomNum);
                }
            }
            currentVertex = opposite(currentVertex,currentEdge);
            vertexList.add(currentVertex);
            System.out.println(" moved to " + currentVertex.toString() + " with " + currentEdge.toString());
        }
    }
}
