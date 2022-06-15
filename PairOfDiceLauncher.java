public class PairOfDiceLauncher {
    public static void main(String[] args) {
        PairOfDice computer = new PairOfDice();
        PairOfDice player = new PairOfDice();
        int computerPlaySum = 0;
        int playerPlaySum = 0;
        int roundNo = 0;
        while (!(computerPlaySum > 99 || playerPlaySum > 99)) {
            roundNo++;
            computer.roll();
            player.roll();
            computerPlaySum = computer.playSum(computerPlaySum);
            playerPlaySum = player.playSum(playerPlaySum);
            System.out.println("Computer round #" + roundNo + "\nAccumulated sum: " + computerPlaySum + "\n"
                    + computer.toString() + "\n");
            if (computerPlaySum > 99) {
                break; // If computer gets 100 first, break
            }
            System.out.println("Player round #" + roundNo + "\nAccumulated sum: " + playerPlaySum + "\n"
                    + player.toString() + "\n");
        }
        System.out.println("The winner is the " + (computerPlaySum >= 99 ? "computer" : "player" + "!"));
    }
}
