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

		
		
//		���� i�� ���� ��µ� ���� ��ġ, ���� j�� ���� ��µ� �࿡���� ��ġ
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
			// ��ĭ�� � ��ڴ�!!
			for (int j = 0; j < n-1; j++) {
				
			}
			
			
			for(int j = n - 1; j > i; j--) {
				System.out.print(" " + " ");
			}
			
			// ���� � ��ڴ�!!
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i = 0; i < n; i++) {
			
			// ������ ĭ�� -���� ���� ��ŭ ��ĭ�� ä�� 
			// �� ���� �� ��ŭ ��ĭ�� ��´�. 
			for(int j = 0; j < i; j++) {
				System.out.print(" " + " ");
			}
			
			// ������ ĭ�� - �� ��ȣ��ŭ ���� ä��
			for(int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}			
			System.out.println();
		}
		System.out.println();
		
		
		// �� �ĸ��̵� 
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
//		// �� �Ƕ�̵�
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
//	                                      // i = 4 --> j�� 4���� �����Ͽ� i���� Ŭ������ - ��Ű�µ� 4�� j�� �����Ƿ� ����
//
//	            System.out.print(" ");
//
//	        }
//
//	        for (int k = 1; k <= i*2 + 1; k++) {//k�� 1���� ����
//
//	            System.out.print("*"); //  i ��  0 -->0*2+1 1 1  =         1 
//
//	                                    // i �� 1 -->1*2+1  3 3 <=       1,2,3
//
//	                                    // i �� 2 -->2*2+1  5 5 <=     1,2,3,4,5
//
//	                                    // i �� 3 -->3*2+1  7 7 <=   1,2,3,4,5,6,7
//
//	                                    // i �� 4 -->4*2+1  9 9 <= 1,2,3,4,5,6,7,8,9
//
//	                                }
//
//	        System.out.println("---");
//
//	    }
//
//	    
//
//	        for (int i = 0; i < 4; i++) {//4�ٸ� �ʿ��ϹǷ� i�� 5���ƴ϶� 4���� �۾ƾ��Ѵ�
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

