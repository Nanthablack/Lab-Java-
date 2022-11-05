public class App1 {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");

        v1.addNeighbour(new Edge(5, v1, v2));
        v1.addNeighbour(new Edge(3, v1, v3));

        v2.addNeighbour(new Edge(4, v2, v3));
        v2.addNeighbour(new Edge(3, v2, v4));
        v2.addNeighbour(new Edge(4, v2, v5));

        v3.addNeighbour(new Edge(2, v3, v2));
        v3.addNeighbour(new Edge(5, v3, v4));
        v3.addNeighbour(new Edge(6, v3, v5));

        v5.addNeighbour(new Edge(2, v5, v4));

        Dijkstra dijkstra = new Dijkstra();

        dijkstra.computePath(v1);
        System.out.println(dijkstra.getShortestPathTo(v5));
    }
}