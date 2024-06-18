public class Main {
    public static void main(String[] args) {
        //stacks - like the name its things stacked on each other

        //push() - puts data in stack
        //pop() - removes and returns last INSERTED element from the stack
        //peek() - returns the last inserted element but DOES NOT delete (used for general viewing)

        //Time complexity - O(1) for push, peek, pop
        //meaning time remains constant no matter how many nodes in the stack
        
        Stack stack = new Stack();
        //pushing
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(3);
        stack.push(1);

        //peeking
        System.out.println("Top element in the stack: " + stack.peek()); //should be 1 as its the last item
        stack.push(10); //now should be last
        System.out.println("Top element in the stack: " + stack.peek()); //should be 1 as its the last item

        //popping

        int deleted = stack.pop();
        System.out.println("Top element: is now deleted: " + deleted);
        System.out.println("Current top element: " + stack.peek());
    }
}