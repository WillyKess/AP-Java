import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Sep3 {
    static final double pi=3.14;
    static Scanner readin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nWhich problem would you like to run?");
        int problemchoice = readin.nextInt();
        switch (problemchoice) {
        case 1:
            problem1();
            break;
        case 2:
            problem2();
            break;
        case 3:
            problem3();
            break;
        }
        readin.close();
    }
    public static void problem1() {
        System.out.println("\nWhat is the radius of the sphere you would like to calculate?"); // Prompt user input
        double R = readin.nextDouble(); // Read radius from user input
        double A = Math.round(4*pi*(R*R) * 100) / 100; // Calculate area and round to nearest hundredth
        double V = Math.round((4 / 3)*pi*(Math.pow(R, 3)) * 100) / 100; // Calculate volume and round to nearest hundredth
        DecimalFormat cutZeros = new DecimalFormat("0");
        cutZeros.setMaximumFractionDigits(340);
        // System.out.println("\nThe area of a sphere with a radius of " + R + " is " + A + " and the volume of this sphere is " + V + "."); // Print results
        System.out.printf("The area of a sphere with a radius of %s is %s, and the volume of this sphere is %s.%n", cutZeros.format(R), cutZeros.format(A), cutZeros.format(V));
    }
    public static void problem2() {
        
    }
    public static void problem3() {
        
    }
}