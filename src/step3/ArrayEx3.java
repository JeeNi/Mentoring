package step3;

import java.util.*;

public class ArrayEx3 {
//	
//	
//	// �� ���� ������ board�� ������ �׸���.
//	private static int drawLineA(int x1, int y1, int x2, int y2, int[][] board) {
//		// a ���� ���Ѵ�.
//		double a = calculateA(x1, y1, x2, y2); // ���� 
//		
//		// b���� ���Ѵ�.
//		double b = y1 - (a * x1); // ������
//		
//		// ������ ���Ѵ�.
//		
//		// a, b�� ������ ���� �׸���.
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
	   
	   
	   // i �� j�� �ٲ㼭 ��µ�, ù�� ° for������ j�� ������ ������ �ؼ� �� �� ���ٰ� ������ ���� i�� ����
	   for (int i = 0; i < numbers[i].length; i++) {    
		   for(int j = 0; j < numbers.length; j++) {
			   System.out.print(numbers[j][i] + " ");
		   }
		   System.out.println();  // ���� > ���η� ����� �Ǵµ� 1�� ��ġ�� �̻�
	   }// 90���� ȸ�� ��Ű���� ��� �ϳ���?
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
//      printBoard(board); //��� ���� �� ��ڴ�
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