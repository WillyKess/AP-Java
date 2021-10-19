public class Unit4Proj2 {
    public static void main(String[] args) {
        System.out.print("\nA");
        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nB");
        for (int c = 0; c < 12; c++) {
            for (int d = 11; d > c; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("C");
        for (int e = 0; e < 7; e++) {
            for (int f = 0; f < e; f++) {
                System.out.print("  ");
            }
            for (int g = 6; g > e; g--) {
                System.out.print("**");
            }
            System.out.println();
        }
        System.out.println();
    }
}
