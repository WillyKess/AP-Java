import java.util.Random;

public class Unit4Proj1 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int step = 0;
        String[] posVis = {"*|       | ", " |*      | ", " | *     | ", " |  *    | ", " |   *   | ", " |    *  | ", " |     * | ", " |      *| ", " |       |*"}; // A lot of weird spacing things to make the output consistent
        int posNo = 4;
        int distance = 4;
        System.out.println("\nStep          Graph      Position, Distance");
        System.out.println("-------------------------------------------");
        while (distance != 0) {
            posNo = rand.nextBoolean() ? ++posNo : --posNo; // Cool one liner
            distance = posNo > 4 ? 8 - posNo : posNo; // Gives the distance from the water, 0 meaning they fell off
            step++; // Nice little step counter
            String padding = step <= 9 ? " " : ""; // Hacky way to make the output look nice and have all of the lines align
            System.out.printf("(%d)       %s%s         [%d, %d]%n", step, padding, posVis[posNo], posNo, distance);
        }
    }
}
