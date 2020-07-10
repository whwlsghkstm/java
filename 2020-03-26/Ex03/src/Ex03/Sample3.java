package Ex03;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] num = new String[100];
		String[] name = new String[100];
		String[] addr = new String[100];
		int count = 0;	//주소입력개수
		
		boolean run = true;		
		while(run) {
			
			System.out.println("------------------------------------");
			System.out.println("1.주소입력 | 2.주소목록 | 3.주소조회 | 4.종료");
			System.out.println("------------------------------------");
			
			System.out.print("번호 선택 > ");
			int menu = s.nextInt();
			
			switch(menu) {
				case 1:
					count++;
					System.out.println(" *** 주소 입력 *** ");
					System.out.print("번호 입력 > ");
					num[count] = s.next();
					System.out.print("이름 입력 > ");
					name[count] = s.next();
					System.out.print("주소 입력 > ");
					
					s.nextLine();
					addr[count] = s.nextLine();
					
					System.out.println("결과 : 학생의 정보가 입력 되었습니다.");
					break;
					
				case 2:
					System.out.println(" *** 주소 목록 *** ");
					System.out.println("번호\t이름\t주소");
					for(int i=1; i<=count; i++) {
						System.out.println(num[i] + "\t" + name[i] + 
								"\t" + addr[i]);
					}
					break;
					
				case 3:
					System.out.println(" *** 주소 조회 *** ");
					System.out.print("조회할 번호 입력 > ");
					String number = s.next();
					
					for(int i=1; i<=count; i++) {
						if(num[i].equals(number)) {
							System.out.println("이름 : " + name[i]);
							System.out.println("주소 : " + addr[i]);
						}
					}
					break;
					
				case 4:
					System.out.println("프로그램 종료");
					run = false;
					break;
					
				default :
					System.out.println("잘못 입력 하셨습니다.");
					System.out.println("프로그램을 종료합니다.");
					run = false;
			}
			
		}

	}

}
