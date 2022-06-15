import java.util.Arrays;

public class Unit8FRQ {
    public static boolean containsDuplicates(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] column = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            column[i] = arr2D[i][c];
        }
        return column;
    }
    public static boolean isLatin(int[][] arr2D) {
        int[] firstRow = arr2D[0];
        for (int i = 0; i < firstRow.length; i++) {
            if (containsDuplicates(getColumn(arr2D, i))) {
                return false;
            }
        }
        for (int i = 0; i < firstRow.length; i++) {
            if (containsDuplicates(getRow(arr2D, i))) {
                return false;
            }
        }
        return true;
    }
    public static int[] getRow(int[][] arr2D, int r) {
        int[] row = new int[arr2D[0].length];
        for (int i = 0; i < arr2D[0].length; i++) {
            row[i] = arr2D[r][i];
        }
        return row;
    }
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        System.out.println(isLatin(arr2D));
    }
}
