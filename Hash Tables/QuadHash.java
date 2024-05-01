public class QuadHash {
    private String[] hashData;
    private int maxSize;
    private int numItems;
    private double loadFactor;

    public QuadHash(int maxSize, double lf) {
        this.maxSize = maxSize;
        loadFactor = lf;
        numItems = 0;
        this.hashData = new String[maxSize];
    }
    public int hashFunction(String key){
        int value = 0;
        for (int i = 0; i < key.length(); i++) {
            value = key.charAt(i) * (i + 1);
        }
        return value % maxSize;
    }
    public boolean quadAdd(String key){
        if (numItems/maxSize >= loadFactor) return false;

        int loc = hashFunction(key);
        int collision = 0;
        int originalLoc = loc;
        while (hashData[loc] != null && !hashData[loc].equals("deleted")){
            loc = originalLoc + collision * collision;
            collision++;
        }
        hashData[loc] = key;
        numItems++;
        return true;
    }

    public int quadSearch(String key){
        int loc = hashFunction(key);
        int collision = 0;
        int originalLoc = loc;
        while (hashData[loc] != null && !hashData[loc].equals(key)){
            loc = originalLoc + collision * collision;
            collision++;
        }
        if (hashData[loc] == null){
            return -1;
        }
        return loc;
    }

    public boolean quadDelete(String key){
        int loc = hashFunction(key);
        int collision = 0;
        int originalLoc = loc;
        while (hashData[loc] != null && !hashData[loc].equals(key)){
            loc = originalLoc + collision * collision;
            collision++;
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
        System.out.println("Quadratic Hash table contents: ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(hashData[i] + " , ");
        }
        System.out.println();
    }


}
