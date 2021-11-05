import java.util.Scanner;
import java.lang.Math;

public class StaticMethodLab {
    public static void main(String[] args) {
        // lab1();
        lab2();
    }

    public static void lab1() {
        int x1 = 8;
        int y1 = 9;
        int x2 = 2;
        int y2 = 4;
        System.out.printf("%nThe average of %d and %d is %f", x1, y1, average(x1, y1));
        System.out.printf("%nThe slope of the line between (%d,%d) and (%d,%d) is %f", x1, y1, x2, y2, slope(x1, y1, x2, y2));
        System.out.printf("%nThe distance between (%d,%d) and (%d,%d) is %f", x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }

    public static void lab2() {
        Scanner readin = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = readin.nextInt();
        System.out.print("Enter y1: ");
        int y1 = readin.nextInt();
        System.out.print("Enter x2: ");
        int x2 = readin.nextInt();
        System.out.print("Enter y2: ");
        int y2 = readin.nextInt();
        System.out.printf("The midpoint between (%d,%d) and (%d,%d) is (%.1f, %.1f)", x1, y1, x2, y2, average(x1, x2), average(y1, y2));
        System.out.printf("%nThe distance between (%d,%d) and (%d,%d) is ", x1, y1, x2, y2);
        System.out.print(distance(x1, y1, x2, y2));
        readin.close();
    }

    public static double average(int x, int y) {
        double average = ((double) (x + y) / 2);
        return average;
    }

    public static double slope(int x1, int y1, int x2, int y2) {
        double slope = (y2 - y1) / (x2 - x1);
        return slope;
    }

    public static int difference(int x, int y) {
        int difference = x - y;
        return difference;
    }

    public static int square(int x) {
        int square = x * x;
        return square;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt((square(difference(x1, x2))) + (square(difference(y1, y2))));
        return distance;
    }
}