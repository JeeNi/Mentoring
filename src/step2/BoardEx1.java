package step2;

import java.util.*;

public class BoardEx1 { 
	public static void main(String[] args) {
		
		int [][] jeeni = new int [20][20];
		
		/*
		for(int i = 0; i < jeeni.length; i++) {
			for(int j = 0; j < jeeni[i].length; j++ ) {
				jeeni [i][j] = 0;
			}
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
	
		//System.out.printf("x1 = %d, y1 = %d\n", x1, y1);
		//System.out.printf("x2 = %d, y2 = %d\n", x2, y2);
		
		drawLine(x1, y1, x2, y2, jeeni);
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		int x4 = scan.nextInt();
		int y4 = scan.nextInt();
		
		drawLine(x3, y3, x4, y4, jeeni);
		printBoard(jeeni);

	}
	static private void printBoard(int [][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++ ) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static private void drawLine(int x1, int y1, int x2, int y2, int [][] board) {
		double a = getA(x1, y1, x2, y2);
		double b = getB(a, x1, y1);
		
		for(int x = 0; x < board.length; x++) {
			int y = (int)(a * x + b);
			
			int minx = Math.min(x1, x2);
			int maxx = Math.max(x1, x2);
			
			int miny = Math.min(y1, y2);
			int maxy = Math.max(y1, y2);

			if (y < miny || maxy < y ||
				x < 0 || board.length <= x || 
				x < minx || maxx < x ) 
			{
				continue;
			}
			board [y][x] = 1;
		}
		
		for(int y = 0; y < board.length; y++) {
			int x = (int)((y - b) / a);
			
			int minx = Math.min(x1, x2);
			int maxx = Math.max(x1, x2);
			
			int miny = Math.min(y1, y2);
			int maxy = Math.max(y1, y2);
			
			// x가 범위를 벗어나는지 확인
			if (x < minx || maxx < x ||
				y < 0 ||  board.length <= y  ||
				y < miny ||  maxy < y ) 
			{
				continue;
			}
			board [y][x] = 1;
		}
		
	}
	
	
	public static double getA (double x1, double y1, double x2, double y2) {
		return (y2 - y1)/ (x2 - x1);
	}
	
	public static double getB (double a, double x, double y) {
		return (y - a * x);
    }


}	

	
