package Ex04;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		
		// scanner�� Ȱ���� �迭
		/*
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.print(i+1 + "��° �� > ");
			num[i] = scanner.nextInt();
			
			sum += num[i];
		}
		double avg = (double)sum/num.length;

		System.out.println("�հ� > " + sum);
		System.out.println("��� > " + avg);
		*/
		
		
		// �迭 > ����Ÿ��
		
		int [] a = {1, 2, 3, 4, 5, 67};
		int sum = 0;
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(i+1 + "��° = " + a[i]);
			sum += a[i];
		}
		
		System.out.println("�հ� : " + sum);
		double avg = (double)sum/a.length;
		System.out.println("��� : " + avg);
		

	}

}