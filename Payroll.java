public class Payroll {
    private int[] itemsSold = { 48, 50, 37, 62, 38, 70, 55, 37, 64, 60 };
    public double[] wages = new double[itemsSold.length];

    public double computeBonusThreshold() {
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        for (int i : itemsSold) {
            if (i > highest) {
                highest = i;
            } else if (i < lowest) {
                lowest = i;
            }
        }
        int total = 0;
        for (int i : itemsSold) {
            if (i != highest && i != lowest) {
                total += i;
            }
        }
        return (double) total / (itemsSold.length - 2);
    }

    public void computeWages(double fixedWage, double perItemWage) {
        double threshold = computeBonusThreshold();
        for (int i = 0; i < wages.length; i++) {
            double beforeBonus = 10.0 + (1.5 * itemsSold[i]);
            wages[i] = itemsSold[i] > threshold ? beforeBonus * 1.1 : beforeBonus;
        }
    }
}