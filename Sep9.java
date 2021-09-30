// Will Kessner
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Random;

public class Sep9 {
    static Scanner readin = new Scanner(System.in);
    static String errormsg = "Something went wrong, you should not be reaching this point. Please check the source file for errors.";
    static DecimalFormat cutZeros = new DecimalFormat("0");

    public static void main(String[] args) {
        cutZeros.setMaximumFractionDigits(340);
        twoIntProcessor();
        twoDoubleProcessor();
        intDigitSum();
        readin.close();
    }
    public static void twoIntProcessor() {
        System.out.println("Please input two integers, hitting enter after each number:");
        int i1 = readin.nextInt();
        int i2 = readin.nextInt();
        String i1State = "";
        String i2State = "";
        if ((i1 % 2) == 1){
            i1State = "odd";
        } else if ((i1 % 2) == 0){
            i1State = "even";
        } else {
            System.out.println(errormsg);
        }
        if ((i2 % 2) == 1){
            i2State = "odd";
        } else if ((i2 % 2) == 0){
            i2State = "even";
        } else {
            System.out.println(errormsg);
        }
        float iAverage = ((float)i1 + i2) / 2;
        int iQuotient = Math.round(i1 % i2);
        System.out.printf("You entered the numbers %d and %d.%n%d is %s and %d is %s.%nThe average of the two numbers is %s, and their quotient is %d.%n", i1, i2, i1, i1State, i2, i2State, cutZeros.format(iAverage), iQuotient);
    }
    public static void twoDoubleProcessor() {
        System.out.println("\nPlease input two doubles, hitting enter after each number:");
        double d1 = readin.nextDouble();
        double d2 = readin.nextDouble();
        double dAvg = (d1 + d2) / 2;
        double dSpecialRound = Math.floor(dAvg+0.7);
        System.out.printf("You entered the numbers %s and %s.%nTheir average is %s, which is %s special rounded.%n", cutZeros.format(d1), cutZeros.format(d2), cutZeros.format(dAvg), cutZeros.format(dSpecialRound));
    }
    public static void intDigitSum() {
        Random rand = new Random();
        int i3Dig = rand.nextInt(900) + 100;
        String str3Dig = String.valueOf(i3Dig);
        int sumOf3Dig = Character.getNumericValue(str3Dig.charAt(0)) + Character.getNumericValue(str3Dig.charAt(1)) + Character.getNumericValue(str3Dig.charAt(2));
        System.out.printf("%nThe three digit int generated was %d, the sum of whose digits is %d.%n", i3Dig, sumOf3Dig);
    }
}
