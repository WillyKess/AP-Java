import java.util.ArrayList;
import java.util.Arrays;

class ArrayListLab1 {
    public static void main(String[] args) {
        ArrayList<String> poem = new ArrayList<String>(Arrays.asList(
                "To think of time—of all that retrospection!",
                "To think of to-day, and the ages continued henceforward!",
                "Have you guess'd you yourself would not continue?",
                "Have you dreaded these earth-beetles?",
                "Have you fear'd the future would be nothing to you?",
                "Is to-day nothing? Is the beginningless past nothing?",
                "If the future is nothing, they are just as surely nothing.",
                "To think that the sun rose in the east! that men and women were flexible, real, alive! that everything was alive!",
                "To think that you and I did not see, feel, think, nor bear our part!",
                "To think that we are now here, and bear our part!"));
        ArrayList<Integer> numList = new ArrayList<Integer>(
                Arrays.asList(5, 3, 0, 8, 9, 3, 3, 3, 4, 0, 3, 3, 3, 13, 45));
        // System.out.println(poem);
        System.out.println(longest(poem));
        System.out.println(numList);
        System.out.println(smallest(numList));
        removeX(numList, 3);
        System.out.println(numList);
    }

    /*
     * Write the method longest which accepts an arraylist of strings and return the
     * longest string. Return the first one if there are multiple longest strings.
     * MUST USE a regular for loop.
     */
    public static String longest(ArrayList<String> poem) {
        String longest = "";
        for (int i = 0; i < poem.size(); i++) {
            if (poem.get(i).length() > longest.length()) {
                longest = poem.get(i);
            }
        }
        return longest;
    }

    /*
     * Write the method smallest which accepts an arraylist of integers and return
     * the smallest. Return the first one if there are multiple smallest values.
     * Your return type should be an Integer. MUST USE a for each loop.
     */
    public static Integer smallest(ArrayList<Integer> numList) {
        int smallest = Integer.MAX_VALUE;
        for (int value : numList) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    /*
     * Write the method removeX which accepts an arraylist of Integers myList and an
     * integer variable x. Remove all occurrences of x in myList.
     */
    public static void removeX(ArrayList<Integer> numList, int i) {
        for (int j = numList.size() - 1; j >= 0; j--) {
            if (numList.get(j) == i) {
                numList.remove(j);
            }
        }
    }
}