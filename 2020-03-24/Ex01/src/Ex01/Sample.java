package Ex01;

public class Sample {

	public static void main(String[] args) {
		
		
		/* ���� if�� */
		/*
		int score = 100;
		System.out.println("������ " + score + "�� �Դϴ�.");
		if(score >= 90 && score <= 100){
			System.out.println("����� A����Դϴ�.");
		}
		else if(score >= 80 && score <90){
			System.out.println("����� B����Դϴ�.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("����� C����Դϴ�.");
		}
		else {
			System.out.println("����� F����Դϴ�.");
		}
		*/
		
		
		/* ����� ������ 100���� �ֿ�� 
		 * 50���� ���, 50���� �̸� ���� ��� */
		/*
		int sale = 49;
		if(sale >= 100) {
			System.out.println("�� ����� ������ " + sale + "�������� �ֿ���Դϴ�.");
		}
		else if(sale < 100 && sale >= 50) {
			System.out.println("�� ����� ������ " + sale + "�������� ����Դϴ�.");
		}
		else {
			System.out.println("�� ����� ������ " + sale + "�������� �����Դϴ�.");
		} 
		*/
		
		/* ��ø if�� */
		int score = 69;
		String grade = "";
		System.out.println("���� : " + score);
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A0";
			}
		}
		else if(score >= 80) {
			if(score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B0";
			}
		}
		else if(score >= 70) {
			if(score >= 75) {
				grade = "C+";
			}
			else {
				grade = "C0";
			}
		}
		
		else {
			grade = "F";
		}
		System.out.println("��� : " + grade);
		
	}

}