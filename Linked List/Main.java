public class Main {
    public static void main(String[] args) {
        //single linked list
        // - starting node
        // - each node has data and an address to the next node
        // - null at the end

        LinkedList ll = new LinkedList();
        //INSERT AT END
        ll.insertAtEnd("butt");
        ll.insertAtEnd("hello");
        ll.insertAtEnd("Dog");
        ll.insertAtEnd("yo");
        ll.printList(ll); //PRINTING

        ll.insertAtEnd("test to be deleted");
        ll.printList(ll);

        ll.deleteLast(); //the last element is now deleted
        ll.printList(ll);


    }
}