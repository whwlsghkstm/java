package Ex03;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-----------------------");
			System.out.print("��ȣ ���� : ");
			int menu = scanner.nextInt();
			
			switch(menu){
				case 1:
					speed++;
					System.out.println("���� �ӵ� : " + speed + "\n");
					break;
				case 2:
					speed--;
					System.out.println("���� �ӵ� : " + speed + "\n");
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.\n�ٽ� ��ȣ�� �Է��� �ּ���.");
					break;
			}
		}
	}

}