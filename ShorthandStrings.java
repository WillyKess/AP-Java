// import java.util.Scanner;

public class ShorthandStrings {
    public static void main(String[] args) {
        /*
        Scanner readin = new Scanner(System.in);
        String input = "";
        while (!(input.toLowerCase().equals("q"))) {
            System.out.print("\nEnter a message: ");
            input = readin.nextLine();
            System.out.println(toShorthand(input));
        }
        readin.close();
        */
        // /*
        String[] testInputs = {
            "You can pretend to be serious; you can't pretend to be witty",
            "for For to you YOU and TO and",
            "Humuhumunukunukuapua'a - Hawaiian state fish",
            "2 + 2 = 4",
            "This is FOR YOU TO try AND convert."
        };
        for (String input : testInputs) {
            System.out.println("\nConverting \"" + input + "\"");
            System.out.println(toShorthand(input));
        }
        // */
    }
    public static String toShorthand(String targetStr) {
        String targets[] = {"and", "to", "you", "for", "a", "e", "i", "o", "u", "�"};
<<<<<<< HEAD
        String replacements[] = {"&", "2", "�", "4", "", "", "", "", "", "U"}; // Weird stuff with � and U is done so that only "you" gets replaced and converted "you"s don't get deleted. It could be any character but this one probably won't be user input so it's safer.
=======
        String replacements[] = {"&", "2", "�", "4", "", "", "", "", "", "U"}; // Weird stuff with � and U is done so that only you gets replaced, and converted yous don't get deleted. It could be any character but this one is rare so good.
>>>>>>> d2e71efa5c922964e2b3a1b61e5a128b44d51aab
        for (int i = 0; i < targets.length; i++) {
            String toBeReplaced = targets[i];
            String replacement = replacements[i];
            while (targetStr.toLowerCase().contains(toBeReplaced)) {
                int pos = targetStr.toLowerCase().indexOf(toBeReplaced);
                targetStr = targetStr.substring(0, pos) + replacement + targetStr.substring((pos + toBeReplaced.length()));
            }
        }
        return targetStr;
    }
}
