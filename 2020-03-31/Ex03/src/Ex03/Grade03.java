package Ex03;
//���������� Ŭ����
public class Grade03 {
	
	//�ʵ�
	String gnum;
	String gname;
	int kor;
	int eng;
	int mat;
	int gsum;
	double gavg;
	char grade;
	
	//������
	public Grade03(String gnum, String gname, int kor, int eng, int mat) {
		super();
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
}