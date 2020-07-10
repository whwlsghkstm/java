package Ex05;

public class Sample {

	public static void main(String[] args) {
		
		/* 산술연산자 */
		int num1 = 10;
		int num2 = 3;
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		
		/* 사칙연산(+, -, *, /, %)의 연산결과 출력 */
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);
		
		System.out.println("--------------------------------");
		
		/* 관계연산자 */
		boolean result6 = num1==num2;
		System.out.println(num1 + "==" + num2 + " : " + result6);
		result6 = num1>num2;
		System.out.println(num1 + ">" + num2 + " : " + result6);
		result6 = num1<num2;
		System.out.println(num1 + "<" + num2 + " : " + result6);
		result6 = num1>=num2;
		System.out.println(num1 + ">=" + num2 + " : " + result6);
		result6 = num1<=num2;
		System.out.println(num1 + "<=" + num2 + " : " + result6);
		result6 = num1 != num2;
		System.out.println(num1 + "!=" + num2 + " : " + result6);
		
		
		/* 논리연산자 >> and, or, not */
		result6 = (num1>10) || (num2<5); 	// or >> || 둘 중 하나라도 참이면 참
		System.out.println("--------------------------------");
		System.out.println(result6);
		
		result6 = (num1>10) && (num2<5); 	// and >> && 둘 모두 참이여야 참
		System.out.println(result6);
		result6 = !(num1>10) && (num2<5);	// not >> ! 표시
		System.out.println(result6);
		
		System.out.println("--------------------------------");
		
		/* 20세이상이면 입장가능 아니면 불가능 출력 */
		int age = 23;
		char gender = 'M';
		
		if(age >= 20 && gender == 'M') {
			System.out.println("입장가능");
		}
		else {
			System.out.println("입장불가");
		}
		
		System.out.println("--------------------------------");
		
		/* 국어, 영어 점수가 각 70점 이상이고 평균이 70점 이상이면 합격 */
		int kor = 90, eng = 60;
		double avg = (double)(kor+eng)/2;
		if(kor >= 70 && eng >= 70 && avg >= 70){
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("--------------------------------");
		
		/* 삼항연산자 */
		int grade = 65;
		if(grade < 70) {
			System.out.println("불합격");
		}
		else {
			System.out.println("합격");
		}
		
		System.out.println("--------------------------------");
		
		/* String >> 조건 ? 1번 : 2번 >> 조건에 맞다면 1번 틀리면 2번 */
		System.out.println("삼항연산자");
		String result = (grade < 70) ? "불합격" : "합격";
		System.out.println(result);
		
		System.out.println("--------------------------------");
		
		/* 단항연산자 */
		System.out.println("단항연산자");
		System.out.println(++grade);
		
		System.out.println("--------------------------------");
		
		/* 대입연산자 */
		System.out.println("대입연산자");
		
		grade = 60;
		System.out.println(grade);
		grade = grade + 3; // == grade += 3;
		System.out.println(grade);
		grade = grade - 3; // == grade -= 3;
		System.out.println(grade);
	}

}
