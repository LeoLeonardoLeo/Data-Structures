public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addNode(new Node('A')); //0
        graph.addNode(new Node('B')); //1
        graph.addNode(new Node('C')); //2
        graph.addNode(new Node('D')); //3
        graph.addNode(new Node('E')); //4

        graph.addEdge(0, 1); //A has a connection to B
        graph.addEdge(2, 3);
        graph.addEdge(4, 2);
        graph.addEdge(1, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 0));
        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(2, 2));
        System.out.println(graph.checkEdge(2, 3));
    }
}