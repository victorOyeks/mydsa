import java.util.Arrays;

public class TwoDimensionalArray {

    int twoDArray[][] = null;


//    public static void main(String[] args) {
//
//        int[][] twoDimensionsArray;
//
//        twoDimensionsArray = new int[2][2];
//
//        twoDimensionsArray[0][0] = 1;
//        twoDimensionsArray[0][1] = 2;
//        twoDimensionsArray[1][0] = 3;
//        twoDimensionsArray[1][1] = 4;
//
//        System.out.println(Arrays.deepToString(twoDimensionsArray));
//
//        String s2Darray[][] = {{"a", "b"}, {"c", "d"}};
//
//        System.out.println(Arrays.deepToString(s2Darray));
//
//
//    }

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {

        this.twoDArray = new int[numberOfRows][numberOfColumns];

        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[0].length; col++) {
                twoDArray[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {

        try {
            if (twoDArray[row][col] == Integer.MIN_VALUE) {
                twoDArray[row][col] = value;
                System.out.println("Value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index of 2D array");
        }
    }

    //Accessing the cell value of a given array
    public void accessCell (int row, int col){
        try{
            int value = twoDArray[row][col];
            System.out.println("Value is: " + value);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index of 2D array");
        }
    }

    // Traversal of two dimensional array
    public void traverse(){
        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray[0].length; j++){
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Search through two dimensional array
    public void search (int value){
        for (int row = 0; row < twoDArray.length; row++){
            for (int col = 0; col < twoDArray[0].length; col++){
                if(value == twoDArray[row][col]){
                    return;
                }
            }
        }
        System.out.println("Value not seen");
    }

    // Deleting from a two dimensional array
    public void deleteFromArray (int row, int col){
        try {
            twoDArray[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted value from index");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

}
