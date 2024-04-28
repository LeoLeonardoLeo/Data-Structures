import java.lang.reflect.Array;
import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int source, int destination){
        matrix[source][destination] = 1; // makes an edge for every row there must be a column
    }
    public boolean checkEdge(int source, int destination){
        //we check if there is an edge, if so then returns true
        if (matrix[source][destination] == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public void print() {
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");  //printing out A, B, C, ETC
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
