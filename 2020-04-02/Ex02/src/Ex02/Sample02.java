package Ex02;

public class Sample02 {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		c1.radius=5;
		System.out.println("반지름이 " + c1.radius + "인 원의 넓이 : " + c1.areaCircle());
		
		Computer c2=new Computer();
		c2.radius=5;
		System.out.println("더 정확한 원의 넓이 : " + c2.areaCircle());
		
	}

}
