package Ex01;

public class Sample {

	public static void main(String[] args) {
		
		
		/* 다중 if문 */
		/*
		int score = 100;
		System.out.println("점수는 " + score + "점 입니다.");
		if(score >= 90 && score <= 100){
			System.out.println("등급은 A등급입니다.");
		}
		else if(score >= 80 && score <90){
			System.out.println("등급은 B등급입니다.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("등급은 C등급입니다.");
		}
		else {
			System.out.println("등급은 F등급입니다.");
		}
		*/
		
		
		/* 사원의 실적이 100만원 최우수 
		 * 50만원 우수, 50만원 미만 보통 출력 */
		/*
		int sale = 49;
		if(sale >= 100) {
			System.out.println("이 사원의 실적은 " + sale + "만원으로 최우수입니다.");
		}
		else if(sale < 100 && sale >= 50) {
			System.out.println("이 사원의 실적은 " + sale + "만원으로 우수입니다.");
		}
		else {
			System.out.println("이 사원의 실적은 " + sale + "만원으로 보통입니다.");
		} 
		*/
		
		/* 중첩 if문 */
		int score = 69;
		String grade = "";
		System.out.println("점수 : " + score);
		
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
		System.out.println("등급 : " + grade);
		
	}

}
