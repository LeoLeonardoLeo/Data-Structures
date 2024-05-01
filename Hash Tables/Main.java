import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Linear, Double and Quad hashing below

        //LINEAR - don't use, just needed to know other types (double and quad)
        LinearHashTable linHT = new LinearHashTable(10, 8);
        //adding
        linHT.add("Apple");
        linHT.add("Banana");
        linHT.add("Strawberry");
        linHT.add("Pear");
        linHT.printTable();

        System.out.println();
        //delete
        System.out.println("Deleted table");
        linHT.delete("Pear");
        linHT.printTable();

        System.out.println();
        //search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fruit to search: ");
        String linearFindItem = scanner.nextLine();

        int linearFindIndex = linHT.search(linearFindItem);
        if (linearFindIndex == -1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found in index: " + linearFindIndex);
        }
        System.out.println();

        //DOUBLE - used to help with collisions
        DoubleHash dobH = new DoubleHash(10, 8);
        dobH.dhtAdd("Apple");
        dobH.dhtAdd("Cherry");
        dobH.dhtAdd("Banana");
        dobH.dhtAdd("Strawberry");
        dobH.dhtAdd("Pear");
        dobH.printTable();

        //searching
        System.out.println();
        System.out.println("Enter fruit to search: ");
        String doubleFindItem  = scanner.nextLine();

        int doubleFindIndex = dobH.search(doubleFindItem);
        if (doubleFindIndex == -1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found in index: " + doubleFindIndex);
        }
        System.out.println();


        //QUADRATIC - multiplies by how many collisions occur
        QuadHash quadH = new QuadHash(10, 8);
        quadH.quadAdd("Banana");
        quadH.quadAdd("Strawberry");
        quadH.quadAdd("Apple");
        quadH.quadAdd("Cherry");
        quadH.quadAdd("Pear");
        quadH.printTable();

        //Searching
        System.out.println();
        System.out.println("Enter fruit to search: ");
        String quadFindItem = scanner.nextLine();

        int quadFindIndex = quadH.quadSearch(quadFindItem);
        if (quadFindIndex == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found in index: " + quadFindIndex);
        }
        System.out.println();
    }
}