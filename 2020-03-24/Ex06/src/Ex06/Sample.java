package Ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		 for1();
		 for2();
		 for3();
		 for4();
		 
		System.out.println("1 > 1~100 ��, 2 > ¦����, 3 > Ȧ����");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch(number) {
		case 1:
			for2();
			break;
		case 2:
			for3();
			break;
		case 3:
			for4();
		}
	}
	
	/* 1~5���� �ݺ� ��� */
	public static void for1() {
		System.out.println(" *** ����1 *** ");
		
		for(int i = 1; i <= 5; i++) {		// i+=2 == i=i+2
			System.out.println(i);
		}
		System.out.println("");
	}

	/* 1~100������ �� */
	public static void for2() {
		System.out.println(" *** ����2(1~100�� ��) *** ");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100������ �� > " + sum);
		System.out.println("");
	}

	/* 0~100���� ¦���� �� */
	public static void for3() {
		System.out.println(" *** ����3(¦����) *** ");
		int sum = 0;
		for(int i=0; i<=100; i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("");
	}
	
	/* 1~100���� Ȧ���� �� */
	public static void for4() {
		System.out.println(" *** ����4(Ȧ����) *** ");
		int sum = 0;
		for(int i=1; i<=100; i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("");
	}
}
