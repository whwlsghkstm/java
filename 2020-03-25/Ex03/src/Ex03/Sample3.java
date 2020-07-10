package Ex03;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------");
			System.out.print("번호 선택 : ");
			int menu = scanner.nextInt();
			
			switch(menu){
				case 1:
					speed++;
					System.out.println("현재 속도 : " + speed + "\n");
					break;
				case 2:
					speed--;
					System.out.println("현재 속도 : " + speed + "\n");
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.\n다시 번호를 입력해 주세요.");
					break;
			}
		}
	}

}
