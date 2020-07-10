package hw01;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] name = new String[100];
		String[] num = new String[100];
		int[] kor = new int[100];
		int[] eng = new int[100];
		int[] mat = new int[100];
		int count = 0;
		int sum = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("번호선택 > ");
			int menu = s.nextInt();
			
			switch(menu) {
				case 1:		//성적입력
					count++;
					
					System.out.println(" *** 성적입력 *** ");
					System.out.print("학번 입력 > ");
					num[count] = s.next();
					System.out.print("이름 > ");
					name[count] = s.next();
					System.out.print("국어 점수 > ");
					kor[count] = s.nextInt();
					System.out.print("영어 점수 > ");
					eng[count] = s.nextInt();
					System.out.print("수학 점수 > ");
					mat[count] = s.nextInt();
					System.out.println("성적 입력이 완료 되었습니다.\n");
					break;
					
				case 2:		//성적목록
					
					System.out.println(" *** 성적목록 *** ");
					System.out.println("번호\t이름\t국어점수\t영어점수\t수학점수\t합계\t평균");
					
					
					for(int i=1; i<=count; i++) {
						sum = kor[i] + eng[i] + mat[i];
						double avg = sum/3;
						System.out.println(num[i] + "\t" + name[i] + "\t" + kor[i]
								+ "\t" + eng[i] + "\t" + mat[i] + "\t" + sum
								+ "\t" + avg);
					}
					break;
					
				case 3:		//성적조회
					System.out.println(" *** 성적조회 *** ");
					System.out.print("학번 입력 > ");
					String number = s.next();
					
					for(int i=1; i<=count; i++) {
						sum = kor[i] + eng[i] + mat[i];
						double avg = sum/3;
						if(num[i].equals(number)) {
							System.out.println("번호 : " + "\t" + "\t" + num[i]);
							System.out.println("이름 : " + "\t" + "\t" + name[i]);
							System.out.println("국어 점수 : " + "\t" + kor[i]);
							System.out.println("영어 점수 : " + "\t" + eng[i]);
							System.out.println("수학 점수 : " + "\t" + mat[i]);
							System.out.println("합계 점수 : " + "\t" + sum);
							System.out.println("평균 점수 : " + "\t" + avg);
						}
					}
					
					break;
					
				case 4:		//프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
					
				default :	//1~4 이외의 값을 입력한 경우
					System.out.println("잘못 입력 하셨습니다.");
					System.out.println("프로그램을 종료합니다.");
					run = false;
			}
		}

	}

}
