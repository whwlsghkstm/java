package Ex1111;

import java.util.Scanner;

public class Sample1111 {

	public static void main(String[] args) {
		// 5���� ���� �Է¹޾� �հ�� ��� ���ϱ�
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<=num.length-1; i++) {
			
			System.out.print(i+1 + "��° �� > ");
			num[i]=scanner.nextInt();
			sum += num[i];
			
		}
		
		double avg = sum/num.length;
		System.out.println("1~5��° ���� �հ� > " + sum);
		System.out.println("1~5��° ���� ��� > " + (double)avg);
		
	}

}