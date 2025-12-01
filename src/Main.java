import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,40);
        sda.insert(4,50);
        sda.insert(5,60);
        sda.insert(6,70);
        sda.insert(7,80);


        sda.searchArray(80);
    }

    // this is a constant time complexity (O)1
    /**
     *
     Different kinds of Time Complexity includes:
     1. Constant Time Complexity O(1): This is a simple add numbers function.
     This means that regardles of any input, the excution tiume will not change, it will remain constant.
     This is an example of a constant time complexity below;
     */
    public static void multiplyNumberByItself(int n){
        System.out.println(n * n);
    }
    /**
     * 2. Linear Time Complexity or N Time Complexity O(N): This is loop through numbers from 1 to n. here,
     * tht time complexity will grow in direct proportion to the size of input data. Example:
     */

    public static void loopThroughNumber(int n){
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
    /**
     * The time complexity for this problem above is 0(n) which is also a linear time complexity because the input determines
     * the time of the execution of the implementation.


     * 3. The quadratic time complexity O(N^2): This can be demostrated with the example below;
     */

    public static void nestedLoopingSample(int n){
        for (int i=0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("value of J: " + j);
            }
            System.out.println("Value of i: " + i);
        }
    }
    /**
     * O(log n) time complexity:
     * NOTE; Divide and Conquer is a very efficient way of finding the n given number in a sorted array
     * 3. Lograthmic Time Complexity: This deals with finding an element in a sorted array.
     *      4. Quadratic Time Complexity: This deals with nexted loops.
     * THINGS TO NOTE ABOUT THE BIG O NOTATION
     * 1. Any assignment statement and if statement that are executed once regardless of te size of the problem takes
     * CONSTANT O(1) TIME COMPLEXITY.
     * 2. A simple for loop from 0 to n (with no internal loops) is going to take a LINEAR O(n) TIME COMPLEXITY
     * 3. A nested loop of thesame time takes a QUADRATIC O(n^2) TIME COMPLEXITY
     * 4. A loop, in which the controlling parameter is divided by two at each step is 0(log n) TIME COMPLEXITY
     * 5. When dealing with multiple statements, just add them up.
     *
     * HOW TO GET THE TIME COMPLEXITY OF AN IMPLEMENTATION

    public static void findTotalNumber(int n){
        var total = 0; // -------------------------------------------------------------------- O(1)
        for (int i = 0; i < n; i++){ // ------------------------------------------------------ O(n)
            total +=i; // -------------------------------------------------------------------- O(1)
        }
        if (total > 1000){ // ---------------------------------------------------------------- O(1)
            System.out.println("The total number is greater than 100"); // ------------------- O(1)
        } else {
            System.out.println(total); // ---------------------------------------------------- O(1)
        }
    }

     * therefore the total time complexity = O(1) + O(n) + O(1) + O(1) + O(1) + O(1) = O(n) time complexity
     */

    /**
     * ARRAYS
     * This is the most used data structure, it is the collections of objects of things
     * We cannot store data of different data types in an array
     * Each element of an array has a unique index
     * The size of an array is predefined and cannot be modified.
     *
     * An array is a data structure consisting an element of element, each element having a key or array index.
     *
     * TYPES OF ARRAY
     * 1. One dimensional array: This consist of multiple columsn and one row.
     * 2. Two Dimensional Array: This consist of multiple rows and multiple columns, and the elements can be accessed by picking the index of
     * the row first and then the column for e.g a[4][3], students[9][6]
     * 3. Three Dimensional Array:
     */

    public static void arrayOfNumbers () {

        int[] arrOfInt;

        arrOfInt = new int[3];

        arrOfInt[0] = 1;
        arrOfInt[1] = 2;
        arrOfInt[2] = 3;


        System.out.println(Arrays.toString(arrOfInt));

    }
}