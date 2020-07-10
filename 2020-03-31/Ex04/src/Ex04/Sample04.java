package Ex04;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Grade04[] grade=new Grade04[100];
		int count=0;
		
		boolean run=true;
		while(run) {			
			System.out.println("------------------------------------");
			System.out.println("1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("작업번호 선택 > ");
			int menu=s.nextInt();
			
			System.out.println();
			
			switch(menu) {
				case 1:
					System.out.println(" *** 성적입력 *** ");
					grade[count]=new Grade04();
					System.out.print("학번 입력 > ");
					grade[count].gnum=s.next();
					System.out.print("이름 입력 > ");
					grade[count].gname=s.next();
					System.out.print("국어 점수 입력 > ");
					grade[count].kor=s.nextInt();
					System.out.print("영어 점수 입력 > ");
					grade[count].eng=s.nextInt();
					System.out.print("수학 점수 입력 > ");
					grade[count].mat=s.nextInt();
					System.out.println("성적입력이 완료되었습니다.\n");
					count++;
					
					break;
					
				case 2:
					System.out.println(" *** 성적출력 *** ");
					System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
					for(int i=0; i<count; i++) {
						grade[i].printGrade();
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println(" *** 성적조회 *** ");
					System.out.print("조회할 학번 입력 > ");
					String number=s.next();
					boolean find=false;
					
					for(int i=0; i<count; i++) {
						if(number.equals(grade[i].gnum)) {
							grade[i].printGrade();
							
							find=true;
						}
					}
					if(find==false) {
						System.out.println("일치하는 학번이 존재하지 않습니다.\n");
					}
					break;
					
				case 4:
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
					
				default :
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("프로그램을 종료합니다.\n");
					run=false;
			}
		}
	}

}
