package Ex01;

public class Sample01 {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.powerOn();
		p1.reciveVoice("��~ �߱����Դϴ�~");
		p1.sendVoice("�� ��� �����Ϳ�");
		p1.reciveVoice("��~ ��� ���� "
				+ "����߾��");
		p1.sendVoice("����ó� �ȸ����Ŵϱ� ����������");
		p1.hangup();
		p1.powerOff();
		System.out.println();
		
		DmbPhone d1 = new DmbPhone("�Ｚ ������", "������", 11);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannel(9);
		d1.turnOffDmb();
		d1.powerOff();
		System.out.println();
	}

}