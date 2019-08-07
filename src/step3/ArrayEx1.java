package step3;

import java.util.*;

public class ArrayEx1 {
   public static void main(String[] arg) {
      
      Scanner scan = new Scanner(System.in);
      
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      
      int[][] board = new int[a][b];
   
      for(int i = 0; i < board.length; i++) {
         for(int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + " ");
         }
         System.out.println();
      }      
   }      
}
