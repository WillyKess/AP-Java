// Sorry this is late!
// To run this, start it by typing ./launch.sh in the REPLIT terminal.
// I would take the input as a scanner, but the assignment specifies an argument so I did that instead.
// It also has the functionality to check for Ramanujan numbers in all ints <= the input, but this takes a while to run for 87539319 so it's disabled
// by default.

public class Unit4Proj3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = 0;
        // System.out.println("Checking for Ramanujan numbers between 1 and " + n);
        // Comment lines 11, 13, 14, and 17 and uncomment line 15 to run just for the provided number, instead of all numbers less than or equal to it.
        for (int i = 1; i < n; i++) {
            m = i;
            // m = n;
            ramanujan(m);
        }
    }

    public static void ramanujan(int m) {
        int maxcube = (int) Math.round(Math.cbrt(m));
        int res1 = 0, res2 = 0, res3 = 0, res4 = 0;
        for (int i = 1; i <= maxcube; i++) {
            for (int j = 1; j <= maxcube; j++) {
                if (((i * i * i) + (j * j * j)) == m) {
                    res1 = i;
                    res2 = j;
                    break;
                }
            }
        }
        for (int k = 1; k <= maxcube; k++) {
            for (int l = 1; l <= maxcube; l++) {
                if (k == res1 || k == res2 || l == res1 || l == res2)
                    continue;
                if (((k * k * k) + (l * l * l)) == m) {
                    res3 = k;
                    res4 = l;
                    break;
                }
            }
        }
        if (((res1 * res1 * res1) + (res2 * res2 * res2) == m) && ((res3 * res3 * res3) + (res4 * res4 * res4) == m)) {
            System.out.printf("%d is representable as the sums of two different sets of two cubes!%nThese values are %d, %d, and %d, %d.%n", m, res1, res2, res3, res4);
        }
    }
}

/*
Verify this claim by writing a program Ramanujan.java that takes an integer command-line argument n and prints all integers less than or equal to n that can be expressed as the sum of two cubes in two different ways - find distinct positive integers a, b, c, and d such that a3 + b3 = c3 + d3. Use four nested for loops. 
Now, the license plate 87539319 seems like a rather dull number. Determine why it's not. 
*/
