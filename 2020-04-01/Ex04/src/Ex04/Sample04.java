package Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList<Report> array=new ArrayList<Report>();
		
		boolean run=true;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println(" 1.�����Է� �� 2.������ȸ �� 3.������� �� 4.����");
			System.out.println("-------------------------------------");
			System.out.print("�۾� ��ȣ ���� > ");
			int menu=s.nextInt();
			System.out.println();
			switch(menu) {
				case 1:		//�����Է�
					Report r=new Report();
					System.out.print("�й� �Է� > ");
					r.setRnum(s.next());
					System.out.print("�̸� �Է� > ");
					r.setRname(s.next());
					System.out.print("���� ���� �Է� > ");
					r.setKor(s.nextInt());
					System.out.print("���� ���� �Է� > ");
					r.setEng(s.nextInt());
					System.out.print("���� ���� �Է� > ");
					r.setMat(s.nextInt());
					array.add(r);
					System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.\n");
					break;
					
				case 2:		//������ȸ
					System.out.print("������ ��ȸ�� �й� �Է� > ");
					String num=s.next();
					
					boolean find=false;
					for(int i=0; i<array.size(); i++) {
						r=array.get(i);
						if(num.equals(r.getRnum())) {
							r.printReport();
							find=true;
						}
					}
					if(find==false) {
						System.out.println("�Է��Ͻ� �й��� �������� �ʽ��ϴ�.\n");
					}
					break;
					
				case 3:		//�������
					for(int i=0; i<array.size(); i++) {
						r=array.get(i);
						r.printReport
						();
						System.out.println();
					}
					break;
					
				case 4:		//���α׷�����
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
			}
		}
		
		
	}

}
