package step1;


import java.util.*;

// class _��ü�� �����ϴ� ��
// public _���Ѿ��� Ÿ Ŭ���������� �̿밡��
// protected _��ӹ��� �ڼ�Ŭ���������� �̿밡��
// private _Ŭ���� �������� �̿밡��

public class PsychologicalTest {

	public static void main(String[] args) {
		System.out.println("<�����Ȱ ������ �׽�Ʈ>");
		System.out.println("(�� 1����)");
		
		String[] questions = {
				"\n�ٹ� �ð��� �ݼ� ��������",
				"�Ż翡 �������� �ڼ��� ���Ѵ�",
				"������ �� �ִ� ���嵿�ᰡ �ִ�",
				"��� Ȱ���� �� �ð��� ����ϴ�",
				"�Ͽ��� ������ �η��� �ʴ�",
				"��� ���� ���� �������� �� �� �ִ�",
				"��� ���� ���(����)�� �ִ�",
				"��� �Ͽ� �־� �ڽŰ��� ��ģ��.",
				"ȸ�系 ������ �����ϸ� ������.",
				"���� ������ ���������� ���ϴ� �� ����"
			};

		Scanner scanner = new Scanner(System.in);
		
		int score =0;
		for (String q : questions) {
			System.out.println(q);
			score += scanner.nextInt();
		}	
		
		System.out.println("����������"+ score + "�Դϴ�.");
		if (score==30) {
			System.out.println("�ӿ��̽Ű���...?");
		} else if (score < 30 && score > 15) {
			System.out.println("�������� �����Ȱ �̱���!");
		} else if (score > 1) {
			System.out.println("�������� �����Ȱ�� ���� ȭ����!");
		} else {
			System.out.println("����ϼ���...!");
		}
				
	}
		
}

// ����, Ŭ����, ��ĳ��, ��ü, for��, �迭
// �ٽ� ������(����)_ ������� �ٽ� �غ���(�� ����)
// ��Ŀ��ũ �ڹ�, �ڹٽ�ũ��Ʈ ���� 30�� �̶� 10�� 
