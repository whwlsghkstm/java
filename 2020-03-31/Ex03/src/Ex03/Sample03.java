package Ex03;

public class Sample03 {

	public static void main(String[] args) {
		
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
		Grade03[] grade = new Grade03[2];
		grade[0]=new Grade03("01","홍길동",90,80,99);
		grade[1]=new Grade03("02","심청이",93,87,43);
		
		for(int i=0; i<=grade.length-1; i++) {
			grade[i].printGrade();
		}
		
	}

}
