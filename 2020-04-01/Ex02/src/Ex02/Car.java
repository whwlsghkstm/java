package Ex02;

public class Car {
	
	//�ʵ� - �� Ŭ������ ������ �ִ� �Ӽ�
	private String company;
	private int maxSpeed;
	
	//set()�޼ҵ� - ���� �Է¹ޱ�
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
	
	//get()�޼ҵ�
	public String getCompany() {
		return company;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	//������
	Car(){
		
	}
	
	//�޼ҵ�
	void printCar() {
		System.out.println("����ȸ�� : " + company);
		System.out.println("�ִ�ӵ� : " + maxSpeed);
	}
	
}
