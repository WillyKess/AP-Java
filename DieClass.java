public class DieClass {
    private int totalFaces;
    private int currentFace = 1;

    public DieClass() {
        totalFaces = 6;
    }

    public DieClass(int totalFaceNum) {
        totalFaces = totalFaceNum;
    }

    public int getFace() {
        return currentFace;
    }

    public int getTotalFaces() {
        return totalFaces;
    }

    public void roll() {
        currentFace = (int) ((Math.random() * (totalFaces)) + 1);
    }
}
