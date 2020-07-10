package Ex02;

public class Calculator02 {
	
	//필드
	int x;
	int y;
	
	//생성자 - 객체를 생성
	Calculator02(){
		
	}

	//일반생성자
	Calculator02(int x, int y){
		this.x=x;		//this는 현재 객체의 필드명을 받겠다는 의미
		this.y=y;
	}
	
	//method - 동작
	int plus(int x, int y) {		//method 정의할때 return의 타입이 있어야 한다. -> int
		int result=x+y;
		return result;
	}
	
	int minus(int x, int y) {
		int result=x-y;
		return result;
	}
	
	double rhqgkrl(int x, int y) {		//method의 return 타입이 바뀔경우 method의 타입도 변경
		double result=(double)x*y;
		return result;
	}
	
	double sksnrl(int x, int y) {
		double result=(double)x/y;
		return result;
	}
	
	int skajwl(int x, int y) {
		int result=x%y;
		return result;
	}
}
