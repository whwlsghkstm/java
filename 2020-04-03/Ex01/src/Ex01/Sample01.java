package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) throws Exception{
		
		Scanner s=new Scanner(System.in);
		StudentDAO dao=new StudentDAO();
		
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�Է� | 2.��ȸ | 3.��� | 4.���� | 5.���� | 6.����");
			System.out.println("-------------------------------------------");
			System.out.print("�۾� ��ȣ ���� > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1:		//�л��Է�
					System.out.println(" *** �л��Է� *** ");
					
					StudentVO vo=new StudentVO();
					System.out.print("���ڸ��� �й� �Է� > ");
					String snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						vo.setSnum(snum);
						System.out.print("�л� �̸� �Է� > ");
						vo.setSname(s.next());
						System.out.print("�л� ����ó �Է� > ");
						vo.setStel(s.next());
						
						dao.insert(vo);
						System.out.println("�л� �Է��� �Ϸ� �Ǿ����ϴ�.\n");
					}
					else {
						System.out.println("�̹� �����ϴ� �й��Դϴ�.\n");
					}
					break;
					 
				case 2:		//�л���ȸ
					System.out.println(" *** �л���ȸ *** ");
					
					System.out.print("��ȸ�� �л��� ���ڸ� �й� �Է� > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("��ȸ�Ͻ� �л��� �й��� �������� �ʽ��ϴ�.\n");
					}
					else {
						System.out.println("�л� �̸� : " + vo.getSname());
						System.out.println("�л� ����ó : " + vo.getStel());
						System.out.println();
					}
					break;
					
				case 3:		//�л����
					System.out.println(" *** ������� *** ");
					System.out.println("�й�\t�̸�\t����ó");
					ArrayList<StudentVO> array=dao.list();
					for(int i=0; i<array.size(); i++) {
						vo=array.get(i);
						System.out.print(vo.getSnum()+"\t");
						System.out.print(vo.getSname()+"\t");
						System.out.println(vo.getStel()+"\t");
					}
					System.out.println();
					break;
					
				case 4:		//�л�����
					System.out.println(" *** �������� *** ");
					System.out.print("�л� ������ ������ ���ڸ� �й� �Է� > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("�����Ͻ� �й��� �������� �ʽ��ϴ�.\n");
					}
					else {
						System.out.print("������ �̸� ["+vo.getSname()+"] > ");
						vo.setSname(s.next());
						System.out.print("������ ����ó ["+vo.getStel()+"] > ");
						vo.setStel(s.next());
						dao.update(vo);
						
						System.out.println("�л��� ������ ���� �Ǿ����ϴ�.\n");
					}
					
					break;
					
				case 5:		//�л�����
					System.out.println(" *** �������� *** ");
					System.out.print("������ ������ �й� �Է� > ");
					snum=s.next();
					vo=dao.read(snum);
					
					if(vo.getSnum()==null) {
						System.out.println("�����Ͻ� �й��� �������� �ʽ��ϴ�.\n");
					}
					else {
						dao.delete(snum);
						System.out.println("�����Ͻ� �й��� ������ ���� �Ǿ����ϴ�.\n");
					}
					
					break;
					
				case 6:
					System.out.println("���α׷��� �����մϴ�.\n");
					run=false;
					break;
			}
		}
		
	}

}