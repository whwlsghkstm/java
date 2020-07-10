package Ex01;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		/* if문 활용 성적출력 */
		int score = 75;
		if(score<=100 && score>=95) {
			System.out.println("A+\n");
		}
		else if(score<95 && score>=90) {
			System.out.println("A0\n");
		}
		else if(score<90 && score>=85) {
			System.out.println("B+\n");
		}
		else if(score<85 && score>=80) {
			System.out.println("B0\n");
		}
		else if(score<80 && score>=75) {
			System.out.println("C+\n");
		}
		else if(score<75 && score>=70) {
			System.out.println("C0\n");
		}
		else {
			System.out.println("F\n");
		}
		
		
		/* for문 활용하여 수의 합계 구하기 */
		int sum=0;
		for(int i=1; i<=100; i+=1) {
			sum+=i;
		}
		System.out.println("for문 합계 : " + sum + "\n");
		
		/* while문 활용하여 수의 합계 구하기 */
		int i=1;
		sum=0;
		while(i<=100) {
			sum+=i;
			i+=1;
		}
		System.out.println("while문 합계 : " + sum + "\n");
		
		/* 무한루프 while문 키보드로 값을 입력받아 멈추기 */
		Scanner s = new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.print("숫자 입력(0입력시 종료) > ");
			int stop = s.nextInt();
			if(stop==0) {
				run=false;
			}
			System.out.println(stop + " : 를(을) 입력했습니다.\n");
		}
		System.out.println("프로그램을 종료합니다.\n");
		
		/* 배열 */
		int[] num = {1, 2, 3, 4, 5};
		sum=0;
		for(int j=0; j<num.length; j++) {
			sum+=num[j];
		}
		double avg = (double)sum/num.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		/* 배열을 입력받아 입력받은 수의 합 구하기 */
		int[] number=null;				// 크기가 정해지지 않은 배열생성
		System.out.print("배열크기 > ");
		int count=s.nextInt();			// 배열 크기를 입력받아 count에 저장
		number = new int[count];		// 입력받은 count만큼 배열을 생성
		
		sum=0;
		for(int j=0; j<count; j++) {
			System.out.print(j+1 + "번째 값 > ");
			number[j]=s.nextInt();		// count만큼의 배열의 인덱스에 각각 값 입력
			sum+=number[j];
		}
		System.out.println("배열의 합계 : " + sum);

	}

}
