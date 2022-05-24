import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Graph<String,Integer> graphList = new Graph<>();
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        Vertex<String> d = new Vertex<>("D");
        Vertex<String> e = new Vertex<>("E");
        Vertex<String> f = new Vertex<>("F");
        Vertex<String> g = new Vertex<>("G");
        Vertex<String> h = new Vertex<>("H");
        Vertex<String> i = new Vertex<>("I");
        Vertex<String> j = new Vertex<>("J");
        Vertex<String> k = new Vertex<>("K");
        Vertex<String> l = new Vertex<>("L");
        Vertex<String> m = new Vertex<>("M");
        Vertex<String> n = new Vertex<>("N");
        Vertex<String> o = new Vertex<>("O");
        Vertex<String> p = new Vertex<>("P");

        Edge<Integer> one = new Edge<>(1);
        Edge<Integer> two = new Edge<>(2);
        Edge<Integer> three = new Edge<>(3);
        Edge<Integer> four = new Edge<>(4);
        Edge<Integer> five = new Edge<>(5);
        Edge<Integer> six = new Edge<>(6);
        Edge<Integer> seven = new Edge<>(7);
        Edge<Integer> eight = new Edge<>(8);
        Edge<Integer> nine = new Edge<>(9);
        Edge<Integer> ten = new Edge<>(10);
        Edge<Integer> eleven = new Edge<>(11);
        Edge<Integer> twelve = new Edge<>(12);
        Edge<Integer> thirteen = new Edge<>(13);
        Edge<Integer> fourteen = new Edge<>(14);
        Edge<Integer> fifteen = new Edge<>(15);
        Edge<Integer> sixteen = new Edge<>(16);
        Edge<Integer> seventeen = new Edge<>(17);
        Edge<Integer> eighteen = new Edge<>(18);
        Edge<Integer> nineteen = new Edge<>(19);
        Edge<Integer> twenty = new Edge<>(20);
        Edge<Integer> twentyOne = new Edge<>(21);
        Edge<Integer> twentyTwo = new Edge<>(22);
        Edge<Integer> twentyThree = new Edge<>(23);
        Edge<Integer> twentyFour = new Edge<>(24);

        graphList.insertVertex(a);
        graphList.insertVertex(b);
        graphList.insertVertex(c);
        graphList.insertVertex(d);
        graphList.insertVertex(e);
        graphList.insertVertex(f);
        graphList.insertVertex(g);
        graphList.insertVertex(h);
        graphList.insertVertex(i);
        graphList.insertVertex(j);
        graphList.insertVertex(k);
        graphList.insertVertex(l);
        graphList.insertVertex(m);
        graphList.insertVertex(n);
        graphList.insertVertex(o);
        graphList.insertVertex(p);

        graphList.insertEdge(a,b,one);
        graphList.insertEdge(a,e,two);
        graphList.insertEdge(a,f,three);
        graphList.insertEdge(b,f,four);
        graphList.insertEdge(b,c,five);
        graphList.insertEdge(c,d,six);
        graphList.insertEdge(c,g,seven);
        graphList.insertEdge(d,g,eight);
        graphList.insertEdge(e,f,nine);
        graphList.insertEdge(e,i,ten);
        graphList.insertEdge(f,i,eleven);
        graphList.insertEdge(g,j,twelve);
        graphList.insertEdge(g,l,thirteen);
        graphList.insertEdge(d,h,fourteen);
        graphList.insertEdge(h,l,fifteen);
        graphList.insertEdge(i,j,sixteen);
        graphList.insertEdge(j,k,seventeen);
        graphList.insertEdge(g,k,eighteen);
        graphList.insertEdge(i,m,nineteen);
        graphList.insertEdge(i,n,twenty);
        graphList.insertEdge(k,n,twentyOne);
        graphList.insertEdge(k,o,twentyTwo);
        graphList.insertEdge(l,p,twentyThree);
        graphList.insertEdge(m,n,twentyFour);



        System.out.println(graphList.numVertices());
        System.out.println(graphList.vertices().toString());
        System.out.println(graphList.numEdges());
        System.out.println(graphList.edges().toString());
        System.out.println();
        System.out.println();
        graphList.depthFirstSearch(graphList,a);
//
//        //declare a map
//        HashMap<Integer, String> myMap = new HashMap<>();
//
//        //adding to a map
//        myMap.put(12345, "Eric");
//        myMap.put(17312, "Noah");
//        myMap.put(81234, "Sam");
//        myMap.put(23742, "Isaac");
//        myMap.put(37234, "Antong");
//        myMap.put(82342, "Luke");
//        myMap.put(123457, "Devin");
//
//        //for each looping through a map
//        for(int key: myMap.keySet()) {
//            String value = myMap.get(key);
//            System.out.println(value);
//        }
//
//        //checking for a key
//        if(myMap.containsKey(37234)) {
//            System.out.println("37234 is in the map");
//        }
//        if(myMap.containsKey(7127171)) {
//            System.out.println("7127171 is in the map");
//        }
//
//        //USING AN ITERATOR!!!!!
//        Iterator<Integer> iterator = myMap.keySet().iterator();
//        while(iterator.hasNext()) {
//            int key = iterator.next();
//            String value = myMap.get(key);
//            System.out.println(value);
//        }
//
//        //removing from a map
//        System.out.println();
//        myMap.remove(123457);
//        for(int key: myMap.keySet()) {
//            String value = myMap.get(key);
//            System.out.println(value);
//        }
    }
}
