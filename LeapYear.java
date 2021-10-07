import java.util.Scanner; // normal

public class LeapYear {
  public static void main(String[] args) {
    System.out.println("Please enter the year you wish to compute:");
    // int testYear[] = {1600, 2020, 400, 2021, 1800} ; //test
    String leapOut;
    // int year; //test
    // for (int i : testYear) { //test
    // year = i; //test
    Scanner readin = new Scanner(System.in); // normal
    int year = readin.nextInt(); // normal
    readin.close(); // normal
    boolean isLeap = (year != 400) && ((year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0)));
    if (isLeap) {
      leapOut = "is";
    } else {
      leapOut = "is not";
    }
    System.out.printf("The year %d %s a leap year.%n", year, leapOut);
    // } //test
  }
}
// The tests run correctly, with 1600 and 2020 being a leap year and the other
// three coming back false.
// To run the tests, uncomment all the lines ending in '//test' and comment all
// those ending in '//normal'.
