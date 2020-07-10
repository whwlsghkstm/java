package Ex02;

public class Sample02 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCompany("쉐보레");
		c1.setMaxSpeed(51000);

		System.out.println("제조회사 : " + c1.getCompany());
		System.out.println("최대속도 : " + c1.getMaxSpeed());
		
	}

}
