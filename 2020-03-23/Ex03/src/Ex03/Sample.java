package Ex03;

public class Sample {

	public static void main(String[] args) {
		
		/* 문자형 변수 >> 문자형 변수는 ''(싱글쿼트) 안에 넣어줘야 한다. */
		/* 한글자를 저장할 때는 char >> ''(싱글쿼트)
		 * 여러글자를 저장할 때는 String >> ""(더블쿼트) */
		char a='A';
		String name="홍길동";
		System.out.println("반 : " + a);
		System.out.println("이름 : " + name);
		
		System.out.println(" ");
		
		int kor = 85, eng = 90, mat = 100;
		double tot = kor + eng + mat;
		double avg = tot/3;
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		System.out.println(" ");
		
		/* 논리형 변수 >> true or false 만 가능*/
		boolean stop = true;
		stop = false; /* >> 제일 마지막에 선언 된 값을 출력 */
		System.out.println("stop : " + stop);
	}

}
