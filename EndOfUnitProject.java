import java.util.Scanner;
public class EndOfUnitProject {

    static Scanner readin = new Scanner(System.in);

    public static boolean lucky7() {
        System.out.println("\nPlease enter two integers:        (lucky7)");
        int int1 = readin.nextInt();
        int int2 = readin.nextInt();
        boolean isLucky7 = (int1 == 7 || int2 == 7 || int1+int2 == 7 || int1-int2 == 7 || int2-int1 == 7);
        return isLucky7;
    }
    public static boolean mult35() {
        System.out.println("\nPlease enter two positive integers:       (mult35)");
        int int1 = readin.nextInt();
        boolean isMult35 = (int1 > 0 && (int1 % 3 == 0 || int1 % 5 == 0));
        return isMult35;
    }
    public static int blackjack() {
        System.out.println("\nPlease enter two positive integers:       (blackjack)");
        int int1 = readin.nextInt();
        int int2 = readin.nextInt();
        int result = 1234; // Have to declare this to a value, unless we want to have a whole bunch of ternary operators instead of if statements. At least it gives us an easy way to tell if the input is wrong.
        if (int1 >= 0 && int2 >= 0) {
            if (int1 > 21 && int2 > 21) {
                result = 0;
            } else if (int1 == int2) {
                result = 3;
            } else if ((int1 > int2 && int1 <= 21) || int2 > 21) {
                result = 1;
            } else if ((int2 > int1 && int2 <= 21) || int1 > 21) {
                result = 2;
            }
        }
        // if (result == 1234) {
        //     System.out.println("No negative numbers!!!");
        // }
        return result;
        }
    public static void main(String[] args) {
        while (true) {
            System.out.printf("%nLucky7: %b%nMult35: %b%nBlackjack: %d%n",lucky7(),mult35(),blackjack());
            System.out.println("\n...looping...");
        }
    }
}