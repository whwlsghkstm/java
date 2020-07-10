package Ex01;

public class DmbPhone extends Phone{
	
	//필드
	int channel;
	
	//일반생성자
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번의 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		System.out.println(channel + "번 채널로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	
}
