package Ex01;

public class Phone {
	//�ʵ� - �Ӽ�
	String model;
	String color;
	
	//method
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	
	void reciveVoice(String message) {
		System.out.println("�� : " + message);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
