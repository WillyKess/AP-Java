import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean shouldLoop = true;
        Scanner readin = new Scanner(System.in);
        Random rand = new Random();
        int userWinCount = 0;
        int computerWinCount = 0;
        int ties = 0;
        while (shouldLoop) {
            int computerChoice = rand.nextInt(2) + 1;
            System.out.print("\nRock (1)\nPaper (2)\nScissors (3)\nSelect");
            int userChoice = readin.nextInt();
            String result = "";
            boolean computerWin = ((computerChoice == 1 && userChoice == 3) || (computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2));
            if (computerWin) {
                computerWinCount++;
                result = "You lost.";
            } else if (computerChoice == userChoice) {
                ties++;
                result = "It was a tie.";
            } else {
                userWinCount++;
                result = "You won!";
            }
            String userChoiceString = userChoice == 1 ? "Rock" : userChoice == 2 ? "Paper" : userChoice == 3 ? "Scissors" : "Please enter only 1-3"; // Java forces me to have a final : so might as well take advantage of it.
            String computerChoiceString = computerChoice == 1 ? "Rock" : computerChoice == 2 ? "Paper" : computerChoice == 3 ? "Scissors" : "Error";
            System.out.printf("You chose %s and the computer chose %s.%n%s%n", userChoiceString, computerChoiceString, result);
            System.out.print("\nPlay again?\nEnter 0 to stop, any other key to continue: ");
            if (readin.next().equals("0")) {
                shouldLoop = false;
            }
        }
        readin.close();
        System.out.printf("%nYou have %d wins, %d losses, and %d ties.%n", userWinCount, computerWinCount, ties);
    }
}
