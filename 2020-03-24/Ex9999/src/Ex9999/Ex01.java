package Ex9999;

public class Ex01 {

	public static void main(String[] args) {
		/* 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), 
		A%B(나머지)를 출력하는 프로그램을 작성하시오. */
		
		/*
		int a1 = 1;
		int b1 = 2;
		double result1 = a1 + b1;
		double result2 = a1 - b1;
		double result3 = a1 * b1;
		double result4 = (double)(a1 / b1);
		double result5 = (double)(a1 % b1);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		*/
		
		int a = 88;
		String grade = "";
		
		if(a >= 90) {
			grade = "A";
		}
		else if(a >= 80){
			grade = "B";
		}
		else if(a >= 70) {
			grade = "C";
		}
		else if(a >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		System.out.println("등급 > " + grade + "등급입니다.");

	}

}
