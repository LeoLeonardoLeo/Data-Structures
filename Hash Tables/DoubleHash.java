public class DoubleHash {
    private String[] hashData;
    private int maxSize;
    private int numItems;
    private double loadFactor;

    public DoubleHash(int maxSize, double lf) {
        this.maxSize = maxSize;
        this.loadFactor = lf;
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
    public int dblHashFunction(String key){
        int value = 0;
        for (int i = 0; i < key.length(); i++) {
            value = key.charAt(i) * (31*(i + 1));
        }
        return value % maxSize;
    }

    public boolean dhtAdd(String key){
        int loc = hashFunction(key);
        int doubleHashFunction = dblHashFunction(key);

        if (numItems/maxSize >= loadFactor) return false;

        while (hashData[loc] != null && !hashData[loc].equals("deleted")){
            loc = (loc + doubleHashFunction) % maxSize;
        }
        hashData[loc] = key;
        numItems++;
        return true;
    }
    public int search(String key){
        int loc = hashFunction(key);
        int doubleHashFunction = dblHashFunction(key);
        while (hashData[loc] != null && !hashData[loc].equals(key)){
            loc = (loc + doubleHashFunction) % maxSize;
        }
        if (hashData[loc] == null){
            return -1;
        }
        return loc;
    }

    public void printTable(){
        System.out.println("Double Hash table contents: ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(hashData[i] + " , ");
        }
        System.out.println();
    }



}
