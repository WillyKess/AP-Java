class G {

    private int x;

    public G() {
        x = 3;
    }

    public void setX(int val) {
        x = val;
    }

    public String toString() {
        return "" + x;
    }
}

class H extends G {

    private int y;

    public H() {
        y = 4;
    }

    public void setY(int val) {
        y = val;
    }

    public String toString() {
        return "" + y + " " + super.toString();
    }
}