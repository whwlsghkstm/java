package Ex02;

public class Car {
	
	//필드 - 이 클래스가 가지고 있는 속성
	private String company;
	private int maxSpeed;
	
	//set()메소드 - 값을 입력받기
	public void setCompany(String company) {
		this.company=company;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed<0) {
			this.maxSpeed = 0;
		}
		else {
			this.maxSpeed=maxSpeed;
		}
	}
	
	//get()메소드
	public String getCompany() {
		return company;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	//생성자
	Car(){
		
	}
	
	//메소드
	void printCar() {
		System.out.println("제조회사 : " + company);
		System.out.println("최대속도 : " + maxSpeed);
	}
	
}
