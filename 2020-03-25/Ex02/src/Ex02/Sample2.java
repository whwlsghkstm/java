package Ex02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		// method1();
		// method2();
		// method3();
		
		boolean rs = true;
		
		while(rs) {
			System.out.println("[1] 1~100까지의 합");
			System.out.println("[2] 1~100 짝수의 합");
			System.out.println("[3] 1~100 홀수의 합");
			System.out.println("[4] 프로그램 종료");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("[1~4]번호를 입력하세요 > ");
			int menu = scanner.nextInt();
			
				switch(menu) {
					case 1:
						method1();
						break;
					case 2:
						method2();
						break;
					case 3:
						method3();
						break;
					case 4:
						System.out.println("프로그램 종료");
						rs = false;
						break;
					default :
						System.out.println("잘못 입력 하셨습니다.\n프로그램을 종료합니다.");
						rs = false;
				}
		}
		

	}

	public static void method1() {
		
		// 1~100까지의 합
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 : " + sum + "\n");
	}
	
	public static void method2() {
		
		// 1~100 짝수의 합
		int sum = 0;
		for(int i=0; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("1~100 짝수의 합은 : " + sum + "\n");
	}
	
	public static void method3() {
		
		// 1~100 홀수의 합
		int sum = 0;
		for(int i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("1~100 홀수의 합은 : " + sum + "\n");
	}
}
