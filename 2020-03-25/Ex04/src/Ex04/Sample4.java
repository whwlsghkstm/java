package Ex04;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		
		// scanner를 활용한 배열
		/*
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.print(i+1 + "번째 값 > ");
			num[i] = scanner.nextInt();
			
			sum += num[i];
		}
		double avg = (double)sum/num.length;

		System.out.println("합계 > " + sum);
		System.out.println("평균 > " + avg);
		*/
		
		
		// 배열 > 참조타입
		
		int [] a = {1, 2, 3, 4, 5, 67};
		int sum = 0;
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(i+1 + "번째 = " + a[i]);
			sum += a[i];
		}
		
		System.out.println("합계 : " + sum);
		double avg = (double)sum/a.length;
		System.out.println("평균 : " + avg);
		

	}

}
