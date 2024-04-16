public class UnorderedArray {
    private int[] array;
    private int maxSize;
    private int numElements;

    public UnorderedArray(int size){
        maxSize = size;
        numElements = 0;
        array = new int[maxSize];
    }

    public boolean addLast(int item){
        if (numElements < maxSize){ //checks if there is space
            array[numElements] = item; //adds numElements to the array
            numElements++; // increments num elements
            //loops through to still see if num elements fits in the size of the array
            //if not returns false if it does fit return true and continues
            return true;
        }
        return false;
    }

    public boolean delete(int key) {
        for (int i = 0; i < numElements; i++) {
            if (array[i] == key) {

                //shift elements to the left to overwrite the deleted element
                for (int j = i; j < numElements - 1; j++) {
                    array[j] = array[j + 1];
                }
                //without this for loop, it will only delete the last item of the array
                //this allows us to delete a certain item (key)

                // Set the last element to 0 (or any default value for your array)
                array[numElements - 1] = 0; // Assuming 0 is not a valid element in your array
                numElements--; // Decrement the number of elements
                return true; // Element found and deleted
            }
        }
        return false; // Element not found
    }

    public String listItems(){
        String s = " ";
        for (int i = 0; i < numElements; i++) {
            s += array[i] + " ";
        }
        return s;
    }
}
