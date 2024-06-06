public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(10));
        bst.insert(new Node(5));
        bst.insert(new Node(8));
        bst.insert(new Node(7));
        bst.insert(new Node(2));
        bst.insert(new Node(9));
        bst.insert(new Node(1));
        bst.insert(new Node(3));

        bst.print();
        System.out.println();
        boolean searchingTree = bst.search(8);
        System.out.println(searchingTree); //if data exists says true, if not says false

        bst.delete(9);
        bst.print();
    }
}