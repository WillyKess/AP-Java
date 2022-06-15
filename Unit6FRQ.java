public class Unit6FRQ {
    public static void main(String[] args) {
        // String[] words = { "ten", "fading", "post", "card", "thunder", "hinge",
        // "trailing", "batting" };
        // for (String word : words) {
        // if (word.endsWith("ing")) {
        // System.out.println(word);
        // }
        // }
        // Question 1 ^^^
        Payroll pr = new Payroll();
        System.out.println(pr.computeBonusThreshold());
        pr.computeWages(10.0, 1.5);
        for (double wage : pr.wages) {
            System.out.printf("%.2f%n", wage);
        }
        // Question 2 ^^^
    }
}
