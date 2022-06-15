import java.io.File;
import java.util.Scanner;

class GameOfLife {

 public static void main(String[] args) {
      int[][] life=readLife("lifeData.txt");
      display(life);
      for(int i=0; i<5; i++){
        life=nextGeneration(life);
        display(life);
      }
      System.out.println("Number of living cells in the entire board: "+countLiving(life));
      System.out.println("Number of living cells in row 10: "+countLivingInRow(life, 10));
      System.out.println("Number of living cells in column 10: "+countLivingInColumn(life, 10));
      }
  public static int[][] nextGeneration(int[][] life){
        int[][] total = new int[20][20];
        for(int row=0; row<life.length; row++){
          for(int col=0; col<life[0].length; col++){
            int numNeighbors=countNeighbors(life, row, col);
            if(life[row][col]==1){
              if(numNeighbors<2 || numNeighbors>3){
                total[row][col]=0;
              }
              else{
                total[row][col]=1;
              }
            }
            else{
              if(numNeighbors==3){
                total[row][col]=1;
              }
              else{
                total[row][col]=0;
              }
            }
          }
        }
        return total;
      }
      public static int countNeighbors(int[][] life, int row, int col){
        int total=0;
        for(int i=row-1; i<=row+1; i++){
          for(int j=col-1; j<=col+1; j++){
            if(i>=0 && i<life.length && j>=0 && j<life[0].length){
              if(i!=row || j!=col){
                total+=life[i][j];
              }
            }
          }
        }
        return total;
      }
      public static int countLiving(int[][] life){
        int total=0;
        for(int row=0; row<life.length; row++){
          for(int col=0; col<life[0].length; col++){
            if(life[row][col]==1){
              total++;
            }
          }
        }
        return total;
      }
      public static int countLivingInRow(int[][] life, int row){
        int total=0;
        row--;
        for(int col=0; col<life[row].length; col++){
          if(life[row][col]==1){
            total++;
          }
        }
        return total;
      }
      public static int countLivingInColumn(int[][] life, int col){
        int total=0;
        col--;
        for(int row=0; row<life.length; row++){
          if(life[row][col]==1){
            total++;
          }
        }
        return total;
      }

public static void display(int[][] theArray){
   for(int row=0; row<theArray.length; row++){
     for(int col=0; col<theArray[0].length; col++){
       System.out.print(theArray[row][col]+" ");
     }
     System.out.println();
   }
   System.out.println();

}

public static int[][] readLife(String fileName){
   int[][] toReturn = new int[20][20];
   System.out.println("Reading life from Java code...\n");
   try {
     File file = new File(fileName);
     Scanner in = new Scanner(file);
     // Read file line by line and print on the console

     while(in.hasNext()) {
       int row=in.nextInt();
       int col=in.nextInt();
       toReturn[row-1][col-1]=1;
     }
     in.close();
     // Close the buffer reader
   } catch (Exception e) {
     System.out.println("Error while reading file line by line:" + e.getMessage());
   }
   return toReturn;
 }
}
