package Ex01;

public class Student01 {
	
	//�ʵ�
	String sno;
	String sname;
	String sph;
	
	//�⺻������ - ��������
	Student01() {		
	}
	
	//�Ϲݻ����� - ���� �̸����� �����ڸ� ����� ��(�����ε�)
	Student01(String sno, String sname, String sph){
		this.sno=sno;		//this�� ���� ��ü�� �ʵ���� �ްڴٴ� �ǹ�
		this.sname=sname;
		this.sph=sph;
	}
	
	//method - ����
	public void printStudent(Student01 s) {
		System.out.println("�й�\t�̸�\t����ó");
		System.out.println(s.sno + "\t" + s.sname + "\t" + s.sph);
		System.out.println();
	}

}
