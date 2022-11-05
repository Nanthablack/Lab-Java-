public class App3 {
    public static void main(String[] args) {

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");
        Vertex i = new Vertex("I");
        Vertex j = new Vertex("J");
        Vertex z = new Vertex("Z");

        a.addNeighbour(new Edge(3, a, b));
        a.addNeighbour(new Edge(5, a, e));
        a.addNeighbour(new Edge(4, a, h));

        b.addNeighbour(new Edge(3, b, a));
        b.addNeighbour(new Edge(5, b, e));
        b.addNeighbour(new Edge(7, b, f));
        b.addNeighbour(new Edge(2, b, c));

        c.addNeighbour(new Edge(2, c, b));
        c.addNeighbour(new Edge(2, c, f));
        c.addNeighbour(new Edge(6, c, g));
        c.addNeighbour(new Edge(3, c, d));

        d.addNeighbour(new Edge(3, d, c));
        d.addNeighbour(new Edge(7, d, g));
        d.addNeighbour(new Edge(2, d, z));

        e.addNeighbour(new Edge(5, e, a));
        e.addNeighbour(new Edge(5, e, b));
        e.addNeighbour(new Edge(4, e, f));
        e.addNeighbour(new Edge(7, e, h));

        f.addNeighbour(new Edge(4, f, e));
        f.addNeighbour(new Edge(7, f, b));
        f.addNeighbour(new Edge(2, f, c));
        f.addNeighbour(new Edge(4, f, g));
        f.addNeighbour(new Edge(3, f, j));
        f.addNeighbour(new Edge(4, f, i));
        f.addNeighbour(new Edge(5, f, h));

        g.addNeighbour(new Edge(4, g, f));
        g.addNeighbour(new Edge(6, g, c));
        g.addNeighbour(new Edge(7, g, d));
        g.addNeighbour(new Edge(6, g, z));
        g.addNeighbour(new Edge(4, g, j));

        h.addNeighbour(new Edge(4, h, a));
        h.addNeighbour(new Edge(7, h, e));
        h.addNeighbour(new Edge(5, h, f));
        h.addNeighbour(new Edge(2, h, i));

        i.addNeighbour(new Edge(2, i, h));
        i.addNeighbour(new Edge(4, i, f));
        i.addNeighbour(new Edge(6, i, j));

        j.addNeighbour(new Edge(6, j, i));
        j.addNeighbour(new Edge(3, j, f));
        j.addNeighbour(new Edge(4, j, g));
        j.addNeighbour(new Edge(5, j, z));

        z.addNeighbour(new Edge(5, z, j));
        z.addNeighbour(new Edge(6, z, g));
        z.addNeighbour(new Edge(2, z, d));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(h);
        System.out.println(dijkstra.getShortestPathTo(z));
    }
}