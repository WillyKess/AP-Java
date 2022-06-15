public class PairOfDice {
    private DieClass die1 = new DieClass();
    private DieClass die2 = new DieClass();

    public PairOfDice() {

    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int sumRoll() {
        return die1.getFace() + die2.getFace();
    }

    public boolean oneOne() {
        return ((die1.getFace() == 1 && die2.getFace() != 1) || (die2.getFace() == 1 && die1.getFace() != 1));
    }

    public boolean twoOne() {
        return (die1.getFace() == 1 && die2.getFace() == 1);
    }

    public boolean boxCar() {
        return (die1.getFace() == 6 && die2.getFace() == 6);
    }

    public String toString() {
        return "Die 1: " + die1.getFace() + "\nDie 2: " + die2.getFace() + "\nRoll sum: " + sumRoll();
    }

    public int playSum(int originalSum) {
        roll();
        return oneOne() ? originalSum
                : twoOne() ? sumRoll() : boxCar() ? sumRoll() * 2 + originalSum : sumRoll() + originalSum;
    }

}