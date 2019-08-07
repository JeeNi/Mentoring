package step3;

import java.util.Scanner;

public class ArrayEx2 {
   public static void main(String[] arg) {
      
      Scanner scan = new Scanner(System.in);
      
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      int c = scan.nextInt();
      int d = scan.nextInt();
      
      
      int[][] board = new int[a][b];
  
   
      for(int i = 0; i < board.length; i++) {
         for(int j = 0; j < board[i].length; j++) {
        	 if(i == c && j == d) {
        		 System.out.print(1 + " ");        		 
        	 }
        	 else {
        		 System.out.print(0 + " ");
        	 }
         }
         System.out.println();
      }
   }      
}