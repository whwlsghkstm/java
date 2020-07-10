package Ex05;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		
		// 배열을 이용하여 성적표 출력
		// 이름, 국어, 영어, 수학, 총점, 평균, 학점 >> 각각 변수3개씩
		Scanner scanner = new Scanner(System.in);
		String [] name = {"홍길동", "심청이", "강감찬"};
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
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t\t\t학점");
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
		System.out.println("반평균 \t" + sumKor + "\t" + sumEng + "\t" + sumMat + 
				"\t" + sumTot + "\t" + sumAvg);

	}

}
