package ArrayPractice;

public class Main
{
    public static void main(String[] args)
    {
        // Create 2D array
        int [][] array = {
                            {18, 7, 23, 12, 5, 0},
                            {524, 789, 312, 456, 871, 193, 634, 219},
                            {3, 6, 9}
                          };



        // Change the final element of the 1D array at index 0 to the total length of the 2D array
        int length = array.length;
        int arrayLength = array[0][array[0].length - 1];

        updateValue(array, 0, arrayLength, length);

        int firstVal = array[0][0];

        int secondVal = array[1][array[1].length - 1];

        int[] firstRow = array[0];
        int firstElementInFirstRow = firstRow[0];

        int[] secondRow = array[1];
        int lastElementInSecondRow = secondRow[secondRow.length - 1];

        int[] thirdRow = array[array.length - 1];
        int lastElementThirdRow  = thirdRow[thirdRow.length - 1];

        int total = firstElementInFirstRow + lastElementInSecondRow + lastElementThirdRow;

        updateValue(array, 1, secondRow[secondRow.length - 1], total);


        // Add the value at the 1st and last index of the 2D array to the value of the last element in the 1D array at index 1

        // Change each value of the 1D array at index 2 to display the length of each respective 1D array.

        // Print the new array
    }

    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }


    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
