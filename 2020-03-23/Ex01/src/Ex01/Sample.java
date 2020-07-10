package Ex01;

public class Sample {

	public static void main(String[] args) {
		System.out.println("맥날조 오늘의 점심메뉴");
		System.out.println("자장면보통하나, 탕볶밥하나, 볶짜면하나, 볶짬면하나");
		System.out.println("큰일이다 메뉴가 다 다르다");
		System.out.println("주문은 다른 조가 하는데...");
		
		/* 정수형 변수 */
		int num1=8000;
		int num2=9000;
		int num3=6000;
		int num4=num1 + num2 + num3;
		int num5=num4/3;
		int num6=num1*num2;
		int num7=num2-num1;
		System.out.println("볶짬면은 " + num1 + "원");
		System.out.println("탕볶밥은 " + num2 + "원");
		System.out.println("자장면은 " + num3 + "원");
		System.out.println("다 합치면 " + num4 + "원");
		System.out.println("3명으로 나누면 " + num5 + "원");
		System.out.println("그럴일은 없지만 볶짬면 값과 탕볶밥 값을 곱하면 " + num6 + "원!");
		System.out.println("탕볶밥 값에서 볶짬면 값을 빼면 " + num7 + "원");
	}

}
