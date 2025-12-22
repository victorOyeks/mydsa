import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListSamples {

    public static void main(String[] args) {

        int[] numbers = {1,3,10,5,6,7,8};
        largestNum(numbers);
//        sumAndProduct(numbers);
//        printPairs(numbers);
//        reverse(numbers);
        /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(0, 3);
        System.out.println(numbers);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        stringList.add("H");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("First one " + stringList.get(i));
        }

        for(String string : stringList){
            System.out.println("Another one " + string);
        }

        Iterator<String> letters = stringList.iterator();
        while(letters.hasNext()){
            String letter = letters.next();
            System.out.println("Last one " + letter);
        }

         */

        /*
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        for (String letter : stringList) {
            if (letter.equalsIgnoreCase("D")){
                System.out.println("The Letter is found at index of " + stringList.indexOf("D"));
                break;
            }
        }

         */
    }

    // 1. create a function that calculates the sum and product of elements in an array
    // 2. Find the time and space complexity for the created method.

    public static void sumAndProduct (int[] numbers) {

        int sum = 0;
        int product = 1;
        for (int num : numbers) {
            sum +=num;
            product *=num;
        }

        System.out.println("Product of Numbers: " + product);
        System.out.println("Sum of Numbers: " + sum);
    }

    // Create a function that prints to the console the pairs from a given array. Find the time and space complexity for the created method.

    public static void printPairs (int[] nums) {

        int arrayCount = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                arrayCount++;
                System.out.print(nums[i] + "" + nums[j] + " ");
            }
        }
    }

    // Create a method which takes in an array as a parameter and reverse it. Then find the runtime of the created method.
//    public static void reverseArray (int[] nums){
//        for (int i = 0; i < nums.length/2; i++){
//            int temp = nums[i];
//            nums[i] = nums[nums.length - 1 - i];
//            nums[nums.length - 1 - i] = temp;
//        }
//
//        System.out.println("Arrays Reversed " + Arrays.toString(nums));
//    }

    public static void reverseArray(int[] nums) {
        System.out.println("Start:  " + Arrays.toString(nums));
        int steps = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            int left = i;
            int right = nums.length - 1 - i;
            steps++;

            System.out.println();
            System.out.println("Step " + steps + ": swap index " + left + " (val=" + nums[left] + ")"
                    + " with index " + right + " (val=" + nums[right] + ")");

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            System.out.println(" After step " + steps + ": " + Arrays.toString(nums));
        }

        System.out.println();
        System.out.println("Finished: " + Arrays.toString(nums));
    }

    public static void reverse (int[] num) {

        System.out.println("Before " + Arrays.toString(num));
        for (int i = 0; i < num.length/2; i++){
            int leftIndex = i;
            int rightIndex = num.length - 1 - i;

            int temp = num[leftIndex];
            num[leftIndex] = num[rightIndex];
            num[rightIndex] = temp;
        }
        System.out.println("After " + Arrays.toString(num));
    }

    public static void largestNum (int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest Number: " + largest);
    }
}
