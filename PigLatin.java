import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        /*
        1 = Ask
        2 = Ask (Reversed)
        3 = Tests
        4 = Tests (Reversed)
        */
        int mode = 4; 

        switch (mode) {
            case 1:
            {
                Scanner readin = new Scanner(System.in);
                String input = "";
                System.out.println("[ENTER Q TO STOP]");
                System.out.println("[ENTER WORDS TO BE PIG LATIN-IFIED BELOW]");
                while (true) {
                    System.out.print("Enter a word: ");
                    input = readin.nextLine();
                    if (input.toLowerCase().equals("q")) {
                        System.out.println("\nExiting!");
                        break;
                    }
                    System.out.println(input + " 🡪 " + pigLatin(input));
                }
                readin.close();
            } break;

            case 2:
            {
                Scanner readin = new Scanner(System.in);
                String input = "";
                System.out.println("[ENTER Q TO STOP]");
                System.out.println("[ENTER WORDS TO BE PIG LATIN-IFIED AND REVERSED BELOW]");
                while (true) {
                    System.out.print("Enter a word: ");
                    input = readin.nextLine();
                    if (input.toLowerCase().equals("q")) {
                        System.out.println("\nExiting!");
                        break;
                    }
                    System.out.println(input + " 🡪 " + reversePigLatin(input));
                }
                readin.close();
            } break;

            case 3:
            {
                System.out.println("Running tests!");
                String inputs[] = {"pig", "latin", "this", "strange", "bcdfgh", "apple", "eye", "question", "squeeze", "yes", "rhyme", "try", "Thomas", "Jefferson"};
                String result;
                String expectedValues[] = {"igpay", "atinlay", "isthay", "angestray", "**** INVALID ****", "appleway", "eyeway", "estionquay", "eezesquay", "esyay", "ymerhay", "ytray", "Omasthay", "Effersonjay"};
                for (int i = 0; i < inputs.length; i++) {
                    result = pigLatin(inputs[i]);
                    String visual = result.equals(expectedValues[i]) ? "✔ " : "✗ ";
                    System.out.println(visual + inputs[i] + " 🡪 " + result);
                    if (!(result.equals(expectedValues[i]))) {
                        System.out.println("Expected \"" + expectedValues[i] + "\"");
                    }
                }
            } break;

            case 4:
            {
                System.out.println("Running reverse tests!");
                String inputs[] = {"pig", "latin", "this", "strange", "bcdfgh", "apple", "eye", "question", "squeeze", "yes", "rhyme", "try", "Thomas", "Jefferson"};
                String result;
                String expectedValues[] = {"yapgi", "yalnita", "yahtsi", "yartsegna", "**** INVALID ****", "yawelppa", "yaweye", "yauqnoitse", "yauqsezee", "yayse", "yahremy", "yarty", "Yahtsamo", "Yajnosreffe"};
                for (int i = 0; i < inputs.length; i++) {
                    result = reversePigLatin(inputs[i]);
                    String visual = result.equals(expectedValues[i]) ? "✔ " : "✗ ";
                    System.out.println(visual + inputs[i] + " 🡪 " + result);
                    if (!(result.equals(expectedValues[i]))) {
                        System.out.println("Expected \"" + expectedValues[i] + "\"");
                    }
                }
            } break;
            
        }
    }
    public static String pigLatin(String input) {
        int indexOfY = -1;
        String pigLatined = input.toLowerCase();
        if (pigLatined.indexOf("y")!=0) {
            indexOfY = pigLatined.indexOf("y");
        }
        int[] vowelsPos = {pigLatined.indexOf("a"), pigLatined.indexOf("e"), pigLatined.indexOf("i"), pigLatined.indexOf("o"), pigLatined.indexOf("u"), indexOfY};
        Arrays.sort(vowelsPos);
        if (vowelsPos[vowelsPos.length-1] == -1) {
            return "**** INVALID ****";
        }
        int posPos = 0;
        while (vowelsPos[posPos] == -1) {
            posPos++;
        }
        int firstVowel;
        firstVowel = vowelsPos[posPos];
        if (pigLatined.charAt(firstVowel) == 'u' && pigLatined.charAt(firstVowel-1) == 'q') {
            pigLatined = pigLatined.substring(firstVowel+1) + pigLatined.substring(0, firstVowel+1) + "ay";
        } else if (firstVowel == 0) {
            pigLatined = pigLatined + "way";
        } else {
            pigLatined = pigLatined.substring(firstVowel) + pigLatined.substring(0, firstVowel) + "ay";
        }
        if (Character.isUpperCase(input.charAt(0))) {
            pigLatined = Character.toUpperCase(pigLatined.charAt(0)) + pigLatined.substring(1);
        }
        return pigLatined;
    }
    public static String reversePigLatin(String input) {
        String pigLatined = pigLatin(input);
        if (pigLatined.equals("**** INVALID ****")) {
            return pigLatined; // Preserves normal invalid behavior, though it is pretty funny to see "**** DILAVNI ****"
        }
        String reversed = "";
        for (int i = (pigLatined.length() - 1); i >= 0; i--) {
            reversed += pigLatined.charAt(i);
        }
        if (Character.isUpperCase(pigLatined.charAt(0))) {
            reversed = Character.toUpperCase(reversed.charAt(0)) + reversed.toLowerCase().substring(1);   
        }
        return reversed;
    }
}