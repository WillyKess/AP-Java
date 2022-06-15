class Main {
    public static void main(String[] args) {
          // use initializer list to create the magic square as follows:
          // 16,3,2,13
          // 5,10,11,8
          // 9,6,7,12
          // 4,15,14,1
          int[][] magic = {{16,3,2,13},{5,10,11,8}, {9,6,7,12},{4,15,14,1}};



          // create an instance of the MagicSquare class, call it a.
          MagicSquare a = new MagicSquare(magic);

          System.out.println(a.rowSum(0)); // 34
          // similarly test colSum, diagSums and exactlyOnce
            System.out.println(a.colSum(0)); // 34
            System.out.println(a.diagSums(34)); // true
            System.out.println(a.exactlyOnce()); // true
          // feel free to modify the above 2d array temporarily to test.


          // print out the result of calling isMagic on the instance above.
          // Should print true if done correctly.

          System.out.println(a.isMagic());
    }
  }