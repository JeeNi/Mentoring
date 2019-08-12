package step1;


import java.util.*;

public class Age {
	public static void main(String[] args) {
		// v사용자로부터 입력을 받는다.
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// input > 20
		if (input > 20) {
			System.out.println("청년입니다.");	
		} else {
			System.out.println("청소년입니다.");
		}
			
	
		// TODO 심리 테스트 만들기
		// 
		
		System.out.println("당신이 입력한 값은" + input + "입니다.");

	}

}

