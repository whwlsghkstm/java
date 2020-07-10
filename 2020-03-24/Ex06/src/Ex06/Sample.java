package Ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		 for1();
		 for2();
		 for3();
		 for4();
		 
		System.out.println("1 > 1~100 합, 2 > 짝수합, 3 > 홀수합");
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
	
	/* 1~5까지 반복 출력 */
	public static void for1() {
		System.out.println(" *** 예제1 *** ");
		
		for(int i = 1; i <= 5; i++) {		// i+=2 == i=i+2
			System.out.println(i);
		}
		System.out.println("");
	}

	/* 1~100까지의 합 */
	public static void for2() {
		System.out.println(" *** 예제2(1~100의 합) *** ");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합 > " + sum);
		System.out.println("");
	}

	/* 0~100까지 짝수의 합 */
	public static void for3() {
		System.out.println(" *** 예제3(짝수합) *** ");
		int sum = 0;
		for(int i=0; i<=100; i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("");
	}
	
	/* 1~100까지 홀수의 합 */
	public static void for4() {
		System.out.println(" *** 예제4(홀수합) *** ");
		int sum = 0;
		for(int i=1; i<=100; i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("");
	}
}
