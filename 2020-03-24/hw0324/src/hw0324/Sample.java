package hw0324;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է� > ");
		int number = scanner.nextInt();
		int sum = 0;
		
		while(number != 0) {
			for(int i=0; i<=number; i++) {
				sum += i;
			}
			System.out.println("1~" + number + "������ �� > " + sum + "\n");
			sum = 0;
			System.out.print("�����Է� > ");
			number = scanner.nextInt();
		}
		
		System.out.println("���α׷� ����");

	}

}