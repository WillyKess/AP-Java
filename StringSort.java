import java.util.Scanner;
public class StringSort {
    static Scanner readin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter two strings to sort:");
        String unsorted1 = readin.nextLine();
        String unsorted2 = readin.nextLine();
        readin.close();
        int lexVal = unsorted1.compareTo(unsorted2);
        String sorted1 = unsorted1;
        String sorted2 = unsorted2;
        if (lexVal > 0) {
            sorted1 = unsorted2;
            sorted2 = unsorted1;
        }
        System.out.printf("%nSorted output:%n%s%n%s%n", sorted1, sorted2);
    }
}