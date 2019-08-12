package step4;

import java.util.*;

public class LoopEx {

	public static void main(String[] args) {
		
//		int n = 1;
//		
//		for(int i = n; i < 4; i++) {
//			for(int j = n; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + (i*j));
//			}
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();
		System.out.println();

		
		
//		변수 i는 별이 출력된 줄의 위치, 변수 j는 별이 출력된 행에서의 위치
		for(int i = 0; i < n; i++) {			
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();	
		}
		System.out.println();
		
		
		
		for(int i = 0; i < n; i++ ) {
			for(int j = n; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		for(int i = 0; i < n; i++) {
			// 빈칸을 몇개 찍겠다!!
			for (int j = 0; j < n-1; j++) {
				
			}
			
			
			for(int j = n - 1; j > i; j--) {
				System.out.print(" " + " ");
			}
			
			// 별을 몇개 찍겠다!!
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i = 0; i < n; i++) {
			
			// 가능한 칸수 -별의 갯수 만큼 빈칸을 채움 
			// 행 번수 수 만큼 빈칸을 찍는다. 
			for(int j = 0; j < i; j++) {
				System.out.print(" " + " ");
			}
			
			// 가능한 칸수 - 행 번호만큼 별을 채움
			for(int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}			
			System.out.println();
		}
		System.out.println();
		
		
		// 정 파리미드 
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i * 2 + 1; j++) { 
				System.out.print("*" + " "); 
			} 
			System.out.println();
		}
//		System.out.println();
//		
//		
//		
//		// 역 피라미드
//		System.out.println("");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" " + " ");
			}
			for(int j = n + 4; j >= i * 2 + 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(" " + " ");
//			}
//			for(int j = 1; j <= i * 2 + 1; j++) {
//				System.out.print("*" + " ");
//			}
//		}
//			
//			for(int k = 0; k < n - 1; k++) {
//				for(int j = 0; j <= k; j++) {
//					System.out.print(" " + " ");
//				}
//			for(int j = n + 3; j >= k * 2 + 1; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for (int i = 0; i < n; i++) {
//
//	        for (int j = n - 1; j > i; j--) { // i = 0 j = 4,3,2,1
//
//	                                      // i = 1 j = 4,3,2
//
//	                                      // i = 2 j = 4,3
//
//	                                      // i = 3 j = 4
//
//	                                      // i = 4 --> j는 4부터 시작하여 i보다 클때까지 - 시키는데 4는 j와 같으므로 제외
//
//	            System.out.print(" ");
//
//	        }
//
//	        for (int k = 1; k <= i*2 + 1; k++) {//k는 1부터 시작
//
//	            System.out.print("*"); //  i 가  0 -->0*2+1 1 1  =         1 
//
//	                                    // i 가 1 -->1*2+1  3 3 <=       1,2,3
//
//	                                    // i 가 2 -->2*2+1  5 5 <=     1,2,3,4,5
//
//	                                    // i 가 3 -->3*2+1  7 7 <=   1,2,3,4,5,6,7
//
//	                                    // i 가 4 -->4*2+1  9 9 <= 1,2,3,4,5,6,7,8,9
//
//	                                }
//
//	        System.out.println("---");
//
//	    }
//
//	    
//
//	        for (int i = 0; i < 4; i++) {//4줄만 필요하므로 i는 5가아니라 4보다 작아야한다
//
//	            for (int j = 0; j <= i; j++) {// i = 0 j = 0 -->0
//
//	                                          // i = 1 j = 1 -->0,1
//
//	                                          // i = 2 j = 2 -->0,1,2
//
//	                                          // i = 3 j = 3 -->0,1,2,3 
//
//	                System.out.print(" ");
//
//	            }
//
//	            for (int k = 7 ; k >= i*2+1; k--) {// 0*2+1 1 = 7654321 
//
//	                                               // 1*2+1 3 =  76543
//
//	                                               // 2*2+1 5 =   765
//
//	                                               // 3*2+1 7 =    7
//
//	 
//
//	                System.out.print("*");
//
//	            }
//
//	            System.out.println();
//
//	        }

	}
}

