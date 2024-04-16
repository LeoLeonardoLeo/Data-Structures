import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 2, 8, 3, 1, 4, 9, 5, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you would like to find: ");
        int key = scanner.nextInt();
        int find = search(array, key); //call array

        if (find == -1){
            System.out.println("Could not find " + key);
        }
        //adding last to an unordered array
        UnorderedArray ua = new UnorderedArray(20);
        //base data in the array
        ua.addLast(2);
        ua.addLast(8);
        ua.addLast(4); //what will be deleted
        ua.addLast(5);
        ua.addLast(3);
        ua.addLast(9);
        ua.addLast(7);

        System.out.println("array:" + ua.listItems());

        //deleting
        ua.delete(4);
        System.out.println("4 was deleted");
        System.out.println("array:" + ua.listItems());

        System.out.println();
        while (true) {
            System.out.println("Enter number to add to the end of the array or press 'e' to exit: ");
            String input = scanner.next();
            if (input.equals("e")) {
                break;
            }
            int numberToAdd = Integer.parseInt(input);
            ua.addLast(numberToAdd);
            System.out.println("Modified array: " + ua.listItems());
        }
    }
    public static int search(int[] array, int key){
        //also known as linear search time
        //O(n) - the more items in array, more time taken to search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                System.out.println(array[i] + " found at index: " + i);
                return i;
            }
        }
        return -1;
    }

}