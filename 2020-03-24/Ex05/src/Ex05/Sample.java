package Ex05;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		 switch1();
		 sungjuk();
		 sungjuk1();

	}
	
	public static void switch1() {
		
		System.out.println("switch ����1");
		System.out.println("------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ð��Է� > ");
		
		int time = scanner.nextInt();
		
		switch(time) {
		case 9:
			System.out.println("ȸ�Ǹ� �����մϴ�.");
			break;
		case 8:
			System.out.println("��ٽð� �Դϴ�.");
			break;
		case 10:
			System.out.println("������ �����մϴ�.");
			break;
		default :
			System.out.println("�ܱ��� �մϴ�.");
			break;
		}
	}

	public static void sungjuk() {
		System.out.println(" *** ������� *** ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� > ");
		int kor = scanner.nextInt();
		System.out.print("���� > ");
		int eng = scanner.nextInt();
		System.out.print("���� > ");
		int mat = scanner.nextInt();
		
		int tot = kor + eng + mat;
		int avg = tot/3;
		String grade = "";
		
		System.out.println("������ > " + (kor + eng + mat) + "�� �Դϴ�.");
		System.out.println("����� > " + (double)(kor + eng + mat)/3 + "�� �Դϴ�.");
		
		
		if(avg >= 90) {
			if(avg >= 95) {
				grade = "A+";
			}
			else {
				grade = "A0";
			}
		}
		else if(avg >= 80) {
			if(avg >= 85) {
				grade = "B+";
			}
			else {
				grade = "B0";
			}
		}
		else if(avg >= 70) {
			if(avg >= 75) {
				grade = "C+";
			}
			else {
				grade = "C0";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("������ > " + grade + "�Դϴ�.");
	}



	public static void sungjuk1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� > ");
		int score = scanner.nextInt();
		if(score >= 90) {
			System.out.println("������ A�Դϴ�.");
		}
		else if(score >= 80) {
			System.out.println("������ B�Դϴ�.");
		}
		else if(score >= 70) {
			System.out.println("������ C�Դϴ�.");
		}
		else {
			System.out.println("������ F�Դϴ�.");
		}
	}
}