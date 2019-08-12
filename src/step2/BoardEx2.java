package step2;

import java.util.*;

public class BoardEx2 {
	
	public static double getA (Point p1, Point p2) {
		return (p2.y - p1.y)/ (p2.x - p1.x); 
	}
	
	public static double getB (double a, Point p) {
		return (p.y - a * p.x);
	}

	static public Point getPoint(Scanner scan) {		

		Point p = new Point();
		System.out.print("x ��ǥ: ");
		p.x = scan.nextInt();
		System.out.print("y ��ǥ: ");
		p.y = scan.nextInt();
		
		
		
		return p;
	}
	
	

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int [][] board = new int [20][20];
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
			//System.out.println((i + 1) + "�� °: "); //ù �� �Է� �Ŀ�, ���� �� ���ڵ� ~�� °�� �� �� �ְ�
		}
		
		
		
		System.out.println("���ڸ� �Է��� �ּ���.");
		// ����ڷκ��� ��ǥ �ϳ��� �Է� �޴´�.
		Point p1 = getPoint(scan);
		Point p2 = getPoint(scan);
		
		System.out.println("���� �� ���ڸ� �Է��� �ּ���.");
		
		Point p3 = getPoint(scan);
		Point p4 = getPoint(scan);
			
		
		// LineEquation
		double a = getA(p1, p2);
		double b = getB(a, p1);
		
		double c = getA(p3, p4);
		double d = getB(c, p3);
		
		
		Bound bound = new Bound(p1, p2);
		
		for(int x = 0; x < board.length; x++) {
			int y = (int)(a * x + b);
			Point p = new Point(x, y);
			
			if(y < 0  || y >= board.length || !bound.contains(p)) {
				continue;
			}
			
			board [y][x] = 1;
		}
	
		
		for(int y = 0; y < board.length; y++) {
			int x = (int) ((y - b) / a);
			Point p = new Point(x, y);
			if(y < 0 || y >= board.length || !bound.contains(p)) {
				continue;
			}
			board [y][x] = 1;
		}
		
		
		Bound b2 = new Bound(p3, p4);
		
		for(int x = 0; x < board.length; x++) {
			int y = (int)(c * x + d);
			Point p = new Point(x, y);
			
			if(y < 0 || y >= board.length || !bound.contains(p)) {
				continue;
			}
			
			board [y][x] = 1;
		}
		
		for(int y = 0; y < board.length; y++) {
			int x = (int) ((y - d) / c);
			Point p = new Point(x, y);
			
			
			if(y < 0 || y >= board.length || !bound.contains(p)) {
				continue;
			}
			
			board [y][x] = 1;
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " " );
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
