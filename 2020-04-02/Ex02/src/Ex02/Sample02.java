package Ex02;

public class Sample02 {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		c1.radius=5;
		System.out.println("�������� " + c1.radius + "�� ���� ���� : " + c1.areaCircle());
		
		Computer c2=new Computer();
		c2.radius=5;
		System.out.println("�� ��Ȯ�� ���� ���� : " + c2.areaCircle());
		
	}

}
