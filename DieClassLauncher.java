public class DieClassLauncher {
    public static void main(String[] args) {
        DieClass round1Die1 = new DieClass();
        DieClass round1Die2 = new DieClass();
        int[] firstRun = testToArray(round1Die1, round1Die2, 5);
        System.out.printf(
                "%nThe first set of dice started on faces %d and %d.%nAfter being rolled 100 times, they landed on %d, %d, and %d a total of %d, %d, and %d times respectively.%n",
                firstRun[0], firstRun[1], firstRun[2], firstRun[3], firstRun[4], firstRun[5], firstRun[6], firstRun[7]);
        DieClass round2Die1 = new DieClass(7);
        DieClass round2Die2 = new DieClass(7);
        round2Die1.roll();
        round2Die2.roll();
        int[] secondRun = testToArray(round2Die1, round2Die2, 6);
        System.out.printf(
                "%nThe second set of dice started on faces %d and %d.%nAfter being rolled 100 times, they landed on %d, %d, and %d a total of %d, %d, and %d times respectively.%n",
                secondRun[0], secondRun[1], secondRun[2], secondRun[3], secondRun[4], secondRun[5], secondRun[6],
                secondRun[7]);
    }

    public static int[] testToArray(DieClass die1, DieClass die2, int baseSumTarget) {
        int[] startingFaces = { die1.getFace(), die2.getFace() };
        int sumTarget1 = baseSumTarget, sumTarget2 = baseSumTarget + 2, sumTarget3 = baseSumTarget + 4;
        int sumCount1 = 0, sumCount2 = 0, sumCount3 = 0;
        int sumOfRoll = 0;
        for (int i = 0; i < 100; i++) {
            die1.roll();
            die2.roll();
            sumOfRoll = die1.getFace() + die2.getFace();
            sumCount1 += (sumOfRoll == sumTarget1) ? 1 : 0;
            sumCount2 += (sumOfRoll == sumTarget2) ? 1 : 0;
            sumCount3 += (sumOfRoll == sumTarget3) ? 1 : 0;
        }
        return new int[] { startingFaces[0], startingFaces[1], sumTarget1, sumTarget2, sumTarget3, sumCount1, sumCount2,
                sumCount3 };
    }
}
