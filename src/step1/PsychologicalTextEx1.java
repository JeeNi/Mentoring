package step1;

import java.util.*;

/*
public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<�����Ȱ ������ �׽�Ʈ>");
		System.out.println("(���� �ִ� 3��)");
		
		System.out.println("\n�ٹ� �ð��� �ݼ� ��������");
		System.out.println("�Ż翡 �������� �ڼ��� ���Ѵ�");
		System.out.println("������ �� �ִ� ���嵿�ᰡ �ִ�");
		System.out.println("��� Ȱ���� �� �ð��� ����ϴ�");
		System.out.println("�Ͽ��� ������ �η��� �ʴ�");
		System.out.println("��� ���� ���� �������� �� �� �ִ�");
		System.out.println("��� ���� ���(����)�� �ִ�");
		System.out.println("��� �Ͽ� �־� �ڽŰ��� ��ģ��");
		System.out.println("ȸ�系 ������ �����ϸ� ������");
		System.out.println("���� ������ ���������� ���ϴ� �� ����");
		
		System.out.println("\n����� �� �� �ΰ���?");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input == 30) {
			System.out.println("����� �ӿ��ΰ���...?");
		} else if(input < 30 && input > 15) {
			System.out.println("�������� �����Ȱ �̱���!");
		} else if(input < 15 && input > 1) {
			System.out.println("�������� �����Ȱ�� ���� ȭ����!");
		} else {
			System.out.println("����ϼ���...!");
		}
	}	
}
*/


public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<�����Ȱ ������ �׽�Ʈ>");
		System.out.println("(���� �ִ� 3��)");
		
		System.out.println("\n�ٹ� �ð��� �ݼ� ��������");
		Scanner a = new Scanner(System.in);
		int inputa = a.nextInt();
		System.out.println("�Ż翡 �������� �ڼ��� ���Ѵ�");
		Scanner b = new Scanner(System.in);
		int inputb = b.nextInt();
		System.out.println("������ �� �ִ� ���嵿�ᰡ �ִ�");
		Scanner c = new Scanner(System.in);
		int inputc = c.nextInt();
		System.out.println("��� Ȱ���� �� �ð��� ����ϴ�");
		Scanner d = new Scanner(System.in);
		int inputd = d.nextInt();
		System.out.println("�Ͽ��� ������ �η��� �ʴ�");
		Scanner e = new Scanner(System.in);
		int inpute = e.nextInt();
		System.out.println("��� ���� ���� �������� �� �� �ִ�");
		Scanner f = new Scanner(System.in);
		int inputf = f.nextInt();
		System.out.println("��� ���� ���(����)�� �ִ�");
		Scanner g = new Scanner(System.in);
		int inputg = g.nextInt();
		System.out.println("��� �Ͽ� �־� �ڽŰ��� ��ģ��");
		Scanner h = new Scanner(System.in);
		int inputh = h.nextInt();
		System.out.println("ȸ�系 ������ �����ϸ� ������");
		Scanner i = new Scanner(System.in);
		int inputi = i.nextInt();
		System.out.println("���� ������ ���������� ���ϴ� �� ����");
		Scanner j = new Scanner(System.in);
		int inputj = j.nextInt();
		
		//System.out.println("\n����� �� �� �ΰ���?");
		
		Scanner sc = new Scanner(System.in);
		int total = (inputa + inputb + inputc + inputd + inpute + inputf + inputg + inputh +
				inputi + inputj);
		
		System.out.println("����������" + total +"�� �Դϴ�.\n");
		
		if (total == 30) {
			System.out.println("����� �ӿ��ΰ���...?");
		} else if(total < 30 && total > 15) {
			System.out.println("�������� �����Ȱ �̱���!");
		} else if(total < 15 && total > 1) {
			System.out.println("�������� �����Ȱ�� ���� ȭ����!");
		} else {
			System.out.println("����ϼ���...!");
		}
	}	
}


public class PsychologicalTextEx1 {
	public static void main(String[] args) {
		
		System.out.println("<�����Ȱ ������ �׽�Ʈ>");
		System.out.println("(���� �ִ� 3��)");
		
		String[] question = {
				"\n�ٹ� �ð��� �ݼ� ��������",
				"�Ż翡 �������� �ڼ��� ���Ѵ�",
				"������ �� �ִ� ���嵿�ᰡ �ִ�",
				"��� Ȱ���� �� �ð��� ����ϴ�",
				"�Ͽ��� ������ �η��� �ʴ�",
				"��� ���� ���� �������� �� �� �ִ�",
				"��� ���� ���(����)�� �ִ�",
				"��� �Ͽ� �־� �ڽŰ��� ��ģ��",
				"ȸ�系 ������ �����ϸ� ������",
				"���� ������ ���������� ���ϴ� �� ����" };
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		for (String q : question) {  // question���� ���ʴ�� ��ü�� ���� q�� �ְڴ�
			System.out.println(q);
			score += scanner.nextInt();
		}
		
		/*
		System.out.println("\n�ٹ� �ð��� �ݼ� ��������");
		Scanner scanner = new Scanner(System.in);
		//int a = sc.nextInt();
		int score = sc.nextInt();
		
		System.out.println("�Ż翡 �������� �ڼ��� ���Ѵ�");
		//int b = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("������ �� �ִ� ���嵿�ᰡ �ִ�");
		//int c = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("��� Ȱ���� �� �ð��� ����ϴ�");
		//int d = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("�Ͽ��� ������ �η��� �ʴ�");
		//int e = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("��� ���� ���� �������� �� �� �ִ�");
		//int f = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("��� ���� ���(����)�� �ִ�");
		//int g = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("��� �Ͽ� �־� �ڽŰ��� ��ģ��");
		//int h = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("ȸ�系 ������ �����ϸ� ������");
		//int i = sc.nextInt();
		score += sc.nextInt();
		
		System.out.println("���� ������ ���������� ���ϴ� �� ����");
		//int j = sc.nextInt();
		score += sc.nextInt();
		*/
		
		//System.out.println("\n����� �� �� �ΰ���?");
		
		//int total = score;
			//(a + b + c + d + e + f + g + h + i + j);
		
		System.out.println("����������" + score +"�� �Դϴ�.\n");
		
		if (score == 30) {
			System.out.println("����� �ӿ��ΰ���...?");
		} else if(score < 30 && score > 15) {
			System.out.println("�������� �����Ȱ �̱���!");
		} else if(score < 15 && score > 1) {
			System.out.println("�������� �����Ȱ�� ���� ȭ����!");
		} else {
			System.out.println("����ϼ���...!");
		}
	}	
}
