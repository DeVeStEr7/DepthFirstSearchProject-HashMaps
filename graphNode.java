import java.util.HashMap;

public class graphNode<V extends Comparable, E extends Comparable> {
    Vertex<V> vertex;
    HashMap<Vertex<V>,Edge<E>> map = new HashMap<Vertex<V>,Edge<E>>();
    public graphNode(Vertex<V> vertex) {
        this.vertex = vertex;
        map = new HashMap<Vertex<V>,Edge<E>>();
    }

    public Vertex<V> getVertex() {
        return vertex;

    }

    public void setVertex(Vertex<V> vertex) {
        this.vertex = vertex;
    }

    public HashMap<Vertex<V>, Edge<E>> getMap() {
        return map;
    }

    public void setMap(HashMap<Vertex<V>, Edge<E>> map) {
        this.map = map;
    }
}
