package step4;

import java.util.Scanner;

public class LoopEx1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int n = 5;

		// �� �� ���
		for(int i = 0; i < n; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();
		
		// ���� �ﰢ�� ���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// ���� �ﰢ�� ������ ���
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		// ������ �ﰢ�� ���
		for(int i = 0; i < n; i++) {
			for(int j = n -1; j > i; j--) {
				System.out.print(" " + " ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
//		
		// ������ �ﰢ�� ������ ���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" " + " ");
			}
			for(int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// �� �Ƕ�̵� ���
		for(int i = 0; i < n; i++) {
			for(int j = n -1; j > i; j--) {
				System.out.print(" " + " ");
			}
			for(int j = 1; j <= i * 2 + 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// �� �Ƕ�̵� ���
//		for(int i = 0; i < n; i++) {
//			for(int j = n + 4; j >= i * 2 + 1; j--) {
//				System.out.print("*" + " ");
//			}
//			for(int j = 0; j < i; j++) {
//				System.out.print(" " + " ");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" " + " ");
//			}
//			for(int j = n + 4; j >= i * 2 + 1; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" " + " ");
			}
			for(int j = n + 4; j >= i * 2 + 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
