package Ex02;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {	//void - return Ÿ���� ���� method
		Calculator();
		Area02();

	}
	
	public static void Calculator() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("x�� �Է� > ");
		int x=s.nextInt();
		System.out.print("y�� �Է� > ");
		int y=s.nextInt();
		
		Calculator02 c1=new Calculator02(x, y);
		System.out.println("x = " + c1.x);
		System.out.println("y = " + c1.y);
		System.out.println("x + y = " + c1.plus(c1.x, c1.y));
		System.out.println("x - y = " + c1.minus(c1.x, c1.y));
		System.out.println("x * y = " + c1.rhqgkrl(c1.x, c1.y));
		System.out.println("x / y = " + c1.sksnrl(c1.x, c1.y));
		System.out.println("x % y = " + c1.skajwl(c1.x, c1.y));
		System.out.println();
	}
	
	public static void Area02(){
		Scanner s=new Scanner(System.in);
		System.out.print("�ﰢ���� �غ� �Է� > ");
		int w=s.nextInt();
		System.out.print("�ﰢ���� ���� �Է� > ");
		int h=s.nextInt();		
		System.out.println("�ﰢ���� ���� : " + Area02.area(w, h));
		System.out.println();
		
		System.out.print("�簢���� ���� ���� �Է� > ");
		int x=s.nextInt();
		System.out.print("�簢���� ���� ���� �Է� > ");
		int y=s.nextInt();
		System.out.println("�簢���� ���� : " + Area02.area1(x, y));
		System.out.println();
		
		System.out.print("���簢�� �� ���� ���� �Է� > ");
		x=s.nextInt();
		System.out.println("���簢���� ���� : " + Area02.area1(x));
		System.out.println();
		
		System.out.print("���� ������ �Է� > ");
		int r=s.nextInt();
		System.out.println("���� ���� : " + Area02.area2(r));
	}

}