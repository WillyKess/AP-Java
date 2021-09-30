import java.util.Random;

public class CarInsurance {
    static Random rand = new Random();
    public static void main(String[] args) {
        // /*
        int age = rand.nextInt(10) + 14;
        double gpa = rand.nextDouble()*4;
        if (gpa < 2.5) {
            gpa++; // Increase the average GPA to make it slightly more realistic
        }
        if (gpa > 3.0) {
            if (age > 16) {
                System.out.printf("You are %d years old, and your GPA is %.2f, so you will get a 10%% discount on your insurance.%n", age, gpa);
            }
            else {
                System.out.printf("You are %d years old, and your GPA is %.2f, so you will get a 10%% discount on your insurance when you start driving.%n", age, gpa);
            }
        }
        else {
            if (age > 16) {
                System.out.printf("You are %d years old, and your GPA is %.2f, so you will get a 20%% surcharge on your insurance.%n", age, gpa);
            }
            else {
                System.out.printf("You are %d years old, and your GPA is %.2f, so you will get a 20%% surcharge on your insurance when you start driving. Remember to work hard!%n", age, gpa);
            }
        }
        // */
        /*
        // I prefer this way of doing the problem rather than the one above, because this doesn't need multiple print statements and is pretty effecient. But the assignment says use nested if statements, so that's done above.
        String priceAdjustment;
        String notYetDrivingMSG = "";
        int age = rand.nextInt(10) + 14;
        double gpa = rand.nextDouble()*4;
        if (gpa < 2.5) {
            gpa++; // Increase the average GPA to make it slightly more realistic
        }
        if (gpa > 3.0) {
            priceAdjustment = "10% discount";
        } else {
            priceAdjustment = "20% surcharge";
        }
        if (age > 16) {
            notYetDrivingMSG = " when you start driving";
        }
        System.out.printf("You are %d years old, and your GPA is %.2f, so you will get a %s on your car insurance%s.%n", age, gpa, priceAdjustment, notYetDrivingMSG);
        */
    }
}