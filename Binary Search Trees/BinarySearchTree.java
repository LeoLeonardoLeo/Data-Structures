public class BinarySearchTree {
    Node root;

    //we need to insert, search, delete and print out

    //each function uses a helper function (recursion)

    public void insert(Node node) {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data = node.data; //Takes from Node class

        if (root == null){ //checks if it is empty, if so this is the root
            root = node; //set this current node to the root
            return root;
        }
        //all data less than root go to the left
        //all data greater than root go to the right
        else if (data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void print(){
        printHelper(root);
    }
    private void printHelper(Node root)
    {
        if (root != null){
            //IN ORDER TRAVERSAL
            printHelper(root.left);
            System.out.print(root.data + " ");
            printHelper(root.right);

        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){
        if (root == null){
            return false;
        }
        else if (root.data == data){ //if the root is what is being searched for
            return true;
        }
        else if (root.data > data) { //if the root data is greater than the data we are searching for
            // we must go left (less)
            return searchHelper(root.left, data);
        }
        else {
            //if root data is less than data we want we go right
            return searchHelper(root.right, data);
        }
    }

    public void delete(int data){
        if (search(data)){
            deleteHelper(root, data);
        }
        else{
            System.out.println("Data does not exist");
        }
    }
    public Node deleteHelper(Node root, int data){
        if (root == null){
            return root;
        }
        else if (data < root.data){
            root.left = deleteHelper(root.left, data);
        }
        else if (data > root.data){
            root.right = deleteHelper(root.right, data);
        }
        else {
            //this checks for leaf nodes since they do not need to be shifted then all we do it delete
            if (root.left == null && root.right == null){
                root = null;
            } else if (root.right != null) { //find a new Node to replace on right
                root.data = postNode(root);
                root.right = deleteHelper(root.right, root.data);
            }
            else { //find a new node to replace on left
                root.data = preNode(root);
                root.left = deleteHelper(root.left, root.data);
            }
        }
        return root;
    }
    //when deleting Nodes, we need 2 more functions to help shift nodes around

    private int postNode(Node root){ //finds smallest value below right child
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
        //this goes to the right node, then goes all the way left to find the smallest node

    }
    private int preNode(Node root){ //finds greatest value below left child
        root = root.left;
        while (root.left != null){
            root = root.right;
        }
        return root.data;
    }

}
