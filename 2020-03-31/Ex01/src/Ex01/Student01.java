package Ex01;

public class Student01 {
	
	//필드
	String sno;
	String sname;
	String sph;
	
	//기본생성자 - 생략가능
	Student01() {		
	}
	
	//일반생성자 - 같은 이름으로 생성자를 만드는 것(오버로딩)
	Student01(String sno, String sname, String sph){
		this.sno=sno;		//this는 현재 객체의 필드명을 받겠다는 의미
		this.sname=sname;
		this.sph=sph;
	}
	
	//method - 동작
	public void printStudent(Student01 s) {
		System.out.println("학번\t이름\t연락처");
		System.out.println(s.sno + "\t" + s.sname + "\t" + s.sph);
		System.out.println();
	}

}
