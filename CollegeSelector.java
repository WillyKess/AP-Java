import java.util.Scanner;
public class CollegeSelector {
    static Scanner readin = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int tierNo = -1031;
            int largeOrSmall = -1031;
            int eastOrWest = -1031;

            // This section keeps asking for the numbers until they are properly given, and allows accidental non-numerical characters too.
            // I use compound boolean expressions here, but I don't use them for the core funcionality so I have completed the assignment without using them.
            while (!(tierNo==1||tierNo==2)) {
                if (!(tierNo==1||tierNo==2||tierNo==-1031)) {
                    System.out.println("Please enter only 1 or 2!");
                } else {
                    System.out.println("\nWould you like a tier 1 or 2 school?");
                }
                try {
                    tierNo = readin.nextInt();
                } catch (RuntimeException e) {
                    readin.reset();
                    readin.next();
                }
            }
            while (!(largeOrSmall==1||largeOrSmall==2)) {
                if (!(largeOrSmall==1||largeOrSmall==2||largeOrSmall==-1031)) {
                    System.out.println("Please enter only 1 or 2!");
                } else {
                    System.out.println("\nWould you like a large (1) or small (2) school?");
                }
                try {
                    largeOrSmall = readin.nextInt();
                } catch (RuntimeException e) {
                    readin.reset();
                    readin.next();
                }
            }
            while (!(eastOrWest==1||eastOrWest==2)) {
                if (!(eastOrWest==1||eastOrWest==2||eastOrWest==-1031)) {
                    System.out.println("Please enter only 1 or 2!");
                } else {
                    System.out.println("\nWould you like a school in the east (1) or west (2)?");
                }
                try {
                    eastOrWest = readin.nextInt();
                } catch (RuntimeException e) {
                    readin.reset();
                    readin.next();
                }
            }

            String recommendation = "";
            if (tierNo == 1) {
                if (largeOrSmall == 1) {
                    if (eastOrWest == 1) {
                        recommendation = "Penn State";
                    } else {
                        recommendation = "University of Wisconsin";
                    }
                } else {
                    if (eastOrWest == 1) {
                        recommendation = "MIT";
                    } else {
                        recommendation = "Harvey Mudd";
                    }
                }
            } else {
                if (largeOrSmall == 1) {
                    if (eastOrWest == 1) {
                        recommendation = "Syracuse";
                    } else {
                        recommendation = "University of Oregon";
                    }
                } else {
                    if (eastOrWest == 1) {
                        recommendation = "Capital University";
                    } else {
                        recommendation = "Denver University";
                    }
                }
            }

            String size = "";
            String location = "";
            if (largeOrSmall == 1) {
                size = "large";
            } else {
                size = "small";
            }
            if (eastOrWest == 1) {
                location = "east";
            } else {
                location = "west";
            }

            System.out.printf("%n%s satisfies your requirements. It is a %s tier %d school that is located in the %s.%n%n", recommendation, size, tierNo, location);
        }
    }
}