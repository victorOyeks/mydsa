public class SingleDimensionArray {

    int array[];
    String arrString[];

    public SingleDimensionArray(int sizeOfArray){
        array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try {
            if (array[location] == Integer.MIN_VALUE) { // ------------ O(1)
                array[location] = valueToBeInserted; // --------------- O(1)
                System.out.println("Value inserted successfully"); // --------------- O(1)
            } else {
                System.out.println("This cell is already occupied"); // --------------- O(1)
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array"); // --------------- O(1)
        }
        // time complexity is O(1)
    }

    public void traverseArray (){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }


    public void searchArray(int valueToSearch){ // this is an O(N) time complexity
        for (int i = 0; i < array.length; i++){
            if (valueToSearch == array[i]){
                System.out.println("Value found at index of " + i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    // delete value from an array
    public void deleteValue (int valueToDeleteIndex){
        try {
            array[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value deleted successfully from the array");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value provided is not in the range of array");
        }
    }
}
