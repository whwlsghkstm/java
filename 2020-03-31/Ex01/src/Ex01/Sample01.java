package Ex01;

public class Sample01 {

	public static void main(String[] args) {
		
		students();
		cars();
	}
	
	public static void students() {
		Student01 s1=new Student01();
		s1.sno="01";
		s1.sname="홍길동";
		s1.sph="010-0000-0001";
		s1.printStudent(s1);
		
		Student01 s2=new Student01();
		s2.sno="02";
		s2.sname="심청이";
		s2.sph="010-0000-0002";
		s2.printStudent(s2);
		
		Student01 s3=new Student01("03", "강감찬", "010-0003-0003");
		s3.printStudent(s3);
		
	}
	
	public static void cars() {
		Car01 car1=new Car01();
		car1.model="스파크";
		car1.color="흰색";
		car1.maxSpeed=200;
		car1.printCar(car1);
		
		Car01 car2=new Car01();
		car2.model="말리부";
		car2.color="검정";
		car2.maxSpeed=300;
		car2.printCar(car2);
		
		Car01 car3=new Car01("트랙스", "빨강", 300);
		car3.printCar(car3);
	}

}
