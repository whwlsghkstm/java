package Ex02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] number=null;
		int sum=0;
		int count=0;
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.�迭���� | 2.�������Է� | 3.��������� | 4.����");
			System.out.println("---------------------------------------");
			System.out.print("���� ���� > ");
			int menu=s.nextInt();
			System.out.println();
			
			switch(menu) {
				case 1:		//�迭����
					count++;
					System.out.println(" *** �迭���� *** ");
					System.out.print("������ �迭�� �� > ");
					count=s.nextInt();
					number=new int[count];
					System.out.println();
					break;
					
				case 2:		//�������Է�
					System.out.println(" *** �������Է� *** ");
					for(int i=0; i<count; i++) {
						System.out.print(i+1 + "��° �� �Է� > ");
						number[i]=s.nextInt();
					}
					System.out.println();
					break;
					
				case 3:		//���������
					System.out.println(" *** ��������� *** ");
					for(int i=0; i<count; i++) {
						System.out.println(i+1 + "��° �� : " + number[i]);
						sum+=number[i];
					}
					double avg = sum/number.length;
					System.out.println("�������� �� : " + sum);
					System.out.println("������ ��� : " + avg);
					System.out.println();
					break;
					
				case 4:		//���α׷� ����
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println("�ٽ� �Է��� �ּ���.\n");
					break;
			}
		}

	}

}