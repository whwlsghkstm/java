package Ex03;

public class Sample {

	public static void main(String[] args) {
		
		/* ������ ���� >> ������ ������ ''(�̱���Ʈ) �ȿ� �־���� �Ѵ�. */
		/* �ѱ��ڸ� ������ ���� char >> ''(�̱���Ʈ)
		 * �������ڸ� ������ ���� String >> ""(������Ʈ) */
		char a='A';
		String name="ȫ�浿";
		System.out.println("�� : " + a);
		System.out.println("�̸� : " + name);
		
		System.out.println(" ");
		
		int kor = 85, eng = 90, mat = 100;
		double tot = kor + eng + mat;
		double avg = tot/3;
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		
		System.out.println(" ");
		
		/* ���� ���� >> true or false �� ����*/
		boolean stop = true;
		stop = false; /* >> ���� �������� ���� �� ���� ��� */
		System.out.println("stop : " + stop);
	}

}
