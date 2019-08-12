package step1;              // 하나의 디렉토리(폴더) 역할

import java.util.*;			// 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할


public class Board {		// 여러개의 클래스를 중 단 하나의 대표 클래스 역할(파일 명과 같아야 함)
	
	public static double getA(double x1, double y1, double x2, double y2) {
							// 값이 항상 변하지 않는 경우 메모리 할당을 한 번만 해주는 역할
		return (y2 - y1)/ (x2 - x1);
	}						// 클래스내의 메소드가 실행되고 값을 호출한 곳에서 돌려받는 역할
							// (return 명령어 뒤에 반환하고자 하는 값 또는 변수를 써줌)
							// 메소드 실행 중 특정 조건에 따라 해당 메소드의 진행을 멈추고 빠져나오는 역할
							// (return;만 써줌)
	
	public static double getB(double a, double x, double y) {
		return (y- a*x);
	}
	
	public static void main(String[] args) {
							// public은 접근제어자(외부에서 접근할수 있는 일종의 제약)
							// 제약이 강한 순서대로 private > protected > public
							// public은 어디서나 상속 및 참조가 가능
							// protected는 같은 패키지의 내부 혹은 이 클래스를 상속한 클래스에서만 접근을 허용
							// private는 오직 이 클래스를 포함하고 있는 클래스 내부에서만 상속 및 참조를 허용
		
							// static은  정적 함수
							// local의 범위를 벗어나 다른 곳들에서도 사용 할 수 있다(정적)는  의미
							
							// void의 경우 메소드에 return 값이 없다는 의미
		
							// main은시작점의 역할
							// main 자체가 프로그램의 시작과 끝, 그래서 반환값이 없는 void가 필요
							
							// String[] args은 메모리에 저장할 공간을 미리 선언해 두는 것
		
		int[][] board = new int[30][30]; 
							// 메모리 공간에 값을 저장할 수 있는 역할
							// 변수를 선언(사용하겠다) > 정의(값을 가진다) > 사용
		
		for(int c = 0; c < board.length; c++) {
			for(int d = 0; d <board[c].length; d++) {
				board[c][d] = 0;
			}
		}
							// for문(반복문),규칙을 가지고 쉽게 반복하게 해주는 역할
		
		Scanner scan = new Scanner(System.in);
							// 정수(int), 실수(double)등의 기본적인 데이터 타입 입력을 받는 역할
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
							// nextInt, 정수값을 받아오는 역할
	
		
		//int x1 = 3, y1 = 3;
		//int x2 = 15 , y2 = 25;
		
		double a = getA(x1, y1, x2, y2);
		double b = getB(a, x1, y1);
		
		
		for(int x = 0; x < board.length; x++) {
			int y = (int)(a * x + b);

			if (y < 0 || x < x1 || x > x2 || y < y1 || y > y2 || y >= board.length ) {
				continue;	// continue, for문 내에서만 사용될 수 있으며, 반복이 진행되는 도중 continue를 만나면
							// 다음 반복으로 넘어간다
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
		
		
		System.out.println();	// JAVA 표준 입출력 역할
	}							// System.out.println() 데이터를 출력한 후에 줄 바꿈
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