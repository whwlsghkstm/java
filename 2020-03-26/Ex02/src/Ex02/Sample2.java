package Ex02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int [] score = null;		//��ü���� ����ϴ� ���� >> ��������
		
		boolean run = true;
		while(run) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			
			System.out.print("��ȣ�� �����ϼ���. > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1:
					System.out.print("�л��� > ");
					int count = s.nextInt();
					score=new int[count];
					break;
					
				case 2:
					for(int i=0; i<=score.length-1; i++) {
						System.out.print(i+1 + "�� �����Է� > ");
						score[i]=s.nextInt();
					}
					break;
					
				case 3:
					for(int i=0; i<=score.length-1; i++) {
						System.out.println(i+1 + "�� ������� > " + score[i]);
					}
					break;
					
				case 4:
					int sum = 0;
					int max = -99999;
					
					for(int i=0; i<=score.length-1; i++) {
						if(score[i]>max) {
							max=score[i];
						}
						
						sum += score[i];
					}
					double avg = sum/score.length;					
					System.out.println("�ְ����� > " + max);
					System.out.println("������� > " + avg);
					break;
					
				case 5:
					run=false;
					System.out.println("���α׷� ����");
					break;
					
				default:
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					System.out.println("�ٽ� �Է��� �ּ���.");
			}
			
			
		}
	}

}