package Ex05;

import java.text.DecimalFormat;

//학생 성적관리용 클래스
public class Report {
	
	//필드
	private String rnum;
	private String rname;
	private int kor;
	private int eng;
	private int mat;
	private int rsum;
	private double ravg;
	private char grade;
	
	
	//생성자 - 기본생성자만 사용할 시에는 생략가능
	
	
	//메소드
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getRsum() {
		rsum = kor+eng+mat;
		return rsum;
	}
	public void setRsum(int rsum) {
		this.rsum = rsum;
	}
	public double getRavg() {
		ravg=getRsum()/3.;
		return ravg;
	}
	public void setRavg(double ravg) {
		this.ravg = ravg;
	}
	public char getGrade() {
		if(getRavg()>=90) {
			grade='A';
		}
		else if(getRavg()>=80) {
			grade='B';
		}
		else if(getRavg()>=70) {
			grade='C';
		}
		else {
			grade='F';
		}
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	void printReport() {
		System.out.println(" *** 성적출력 *** ");
		System.out.println("학번 : " + rnum);
		System.out.println("이름 : " + rname);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		System.out.println("총점 : " + getRsum());
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.println("평균 : " + df.format(getRavg()));
		System.out.println("학점 : " + getGrade());
		System.out.println();
	}
	
	void printReport1() {		//성적출력
		System.out.print(rnum + "\t");
		System.out.print(rname + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(getRsum() + "\t");
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.print(df.format(getRavg()) + "\t");
		System.out.println(getGrade());
	}
	
	
}
