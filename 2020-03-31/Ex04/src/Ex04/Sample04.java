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
			System.out.println("1.�����Է� | 2.������� | 3.������ȸ | 4.����");
			System.out.println("------------------------------------");
			System.out.print("�۾���ȣ ���� > ");
			int menu=s.nextInt();
			
			System.out.println();
			
			switch(menu) {
				case 1:
					System.out.println(" *** �����Է� *** ");
					grade[count]=new Grade04();
					System.out.print("�й� �Է� > ");
					grade[count].gnum=s.next();
					System.out.print("�̸� �Է� > ");
					grade[count].gname=s.next();
					System.out.print("���� ���� �Է� > ");
					grade[count].kor=s.nextInt();
					System.out.print("���� ���� �Է� > ");
					grade[count].eng=s.nextInt();
					System.out.print("���� ���� �Է� > ");
					grade[count].mat=s.nextInt();
					System.out.println("�����Է��� �Ϸ�Ǿ����ϴ�.\n");
					count++;
					
					break;
					
				case 2:
					System.out.println(" *** ������� *** ");
					System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���");
					for(int i=0; i<count; i++) {
						grade[i].printGrade();
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println(" *** ������ȸ *** ");
					System.out.print("��ȸ�� �й� �Է� > ");
					String number=s.next();
					boolean find=false;
					
					for(int i=0; i<count; i++) {
						if(number.equals(grade[i].gnum)) {
							grade[i].printGrade();
							
							find=true;
						}
					}
					if(find==false) {
						System.out.println("��ġ�ϴ� �й��� �������� �ʽ��ϴ�.\n");
					}
					break;
					
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
					
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println("���α׷��� �����մϴ�.\n");
					run=false;
			}
		}
	}

}