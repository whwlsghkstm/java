package Ex9999;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력 > ");
		int score = scanner.nextInt();
		String grade = "";
		
		if(score >=90) {
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
		else if(score >= 60) {
			if(score >= 65) {
				grade = "D+";
			}
			else {
				grade = "D0";
			}
		}
		else {
			grade = "F";
		}
		
		System.out.println("시험점수는 " + score + "점으로 학점은 " + grade + "입니다." );

	}

}
