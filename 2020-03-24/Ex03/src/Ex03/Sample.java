package Ex03;

public class Sample {

	public static void main(String[] args) {
		String name = "�����";
		int price = 100, number = 1;
		int tot = price * number;
		String remark = "";
		
		if(tot >= 1000) {
			remark = "�ֿ��";
		}
		else if(tot >=500){
			remark = "���";
		}
		else{
			remark = "����";
		}
		System.out.println("�� ����� " + name + " �Ǹž��� " + tot + "�������� " + remark + "�Դϴ�.");

	}

}