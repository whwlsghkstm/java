package Ex1111;

import java.util.Scanner;

public class Sample1111 {

	public static void main(String[] args) {
		// 5개의 값을 입력받아 합계와 평균 구하기
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<=num.length-1; i++) {
			
			System.out.print(i+1 + "번째 값 > ");
			num[i]=scanner.nextInt();
			sum += num[i];
			
		}
		
		double avg = sum/num.length;
		System.out.println("1~5번째 값의 합계 > " + sum);
		System.out.println("1~5번째 합의 평균 > " + (double)avg);
		
	}

}
