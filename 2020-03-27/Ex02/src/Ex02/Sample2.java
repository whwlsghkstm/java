package Ex02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] number=null;
		int sum=0;
		int count=0;
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.배열생성 | 2.데이터입력 | 3.데이터출력 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.print("숫자 선택 > ");
			int menu=s.nextInt();
			System.out.println();
			
			switch(menu) {
				case 1:		//배열생성
					count++;
					System.out.println(" *** 배열생성 *** ");
					System.out.print("생성할 배열의 수 > ");
					count=s.nextInt();
					number=new int[count];
					System.out.println();
					break;
					
				case 2:		//데이터입력
					System.out.println(" *** 데이터입력 *** ");
					for(int i=0; i<count; i++) {
						System.out.print(i+1 + "번째 수 입력 > ");
						number[i]=s.nextInt();
					}
					System.out.println();
					break;
					
				case 3:		//데이터출력
					System.out.println(" *** 데이터출력 *** ");
					for(int i=0; i<count; i++) {
						System.out.println(i+1 + "번째 값 : " + number[i]);
						sum+=number[i];
					}
					double avg = sum/number.length;
					System.out.println("데이터의 합 : " + sum);
					System.out.println("데이터 평균 : " + avg);
					System.out.println();
					break;
					
				case 4:		//프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("다시 입력해 주세요.\n");
					break;
			}
		}

	}

}
