package Ex01;

public class DmbPhone extends Phone{
	
	//�ʵ�
	int channel;
	
	//�Ϲݻ�����
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "���� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannel(int channel) {
		System.out.println(channel + "�� ä�η� �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
	
}
