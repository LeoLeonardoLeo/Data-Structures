public class Node {
    private String data;
    private Node nextNode; // points to the next node
    //as well as calling the class

    //constructor
    public Node(String data){
        this.data = data;
        this.nextNode = null; //sets nextNode to null
    }
    //getters
    public String getData(){
        return data;
    }
    public Node getNextNode(){
        return nextNode;
    }

    //setters
    public void setData(String data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }



}
