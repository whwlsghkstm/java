package Ex04;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] num = new String[100];		//���¹�ȣ
		String[] name = new String[100];	//������
		int[] balance = new int[100];		//�ܾ�
		int count = 0;						//������ ������ �� ����
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.�Ա� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");			
			System.out.print("�۾� ��ȣ ���� > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1: // ���� ����
					count++;
					System.out.println(" *** ���� ���� *** ");
					System.out.print("���¹�ȣ >\t\t");
					num[count]=s.next();
					System.out.print("������ >\t\t");
					name[count]=s.next();
					System.out.print("�ʱ� �Աݾ� >\t");
					balance[count]=s.nextInt();
					System.out.println("�������� ���°� ���� �Ǿ����ϴ�.\n");
					break;
					
				case 2: // ���� ���
					System.out.println(" *** ���� ��� *** ");
					System.out.println("���¹�ȣ\t������\t�ܾ�");
					for(int i=1; i<=count; i++) {
						System.out.println(num[i] + "\t" + name[i]
								+ "\t" + balance[i]);
					}
					break;
					
				case 3: // �Ա�
					boolean find = false;	// case3,4 find �� ����
					
					System.out.println(" *** �Ա� *** ");
					System.out.print("�Ա� ���¹�ȣ > ");
					String num2 = s.next();
					System.out.print("�Աݾ� > ");
					int in = s.nextInt();
					
					for(int i=1; i<=count; i++) {
						if(num[i].equals(num2)) {
							balance[i] += in;
							find=true;
						}
					}
					if(find) {
						System.out.println("�Ա��� ���� ó���Ǿ����ϴ�.\n");
					}
					else {
						System.out.println("���� ���� �Դϴ�.\n");
					}
					break;
					
				case 4: //���
					find = false;	// case3,4 find �� ����
					
					System.out.println(" *** ��� *** ");
					System.out.print("��� ���¹�ȣ >");
					num2 = s.next();
					System.out.print("��ݾ� > ");
					int out = s.nextInt();
					for(int i=1; i<=count; i++) {
						if(num[i].equals(num2)) {
							balance[i] -= out;
							find = true;
						}
					}
					if(find) {
						System.out.println("����� ���� ó�� �Ǿ����ϴ�.\n");
					}
					else {
						System.out.println("���� �����Դϴ�.\n");
					}
					break;
					
				case 5: // ����
					
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					break;
					
				default: // case ��ȣ �̿��� ���� �Է����� �� ����
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
			}
		}

	}

}