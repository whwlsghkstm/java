package Ex9999;

import java.util.Scanner;

public class Sample9999 {

	public static void main(String[] args) {
		
		// N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		boolean run = true;
		
		while(run) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("1~9 ������ ���� > ");
			int num = scanner.nextInt();
			System.out.println(num + "���� �����ϼ̽��ϴ�.");
			int sum = 1;
			
			if(num>=1 && num<=9) {
				for(int i=1; i<=9; i++) {
					sum = i * num;
					System.out.println(num + " * " + i + " = " + sum);
				}
			}
			else {
				System.out.println("�������� 1~9�ܱ����� ����մϴ�.");
			}
			System.out.println("\n");
		}

	}

}