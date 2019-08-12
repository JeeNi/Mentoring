package step3;

import java.util.*;

public class ArrayEx3 {
//	
//	
//	// 두 점을 가지고 board에 직선을 그린다.
//	private static int drawLineA(int x1, int y1, int x2, int y2, int[][] board) {
//		// a 값을 구한다.
//		double a = calculateA(x1, y1, x2, y2); // 기울기 
//		
//		// b값을 구한다.
//		double b = y1 - (a * x1); // 시작점
//		
//		// 범위를 구한다.
//		
//		// a, b를 가지고 선을 그린다.
//	}
//	
//	private static int calculateA(int x1, int y1, int x2, int y2) {
//		return (y2 - y1) / (x2 - x1);
//	}
//	
//	
//	private static void printBoard(int[][] board) {
////		return drawLineA;
//	}
//	
   public static void main(String[] arg) {
	   
	   int [][] numbers = 
			   
		   {
				   {0, 0, 0, 0},
				   {0, 0, 0, 0},
				   {0, 0, 1, 0},
				   {0, 0, 0, 0},
				   {0, 0, 0, 0},
				   {0, 0, 0, 0},
				   {0, 0, 0, 0}

		   };
	   
	   
	   // i 와 j를 바꿔서 썼는데, 첫번 째 for문에서 j를 넣으니 변수로 해석 될 수 없다고 오류가 떠서 i로 수정
	   for (int i = 0; i < numbers[i].length; i++) {    
		   for(int j = 0; j < numbers.length; j++) {
			   System.out.print(numbers[j][i] + " ");
		   }
		   System.out.println();  // 세로 > 가로로 출력은 되는데 1의 위치가 이상
	   }// 90도로 회전 시키려면 어떻게 하나요?
   }
}	   
      
//      Scanner scan = new Scanner(System.in);
//      
//      int a = scan.nextInt();
//      int b = scan.nextInt();
//      
//      int x1 = scan.nextInt();
//      int y1 = scan.nextInt();
//      
//      int x2 = scan.nextInt();
//      int y2 = scan.nextInt();
//      
//      int[][] board = new int[a][b];
//      
//      
//      
//      drawLineA (x1, y1, x2, y2, board);
//      printBoard(board); //모든 범위 다 찍겠다
//      
//      
//      
//   
//      for(int i = 0; i < board.length; i++) {
//         for(int j = 0; j < board[i].length; j++) {
//        		 System.out.print(0 + " ");
//         }
//      }
//      System.out.println();