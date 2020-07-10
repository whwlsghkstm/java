package Ex01;

public class Car01 {
	
	//필드
	String company="쉐보레";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자 - 생략가능
	Car01(){
	}
	
	//일반생성자
	Car01(String model, String color, int maxSpeed){
		this.model=model;		//this는 현재 객체의 필드명을 받겠다는 의미
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	//method - 동작
	public void printCar(Car01 c) {
		System.out.println(" *** 자동차정보 *** ");
		System.out.println("회사명 : " + company);
		System.out.println("모델명\t차량 색\t최대속도");
		System.out.println(c.model+"\t"+c.color+"\t"+c.maxSpeed + "km/h");
		System.out.println();
	}

}
