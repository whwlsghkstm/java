package Ex02;

public class Computer extends Calculator{

	@Override	//상속받은 method를 재정의하는것
	double areaCircle() {
		return radius*radius*3.141592;
	}
	
	
	
}
