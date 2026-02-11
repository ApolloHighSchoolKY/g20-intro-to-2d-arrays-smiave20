import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    //Within one Array, there are [3] other Arrays with [5] positions in them.
    int[][] twoDee = new int[3][5];

    /*
    twoDee [0] = 1;
    twoDee [1] = 2;
    twoDee [3] = 3;
    twoDee [4] = 4;
    */
    int val = 0;

    //Store incremental values in Row Major Order
    //Take first row, read columns.
    for(int row = 0; row < twoDee.length; row++)
    {
      for(int col = 0; col < twoDee[row].length; col++)
          twoDee[row][col] = val;
          val++;
    }
      //This spot here represents the completion of one row.
      System.out.println(Arrays.toString(twoDee[row]));

      //Print out the total sum of each row in the following formate:
      //Row 0: 15
      //Row 1: 40

      int sum = 0;

      for(int row = 0; row < twoDee.length; row++)
      {
        for(int col = 0; col < twoDee[row].length; col++)
          //Reading the rows in the columns (left to right)
          twoDee[row][col] = val;
          sum = twoDee[row][col];
      }
        System.out.println("Row " + row + ":" + sum);
    
        //Print out the sum of each column in the following formate:
        //Column 0: ??....
    
        int total = 0;

      for(int row = 0; row < twoDee.length; row++)
      {
        for(int col = 0; col < twoDee[row].length; col++)
          //Reading the columns in the rows (vertically-- up to down)
          twoDee[col][row] = val;
          total = twoDee[col][row];
      }
        System.out.println("Column " + col + ":" + total);
    }
}
