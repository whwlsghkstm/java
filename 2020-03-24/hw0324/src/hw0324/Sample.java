package hw0324;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력 > ");
		int number = scanner.nextInt();
		int sum = 0;
		
		while(number != 0) {
			for(int i=0; i<=number; i++) {
				sum += i;
			}
			System.out.println("1~" + number + "까지의 합 > " + sum + "\n");
			sum = 0;
			System.out.print("숫자입력 > ");
			number = scanner.nextInt();
		}
		
		System.out.println("프로그램 종료");

	}

}
