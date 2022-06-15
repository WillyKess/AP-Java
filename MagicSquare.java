public class MagicSquare{
    private int[][] square; // n x n 2D array
    private int n; // number of rows(or columns) of square

    public MagicSquare(int[][] a){
        square = a;
        n = square.length;
    }

    public int rowSum(int r){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += square[r][i];
        }
        return sum;
    }

    public int colSum(int c){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += square[i][c];
        }
        return sum;
    }

    public boolean diagSums(int sum){
        int major = 0;
        int minor = 0;
        for(int i = 0; i < n; i++){
            major += square[i][i];
            minor += square[i][n-1-i];
        }
        return major == minor && minor == sum;
    }
    /**
    Precondition: Values of square is in range 1 to n^2.
    Returns true if the numbers 1 to n^2 occurs exactly once in square and false otherwise.
    n is the number of rows(and columns) in square.  Hint: Use a tally array discussed in the array algorithm lecture.
    MUST USE ONLY FOR EACH LOOPS!!
    */
    public boolean exactlyOnce(){
        int[] tally = new int[n*n+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tally[square[i][j]]++;
            }
        }
        for(int i = 1; i < n*n+1; i++){
            if(tally[i] != 1){
                return false;
            }
        }
        return true;
    }

    public boolean isMagic(){
        return exactlyOnce() && diagSums(rowSum(0)) && diagSums(colSum(0));
    }
}