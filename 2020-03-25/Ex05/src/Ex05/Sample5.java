package Ex05;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		
		// �迭�� �̿��Ͽ� ����ǥ ���
		// �̸�, ����, ����, ����, ����, ���, ���� >> ���� ����3����
		Scanner scanner = new Scanner(System.in);
		String [] name = {"ȫ�浿", "��û��", "������"};
		int [] kor = {90, 75, 88};
		int [] eng = {87, 89, 93};
		int [] mat = {77, 63, 97};
		int [] tot = new int[3];
		double [] avg = new double[3];
		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		int sumTot = 0;
		double sumAvg = 0;
		String [] grade = new String[3];
		
		System.out.println("�̸�\t����\t����\t����\t����\t���\t\t\t����");
		for(int i=0; i<=name.length-1; i++)	{
			
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.;
			
			if(avg[i]>=90) {
				grade[i] = "A";
			}
			else if(avg[i]>=80) {
				grade[i] = "B";
			}
			else if(avg[i]>=70) {
				grade[i] = "C";
			}
			else if(avg[i]>=60) {
				grade[i] = "D";
			}
			else {
				grade[i] = "F";
			}
			
			System.out.print(name[i] +"\t"+ kor[i] +"\t"+ eng[i] +
					"\t"+ mat[i] +"\t"+ tot[i] +"\t"+ avg[i] +"\t"+ grade[i] + "\n");
			
			sumKor += kor[i]/3;
			sumEng += eng[i]/3;
			sumMat += mat[i]/3;
			sumTot += tot[i]/3;
			sumAvg += avg[i]/3.;
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("����� \t" + sumKor + "\t" + sumEng + "\t" + sumMat + 
				"\t" + sumTot + "\t" + sumAvg);

	}

}