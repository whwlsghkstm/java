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
			System.out.println("1.�����Է� | 2.������� | 3.������ȸ | 4.����");
			System.out.println("------------------------------------");
			System.out.print("��ȣ���� > ");
			int menu = s.nextInt();
			
			switch(menu) {
				case 1:		//�����Է�
					count++;
					
					System.out.println(" *** �����Է� *** ");
					System.out.print("�й� �Է� > ");
					num[count] = s.next();
					System.out.print("�̸� > ");
					name[count] = s.next();
					System.out.print("���� ���� > ");
					kor[count] = s.nextInt();
					System.out.print("���� ���� > ");
					eng[count] = s.nextInt();
					System.out.print("���� ���� > ");
					mat[count] = s.nextInt();
					System.out.println("���� �Է��� �Ϸ� �Ǿ����ϴ�.\n");
					break;
					
				case 2:		//�������
					
					System.out.println(" *** ������� *** ");
					System.out.println("��ȣ\t�̸�\t��������\t��������\t��������\t�հ�\t���");
					
					
					for(int i=1; i<=count; i++) {
						sum = kor[i] + eng[i] + mat[i];
						double avg = sum/3;
						System.out.println(num[i] + "\t" + name[i] + "\t" + kor[i]
								+ "\t" + eng[i] + "\t" + mat[i] + "\t" + sum
								+ "\t" + avg);
					}
					break;
					
				case 3:		//������ȸ
					System.out.println(" *** ������ȸ *** ");
					System.out.print("�й� �Է� > ");
					String number = s.next();
					
					for(int i=1; i<=count; i++) {
						sum = kor[i] + eng[i] + mat[i];
						double avg = sum/3;
						if(num[i].equals(number)) {
							System.out.println("��ȣ : " + "\t" + "\t" + num[i]);
							System.out.println("�̸� : " + "\t" + "\t" + name[i]);
							System.out.println("���� ���� : " + "\t" + kor[i]);
							System.out.println("���� ���� : " + "\t" + eng[i]);
							System.out.println("���� ���� : " + "\t" + mat[i]);
							System.out.println("�հ� ���� : " + "\t" + sum);
							System.out.println("��� ���� : " + "\t" + avg);
						}
					}
					
					break;
					
				case 4:		//���α׷� ����
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					break;
					
				default :	//1~4 �̿��� ���� �Է��� ���
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
			}
		}

	}

}