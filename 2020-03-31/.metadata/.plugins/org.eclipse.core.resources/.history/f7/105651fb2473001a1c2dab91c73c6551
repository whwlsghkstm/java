package Ex04;
//성적관리용 클래스
public class Grade04 {
	
	//필드
	String gnum;
	String gname;
	int kor;
	int eng;
	int mat;
	int gsum;
	double gavg;
	char grade;
	
	//기본생성자
	Grade04() {
		
	}
	
	//생성자
	public Grade04(String gnum, String gname, int kor, int eng, int mat) {
		this.gnum = gnum;
		this.gname = gname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//method	
	void printGrade() {
		this.gsum=this.kor+this.eng+this.mat;
		this.gavg=this.gsum/3.;
		System.out.println(this.gnum+"\t"+this.gname+"\t"+this.kor+"\t"
				+this.eng+"\t"+this.mat+"\t"+this.gsum+"\t"+this.gavg);
	}
	void printGrade1() {
		System.out.println("이름 : " + this.gname);
		System.out.println("학번 : " + this.gnum);
		System.out.println("국어 점수 : " + this.kor);
		System.out.println("영어 점수 : " + this.eng);
		System.out.println("수학 점수 : " + this.mat);
		this.gsum=this.kor+this.eng+this.mat;
		this.gavg=this.gsum/3;
		System.out.println("총점 : " + this.gsum);
		System.out.println("평균 : " + this.gavg);
		System.out.println();
	}
}
