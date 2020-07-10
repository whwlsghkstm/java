package Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList<Report> array=new ArrayList<Report>();
		
		boolean run=true;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println(" 1.성적입력 │ 2.성적조회 │ 3.성적출력 │ 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("작업 번호 선택 > ");
			int menu=s.nextInt();
			System.out.println();
			switch(menu) {
				case 1:		//성적입력
					Report r=new Report();
					System.out.print("학번 입력 > ");
					r.setRnum(s.next());
					System.out.print("이름 입력 > ");
					r.setRname(s.next());
					System.out.print("국어 점수 입력 > ");
					r.setKor(s.nextInt());
					System.out.print("영어 점수 입력 > ");
					r.setEng(s.nextInt());
					System.out.print("수학 점수 입력 > ");
					r.setMat(s.nextInt());
					array.add(r);
					System.out.println("성적 입력이 완료되었습니다.\n");
					break;
					
				case 2:		//성적조회
					System.out.print("성적을 조회할 학번 입력 > ");
					String num=s.next();
					
					boolean find=false;
					for(int i=0; i<array.size(); i++) {
						r=array.get(i);
						if(num.equals(r.getRnum())) {
							r.printReport();
							find=true;
						}
					}
					if(find==false) {
						System.out.println("입력하신 학번이 존재하지 않습니다.\n");
					}
					break;
					
				case 3:		//성적출력
					for(int i=0; i<array.size(); i++) {
						r=array.get(i);
						r.printReport
						();
						System.out.println();
					}
					break;
					
				case 4:		//프로그램종료
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
			}
		}
		
		
	}

}
