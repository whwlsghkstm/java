package Ex03;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] num = new String[100];
		String[] name = new String[100];
		String[] addr = new String[100];
		int count = 0;	//�ּ��Է°���
		
		boolean run = true;		
		while(run) {
			
			System.out.println("------------------------------------");
			System.out.println("1.�ּ��Է� | 2.�ּҸ�� | 3.�ּ���ȸ | 4.����");
			System.out.println("------------------------------------");
			
			System.out.print("��ȣ ���� > ");
			int menu = s.nextInt();
			
			switch(menu) {
				case 1:
					count++;
					System.out.println(" *** �ּ� �Է� *** ");
					System.out.print("��ȣ �Է� > ");
					num[count] = s.next();
					System.out.print("�̸� �Է� > ");
					name[count] = s.next();
					System.out.print("�ּ� �Է� > ");
					
					s.nextLine();
					addr[count] = s.nextLine();
					
					System.out.println("��� : �л��� ������ �Է� �Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println(" *** �ּ� ��� *** ");
					System.out.println("��ȣ\t�̸�\t�ּ�");
					for(int i=1; i<=count; i++) {
						System.out.println(num[i] + "\t" + name[i] + 
								"\t" + addr[i]);
					}
					break;
					
				case 3:
					System.out.println(" *** �ּ� ��ȸ *** ");
					System.out.print("��ȸ�� ��ȣ �Է� > ");
					String number = s.next();
					
					for(int i=1; i<=count; i++) {
						if(num[i].equals(number)) {
							System.out.println("�̸� : " + name[i]);
							System.out.println("�ּ� : " + addr[i]);
						}
					}
					break;
					
				case 4:
					System.out.println("���α׷� ����");
					run = false;
					break;
					
				default :
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
			}
			
		}

	}

}