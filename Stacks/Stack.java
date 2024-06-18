public class Stack {
    private Node top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    } //if the top is null means it is empty and there are no nodes in the stack

    public void push(int data){ //add
        Node newNode = new Node(data);
        newNode.setNextNode(top);
        top = newNode;
        size++;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty, cannot remove and return");
        }
        int data = top.getData(); //set data to the top node
        top = top.getNextNode(); //setting the next node to the top
        size--; //delete
        return data;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, cannot return");
        }
        return top.getData(); //since we don't delete we just need to return
    }
}
