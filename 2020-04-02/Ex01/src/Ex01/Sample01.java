package Ex01;

public class Sample01 {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.powerOn();
		p1.reciveVoice("예~ 중국성입니다~");
		p1.sendVoice("아 배달 언제와요");
		p1.reciveVoice("예~ 방금 전에 "
				+ "출발했어요");
		p1.sendVoice("웃기시네 안먹을거니까 오지마세요");
		p1.hangup();
		p1.powerOff();
		System.out.println();
		
		DmbPhone d1 = new DmbPhone("삼성 갤럭시", "검정색", 11);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannel(9);
		d1.turnOffDmb();
		d1.powerOff();
		System.out.println();
	}

}
