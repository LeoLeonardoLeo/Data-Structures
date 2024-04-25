public class LinkedList {
    private Node head;
    public LinkedList(){
        this.head = null;
    }
    //inserting (at the end)
    //must check if the head is null, if so make a new node and set it to head
    public void insertAtEnd(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            //if not empty set the current node to the head
            Node currentNode = head;
            //while the new head (current node is not null)
            //traverse the list until the last node
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            //set the next node of the current last node to the new node
            currentNode.setNextNode(newNode);
        }
    }

    //printing we take the list as a parameter, go through each item checking if it is null
    public void printList(LinkedList list){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        //start off with the current node
        Node currentNode = list.head;

        //while the current node isnt null (while has data)
        //then we print it and go to the next node
        System.out.println("Items in the linked list");
        while (currentNode != null){
            System.out.println(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println();
    }

    //deleting data from the end
    public void deleteLast(){
        // always check if the head is empty
        if (head == null){
            System.out.println("List has nothing to delete");
            //list is empty nothing to delete
        }
        //checks if there is only one element in the list
        else if (head.getNextNode() == null){
            head = null;
            System.out.println("Deleted only element");
        }

        //delete the last node
        //the head is set to the currentNode
        Node currentNode = head;
        //we use getNextNode() twice is to get to the second last thing
        while (currentNode.getNextNode().getNextNode() != null){
            currentNode = currentNode.getNextNode(); //the second last is updated to be the last
        }
        currentNode.setNextNode(null); //sets the last null to be null


    }

}
