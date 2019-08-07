package step1;


import java.util.*;

// class _객체를 정의하는 툴
// public _제한없이 타 클래스에서도 이용가능
// protected _상속받은 자손클래스에서만 이용가능
// private _클래스 내에서만 이용가능

public class PsychologicalTest {

	public static void main(String[] args) {
		System.out.println("<직장생활 만족도 테스트>");
		System.out.println("(각 1점씩)");
		
		String[] questions = {
				"\n근무 시간이 금세 지나간다",
				"매사에 도전적인 자세로 일한다",
				"의지할 수 있는 직장동료가 있다",
				"취미 활동을 할 시간이 충분하다",
				"일요일 저녁이 두렵지 않다",
				"사고 싶은 것을 언제든지 살 수 있다",
				"닮고 싶은 상사(멘토)가 있다",
				"모든 일에 있어 자신감이 넘친다.",
				"회사내 복지에 만족하며 지낸다.",
				"나는 성과를 인정받으며 일하는 것 같다"
			};

		Scanner scanner = new Scanner(System.in);
		
		int score =0;
		for (String q : questions) {
			System.out.println(q);
			score += scanner.nextInt();
		}	
		
		System.out.println("최종점수는"+ score + "입니다.");
		if (score==30) {
			System.out.println("임원이신가요...?");
		} else if (score < 30 && score > 15) {
			System.out.println("만족스런 직장생활 이군요!");
		} else if (score > 1) {
			System.out.println("만족스런 직장생활을 위해 화이팅!");
		} else {
			System.out.println("퇴사하세요...!");
		}
				
	}
		
}

// 변수, 클래스, 스캐너, 객체, for문, 배열
// 다시 만들어보기(과제)_ 과정대로 다시 해보기(안 보고)
// 해커랭크 자바, 자바스크립트 공부 30일 이랑 10일 
