import java.util.Scanner;

public class Unit3FRQ {
    public static Scanner readin = new Scanner(System.in);

    public static void main(String[] args) {
        int time = readin.nextInt();
        int grade = readin.nextInt();
        lunchCheckPoint(time, grade);
    }

    public static void lunchCheckPoint(int time, int grade) {
        boolean guiltytime = (time > 1200);
        boolean guiltygrade = (!(grade % 2 == 0));
        String consequence = "";
        if (!guiltytime && !guiltygrade) {
            consequence = "None";
        } else if (guiltytime && guiltygrade) {
            consequence = "Revoke parking permit and lunch detention";
        } else if (guiltytime) {
            consequence = "Lunch detention";
        } else if (guiltygrade) {
            consequence = "Revoke parking permit";
        }
        System.out.printf("%nTime: %d%nGrade: %d%nConsequence: %s", time, grade, consequence);
    }
}
