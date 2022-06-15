public class Coin {
	private boolean face;
	private int numFlip;

	public Coin() {
		face = true;
		numFlip = 0;
	}

	public boolean getFace() {
		return face;
	}

	public int getNumFlip() {
		return numFlip;
	}

	public boolean isHeads() {
		return face;
	}

	public void flip() {
		face = !face;
		numFlip++;
	}

	public void randomFlip(int num) {
		for (int i = 0; i < num; i++) {
			flip();
		}
	}
}