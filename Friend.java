public class Friend {
    private String name;
    private int level;

    public Friend() {
        name = "blank";
        level = 0;
    }

    public Friend(String inName) {
        name = inName;
        level = 0;
    }

    public Friend(int inLevel) {
        name = "blank";
        level = inLevel;
    }

    public Friend(String inName, int inLevel) {
        name = inName;
        level = inLevel;
    }

    public String toString() {
        // String[] levelstrings = { "Acquaintance", "Good", "Great", "Ultra", "Best" };
        // String levelstring = levelstrings[level];
        return (name + ": " + level + " ");
        // return (name + ": " + levelstring + " ");
    }

    public void improveFS() {
        if (level < 4) {
            level++;
        }
    }

    public int getFriendshipLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
