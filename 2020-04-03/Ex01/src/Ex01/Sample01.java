package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) throws Exception{
		
		Scanner s=new Scanner(System.in);
		StudentDAO dao=new StudentDAO();
		
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.입력 | 2.조회 | 3.목록 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("-------------------------------------------");
			System.out.print("작업 번호 선택 > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1:		//학생입력
					System.out.println(" *** 학생입력 *** ");
					
					StudentVO vo=new StudentVO();
					System.out.print("두자리의 학번 입력 > ");
					String snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						vo.setSnum(snum);
						System.out.print("학생 이름 입력 > ");
						vo.setSname(s.next());
						System.out.print("학생 연락처 입력 > ");
						vo.setStel(s.next());
						
						dao.insert(vo);
						System.out.println("학생 입력이 완료 되었습니다.\n");
					}
					else {
						System.out.println("이미 존재하는 학번입니다.\n");
					}
					break;
					 
				case 2:		//학생조회
					System.out.println(" *** 학생조회 *** ");
					
					System.out.print("조회할 학생의 두자리 학번 입력 > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("조회하실 학생의 학번이 존재하지 않습니다.\n");
					}
					else {
						System.out.println("학생 이름 : " + vo.getSname());
						System.out.println("학생 연락처 : " + vo.getStel());
						System.out.println();
					}
					break;
					
				case 3:		//학생목록
					System.out.println(" *** 성적목록 *** ");
					System.out.println("학번\t이름\t연락처");
					ArrayList<StudentVO> array=dao.list();
					for(int i=0; i<array.size(); i++) {
						vo=array.get(i);
						System.out.print(vo.getSnum()+"\t");
						System.out.print(vo.getSname()+"\t");
						System.out.println(vo.getStel()+"\t");
					}
					System.out.println();
					break;
					
				case 4:		//학생수정
					System.out.println(" *** 정보수정 *** ");
					System.out.print("학생 정보를 수정할 두자리 학번 입력 > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("선택하신 학번은 존재하지 않습니다.\n");
					}
					else {
						System.out.print("수정할 이름 ["+vo.getSname()+"] > ");
						vo.setSname(s.next());
						System.out.print("수정할 연락처 ["+vo.getStel()+"] > ");
						vo.setStel(s.next());
						dao.update(vo);
						
						System.out.println("학생의 정보가 수정 되었습니다.\n");
					}
					
					break;
					
				case 5:		//학생삭제
					System.out.println(" *** 정보삭제 *** ");
					System.out.print("성적을 삭제할 학번 입력 > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("선택하신 학번은 존재하지 않습니다.\n");
					}
					else {
						dao.delete(snum);
						System.out.println("선택하신 학번의 성적이 삭제 되었습니다.\n");
					}
					
					break;
					
				case 6:
					System.out.println("프로그램을 종료합니다.\n");
					run=false;
					break;
			}
		}
		
	}

}
