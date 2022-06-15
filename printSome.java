public class printSome {
    public static void main(String[] args) {
        printSomee(20, 5);
    }

    public static void printSomee(int num1, int num2) {
        for (int i = 0; i < num1; i++) {
            if (i % num2 == 0 && i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
