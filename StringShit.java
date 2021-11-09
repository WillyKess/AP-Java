import java.util.Scanner;

public class StringShit {
    public static Scanner readin = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(uInOut());
        System.out.println();
        printName();
        System.out.println();
        verticalPrint("pig");
        System.out.println();
        System.out.println(replaceText("You and me", "and", "&"));
        System.out.println();
        readin.close();
    }

    public static String uInOut() {
        System.out.print("Say some stuff: ");
        return readin.nextLine();
    }

    public static void printName() {
        System.out.print("Enter a full name: ");
        String full_name = readin.nextLine();
        String[] split_name = full_name.split("\\s");
        System.out.println("First: " + split_name[0]);
        System.out.println("Middle: " + split_name[1]);
        System.out.println("Last: " + split_name[2]);

    }

    public static void verticalPrint(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            // System.out.println(input.substring(i, i));
        }

    }

    public static String replaceText(String operatee, String replacee, String replacement) {
        // String operatee = input;
        while (operatee.contains(replacee)) {
            int pos = operatee.indexOf(replacee);
            operatee = operatee.substring(0, pos) + replacement + operatee.substring((pos + replacee.length()));
        }
        // String output = operatee;
        return operatee; // I added operatee and output just to make this a little easier to seperate mentally, but they could be removed.
    }

}
