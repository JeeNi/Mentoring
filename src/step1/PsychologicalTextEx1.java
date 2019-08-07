package step1;

import java.util.*;

/*
public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<직장생활 만족도 테스트>");
		System.out.println("(각각 최대 3점)");
		
		System.out.println("\n근무 시간이 금세 지나간다");
		System.out.println("매사에 도전적인 자세로 일한다");
		System.out.println("의지할 수 있는 직장동료가 있다");
		System.out.println("취미 활동을 할 시간이 충분하다");
		System.out.println("일요일 저녁이 두렵지 않다");
		System.out.println("사고 싶은 것을 언제든지 살 수 있다");
		System.out.println("닮고 싶은 상사(멘토)가 있다");
		System.out.println("모든 일에 있어 자신감이 넘친다");
		System.out.println("회사내 복지에 만족하며 지낸다");
		System.out.println("나는 성과를 인정받으며 일하는 것 같다");
		
		System.out.println("\n당신은 몇 점 인가요?");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input == 30) {
			System.out.println("당신은 임원인가요...?");
		} else if(input < 30 && input > 15) {
			System.out.println("만족스런 직장생활 이군요!");
		} else if(input < 15 && input > 1) {
			System.out.println("만족스런 직장생활을 위해 화이팅!");
		} else {
			System.out.println("퇴사하세요...!");
		}
	}	
}
*/


public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<직장생활 만족도 테스트>");
		System.out.println("(각각 최대 3점)");
		
		System.out.println("\n근무 시간이 금세 지나간다");
		Scanner a = new Scanner(System.in);
		int inputa = a.nextInt();
		System.out.println("매사에 도전적인 자세로 일한다");
		Scanner b = new Scanner(System.in);
		int inputb = b.nextInt();
		System.out.println("의지할 수 있는 직장동료가 있다");
		Scanner c = new Scanner(System.in);
		int inputc = c.nextInt();
		System.out.println("취미 활동을 할 시간이 충분하다");
		Scanner d = new Scanner(System.in);
		int inputd = d.nextInt();
		System.out.println("일요일 저녁이 두렵지 않다");
		Scanner e = new Scanner(System.in);
		int inpute = e.nextInt();
		System.out.println("사고 싶은 것을 언제든지 살 수 있다");
		Scanner f = new Scanner(System.in);
		int inputf = f.nextInt();
		System.out.println("닮고 싶은 상사(멘토)가 있다");
		Scanner g = new Scanner(System.in);
		int inputg = g.nextInt();
		System.out.println("모든 일에 있어 자신감이 넘친다");
		Scanner h = new Scanner(System.in);
		int inputh = h.nextInt();
		System.out.println("회사내 복지에 만족하며 지낸다");
		Scanner i = new Scanner(System.in);
		int inputi = i.nextInt();
		System.out.println("나는 성과를 인정받으며 일하는 것 같다");
		Scanner j = new Scanner(System.in);
		int inputj = j.nextInt();
		
		//System.out.println("\n당신은 몇 점 인가요?");
		
		Scanner sc = new Scanner(System.in);
		int total = (inputa + inputb + inputc + inputd + inpute + inputf + inputg + inputh +
				inputi + inputj);
		
		System.out.println("최종점수는" + total +"점 입니다.\n");
		
		if (total == 30) {
			System.out.println("당신은 임원인가요...?");
		} else if(total < 30 && total > 15) {
			System.out.println("만족스런 직장생활 이군요!");
		} else if(total < 15 && total > 1) {
			System.out.println("만족스런 직장생활을 위해 화이팅!");
		} else {
			System.out.println("퇴사하세요...!");
		}
	}	
}


public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<직장생활 만족도 테스트>");
		System.out.println("(각각 최대 3점)");
		
		String[] question = {
				"\n근무 시간이 금세 지나간다",
				"매사에 도전적인 자세로 일한다",
				"의지할 수 있는 직장동료가 있다",
				"취미 활동을 할 시간이 충분하다",
				"일요일 저녁이 두렵지 않다",
				"사고 싶은 것을 언제든지 살 수 있다",
				"닮고 싶은 상사(멘토)가 있다",
				"모든 일에 있어 자신감이 넘친다",
				"회사내 복지에 만족하며 지낸다",
				"나는 성과를 인정받으며 일하는 것 같다" };
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		for (String q : question) {  // question에서 차례대로 객체를 꺼내 q에 넣겠다
			System.out.println(q);
			score += scanner.nextInt();
		}
		
		/*
		System.out.println("\n근무 시간이 금세 지나간다");
		Scanner scanner = new Scanner(System.in);
		//int a = sc.nextInt();
		int score = sc.nextInt();
		
		System.out.println("매사에 도전적인 자세로 일한다");
		//int b = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("의지할 수 있는 직장동료가 있다");
		//int c = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("취미 활동을 할 시간이 충분하다");
		//int d = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("일요일 저녁이 두렵지 않다");
		//int e = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("사고 싶은 것을 언제든지 살 수 있다");
		//int f = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("닮고 싶은 상사(멘토)가 있다");
		//int g = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("모든 일에 있어 자신감이 넘친다");
		//int h = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("회사내 복지에 만족하며 지낸다");
		//int i = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("나는 성과를 인정받으며 일하는 것 같다");
		//int j = sc.nextInt();
		score += sc.nextInt();
		*/
		
		//System.out.println("\n당신은 몇 점 인가요?");
		
		//int total = score;
			//(a + b + c + d + e + f + g + h + i + j);
		
		System.out.println("최종점수는" + score +"점 입니다.\n");
		
		if (score == 30) {
			System.out.println("당신은 임원인가요...?");
		} else if(score < 30 && score > 15) {
			System.out.println("만족스런 직장생활 이군요!");
		} else if(score < 15 && score > 1) {
			System.out.println("만족스런 직장생활을 위해 화이팅!");
		} else {
			System.out.println("퇴사하세요...!");
		}
	}	
}
