import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Merge {
    static ArrayList<Integer> nums = new ArrayList<Integer>();

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


            Random rand = new Random();
            System.out.print("n: ");
            int range = input.nextInt();
            for (int i = 0; i < range; i++) {
                nums.add(rand.nextInt(100));
            }
            input.close();
        System.out.println(nums.toString());
        mergeSort();
        System.out.println(nums);
    }

    // perform a merge sort on a passed through arraylist
    public static void mergeSort() {
        // if the arraylist is empty or has one element, return
        if (nums.size() <= 1) {
            return;
        }
        // split the arraylist into two halves
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < nums.size() / 2; i++) {
            left.add(nums.get(i));
        }
        for (int i = nums.size() / 2; i < nums.size(); i++) {
            right.add(nums.get(i));
        }
        // recursively call mergeSort on each half
        mergeSort(left);
        mergeSort(right);
        // merge the two halves together
        merge(left, right, nums);
    }

    public static void mergeSort(ArrayList<Integer> nums) {
        // if the arraylist is empty or has one element, return
        if (nums.size() <= 1) {
            return;
        }
        // split the arraylist into two halves
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < nums.size() / 2; i++) {
            left.add(nums.get(i));
        }
        for (int i = nums.size() / 2; i < nums.size(); i++) {
            right.add(nums.get(i));
        }
        // recursively call mergeSort on each half
        mergeSort(left);
        mergeSort(right);
        // merge the two halves together
        merge(left, right, nums);
    }

    // merge two halves of an arraylist together
    public static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        int numsIndex = 0;
        // while both halves have elements
        while (leftIndex < left.size() && rightIndex < right.size()) {
            // if the left element is smaller than the right element
            if (left.get(leftIndex) < right.get(rightIndex)) {
                // add the left element to the arraylist
                nums.set(numsIndex, left.get(leftIndex));
                // increment the index of the left arraylist
                leftIndex++;
            } else {
                // add the right element to the arraylist
                nums.set(numsIndex, right.get(rightIndex));
                // increment the index of the right arraylist
                rightIndex++;
            }
            // increment the index of the arraylist
            numsIndex++;
        }
        // while there are still elements in the left half
        while (leftIndex < left.size()) {
            // add the left element to the arraylist
            nums.set(numsIndex, left.get(leftIndex));
            // increment the index of the left arraylist
            leftIndex++;
            // increment the index of the arraylist
            numsIndex++;
        }
        // while there are still elements in the right half
        while (rightIndex < right.size()) {
            // add the right element to the arraylist
            nums.set(numsIndex, right.get(rightIndex));
            // increment the index of the right arraylist
            rightIndex++;
            // increment the index of the arraylist
            numsIndex++;
        }
    }
}