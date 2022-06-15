public class Unit8Lab1 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6}};
        printTranspose(mat);
    }
    //printTranspose: Given 2D array of integers, print the transpose of the array. The transpose of a 2D array is the array whose rows are the columns of the original array. Do not create a new array, instead, use for loops to traverse the original array.
    public static void printTranspose(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}