public class LinearHashTable {
    //we always want the array, the max size of the array, the number of items and the loadfactor
    private String[] hashData;
    private int maxSize;
    private int numItems;
    private double loadFactor;

    public LinearHashTable(int maxSize, double lf) {
        this.maxSize = maxSize;
        this.loadFactor = lf;
        numItems = 0;
        this.hashData = new String[maxSize];

    }

    public int hashFunction(String key){
        int value = 0; //this is the hash value
        for (int i = 0; i < key.length(); i++) {
            value = key.charAt(i) * (i + 1); //takes every letter in the string and makes it into an ascii code
        }
        return value % maxSize;
    }

    public boolean add(String key){
        int loc = hashFunction(key); //hashes each item to be added
        if(numItems/maxSize >= loadFactor) {
            return false;
        }
        while(hashData[loc] != null && hashData[loc].equals("deleted")){ //null means empty so if not empty (if its full)
            loc = (loc + 1) % maxSize; //if spot is taken then move to the next
        }
        hashData[loc] = key; //this sets the spot to the key
        numItems++;
        return true;
    }
    public int search(String key){
        int loc = hashFunction(key); //hashes each item to be added
        while (hashData[loc] != null && !hashData[loc].equals(key)) {
            loc = (loc + 1) % maxSize; //if spot is taken then move to the next
        }
        if (hashData[loc] == null){
            return -1; //if it doesn't exist return null and -1
        }
        return loc; //if it exists return the location
    }
    public boolean delete(String key){
        int loc = hashFunction(key); //hashes each item to be added
        while(hashData[loc] != null && !hashData[loc].equals(key)){
            loc = (loc + 1) % maxSize; //if spot is taken then move to the next
        }
        if (hashData[loc] == null){
            return false;
        }
        else{
            hashData[loc] = "deleted";
            numItems--;
            return true;
        }
    }
    public void printTable(){
        System.out.println("Linear Hash table contents: ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(hashData[i] + " , ");
        }
        System.out.println();
    }

}
