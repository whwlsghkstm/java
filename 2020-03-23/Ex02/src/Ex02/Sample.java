package Ex02;

public class Sample {

	public static void main(String[] args) {
		
		/* �Ǽ��� ����  >> float�� ���� f�� �ٿ�����ؼ� double�� ���� �� */
		/* float num1 = 10.5f; */
		/* float num2 = 20.3f; */
		double num1 = 10.5;
		double num2 = 20.3;
		double num3 = num1 + num2;
		double num4 = num2 - num1;
		double num5 = num1 * num2;
		double num6 = num1 / num2;
		double num7 = num2 / num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + num3);
		System.out.println("num2 - num1 = " + num4);
		System.out.println("num1 * num2 = " + num5);
		System.out.println("num1 / num2 = " + num6);
		System.out.println("num2 / num1 = " + num7);
		
		System.out.println(" ");
		
		/* �������� 5�� ���� ���� */
		int r = 5;
		double area = r * r * 3.14;
		System.out.println("�������� " + r + "�� ���ǳ��� = " + area);
	}

} 
