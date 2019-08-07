package step1;              // �ϳ��� ���丮(����) ����

import java.util.*;			// ����� Ŭ������ ��Ű���� ���� ������ �̸� �����ϴ� ����


public class Board {		// �������� Ŭ������ �� �� �ϳ��� ��ǥ Ŭ���� ����(���� ��� ���ƾ� ��)
	
	public static double getA(double x1, double y1, double x2, double y2) {
							// ���� �׻� ������ �ʴ� ��� �޸� �Ҵ��� �� ���� ���ִ� ����
		return (y2 - y1)/ (x2 - x1);
	}						// Ŭ�������� �޼ҵ尡 ����ǰ� ���� ȣ���� ������ �����޴� ����
							// (return ��ɾ� �ڿ� ��ȯ�ϰ��� �ϴ� �� �Ǵ� ������ ����)
							// �޼ҵ� ���� �� Ư�� ���ǿ� ���� �ش� �޼ҵ��� ������ ���߰� ���������� ����
							// (return;�� ����)
	
	public static double getB(double a, double x, double y) {
		return (y- a*x);
	}
	
	public static void main(String[] args) {
							// public�� ����������(�ܺο��� �����Ҽ� �ִ� ������ ����)
							// ������ ���� ������� private > protected > public
							// public�� ��𼭳� ��� �� ������ ����
							// protected�� ���� ��Ű���� ���� Ȥ�� �� Ŭ������ ����� Ŭ���������� ������ ���
							// private�� ���� �� Ŭ������ �����ϰ� �ִ� Ŭ���� ���ο����� ��� �� ������ ���
		
							// static��  ���� �Լ�
							// local�� ������ ��� �ٸ� ���鿡���� ��� �� �� �ִ�(����)��  �ǹ�
							
							// void�� ��� �޼ҵ忡 return ���� ���ٴ� �ǹ�
		
							// main���������� ����
							// main ��ü�� ���α׷��� ���۰� ��, �׷��� ��ȯ���� ���� void�� �ʿ�
							
							// String[] args�� �޸𸮿� ������ ������ �̸� ������ �δ� ��
		
		int[][] board = new int[30][30]; 
							// �޸� ������ ���� ������ �� �ִ� ����
							// ������ ����(����ϰڴ�) > ����(���� ������) > ���
		
		for(int c = 0; c < board.length; c++) {
			for(int d = 0; d <board[c].length; d++) {
				board[c][d] = 0;
			}
		}
							// for��(�ݺ���),��Ģ�� ������ ���� �ݺ��ϰ� ���ִ� ����
		
		Scanner scan = new Scanner(System.in);
							// ����(int), �Ǽ�(double)���� �⺻���� ������ Ÿ�� �Է��� �޴� ����
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
							// nextInt, �������� �޾ƿ��� ����
	
		
		//int x1 = 3, y1 = 3;
		//int x2 = 15 , y2 = 25;
		
		double a = getA(x1, y1, x2, y2);
		double b = getB(a, x1, y1);
		
		
		for(int x = 0; x < board.length; x++) {
			int y = (int)(a * x + b);

			if (y < 0 || x < x1 || x > x2 || y < y1 || y > y2 || y >= board.length ) {
				continue;	// continue, for�� �������� ���� �� ������, �ݺ��� ����Ǵ� ���� continue�� ������
							// ���� �ݺ����� �Ѿ��
			}
			
		}
		
		for(int y = 0; y < board.length; y++) {
			int x = (int)((y - b) / a);
			
			if (y < 0 || x < x1 || x > x2 || y < y1 || y > y2 || y >= board.length ) {
				continue;
			}
			
			board[y][x] = 1;
		}
		
		
		// prinat all values in array board
		for(int c = 0; c < board.length; c++) {
			for(int d = 0; d < board[c].length; d++) {
				System.out.print(board[c][d] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();	// JAVA ǥ�� ����� ����
	}							// System.out.println() �����͸� ����� �Ŀ� �� �ٲ�
}		
		
		/*
		int[][] numbers = new int[10][10];
		
		for(int p = 0;p < 11;p += 1) {
			for(int i = 0; i< 11; i++) {
				numbers[p][i] = 0;
			}
		}
		numbers[0][0] = 1;
		numbers[1][1] = 1;
		numbers[2][2] = 1;
		numbers[3][3] = 1;
		numbers[4][4] = 1;
		numbers[5][5] = 1;
		numbers[6][6] = 1;
		numbers[7][7] = 1;
		numbers[8][8] = 1;
		numbers[9][9] = 1;
		numbers[10][10] = 1;
		
		
		numbers[0][10] = 1;
		numbers[1][9] = 1;
		numbers[2][8] = 1;
		numbers[3][7] = 1;
		numbers[4][6] = 1;
		numbers[5][5] = 1;
		numbers[6][4] = 1;
		numbers[7][3] = 1;
		numbers[8][2] = 1;
		numbers[9][1] = 1;
		numbers[10][0] = 1;
		
		
		for(int p = 0;p < 11;p += 1) {
			for(int i = 0; i< 11; i++) {
				System.out.print(numbers[p][i]);
			}
			System.out.println();
			
		}
	}
}
*/