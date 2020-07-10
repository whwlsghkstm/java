package Ex02;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {	//void - return 타입이 없는 method
		Calculator();
		Area02();

	}
	
	public static void Calculator() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("x값 입력 > ");
		int x=s.nextInt();
		System.out.print("y값 입력 > ");
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
		System.out.print("삼각형의 밑변 입력 > ");
		int w=s.nextInt();
		System.out.print("삼각형의 높이 입력 > ");
		int h=s.nextInt();		
		System.out.println("삼각형의 넓이 : " + Area02.area(w, h));
		System.out.println();
		
		System.out.print("사각형의 가로 길이 입력 > ");
		int x=s.nextInt();
		System.out.print("사각형의 세로 길이 입력 > ");
		int y=s.nextInt();
		System.out.println("사각형의 넓이 : " + Area02.area1(x, y));
		System.out.println();
		
		System.out.print("정사각형 한 변의 길이 입력 > ");
		x=s.nextInt();
		System.out.println("정사각형의 넓이 : " + Area02.area1(x));
		System.out.println();
		
		System.out.print("원의 반지름 입력 > ");
		int r=s.nextInt();
		System.out.println("원의 넓이 : " + Area02.area2(r));
	}

}
