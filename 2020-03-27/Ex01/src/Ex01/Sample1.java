package Ex01;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		/* if�� Ȱ�� ������� */
		int score = 75;
		if(score<=100 && score>=95) {
			System.out.println("A+\n");
		}
		else if(score<95 && score>=90) {
			System.out.println("A0\n");
		}
		else if(score<90 && score>=85) {
			System.out.println("B+\n");
		}
		else if(score<85 && score>=80) {
			System.out.println("B0\n");
		}
		else if(score<80 && score>=75) {
			System.out.println("C+\n");
		}
		else if(score<75 && score>=70) {
			System.out.println("C0\n");
		}
		else {
			System.out.println("F\n");
		}
		
		
		/* for�� Ȱ���Ͽ� ���� �հ� ���ϱ� */
		int sum=0;
		for(int i=1; i<=100; i+=1) {
			sum+=i;
		}
		System.out.println("for�� �հ� : " + sum + "\n");
		
		/* while�� Ȱ���Ͽ� ���� �հ� ���ϱ� */
		int i=1;
		sum=0;
		while(i<=100) {
			sum+=i;
			i+=1;
		}
		System.out.println("while�� �հ� : " + sum + "\n");
		
		/* ���ѷ��� while�� Ű����� ���� �Է¹޾� ���߱� */
		Scanner s = new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.print("���� �Է�(0�Է½� ����) > ");
			int stop = s.nextInt();
			if(stop==0) {
				run=false;
			}
			System.out.println(stop + " : ��(��) �Է��߽��ϴ�.\n");
		}
		System.out.println("���α׷��� �����մϴ�.\n");
		
		/* �迭 */
		int[] num = {1, 2, 3, 4, 5};
		sum=0;
		for(int j=0; j<num.length; j++) {
			sum+=num[j];
		}
		double avg = (double)sum/num.length;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		
		/* �迭�� �Է¹޾� �Է¹��� ���� �� ���ϱ� */
		int[] number=null;				// ũ�Ⱑ �������� ���� �迭����
		System.out.print("�迭ũ�� > ");
		int count=s.nextInt();			// �迭 ũ�⸦ �Է¹޾� count�� ����
		number = new int[count];		// �Է¹��� count��ŭ �迭�� ����
		
		sum=0;
		for(int j=0; j<count; j++) {
			System.out.print(j+1 + "��° �� > ");
			number[j]=s.nextInt();		// count��ŭ�� �迭�� �ε����� ���� �� �Է�
			sum+=number[j];
		}
		System.out.println("�迭�� �հ� : " + sum);

	}

}