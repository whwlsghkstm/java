package Ex02;

public class Calculator02 {
	
	//�ʵ�
	int x;
	int y;
	
	//������ - ��ü�� ����
	Calculator02(){
		
	}

	//�Ϲݻ�����
	Calculator02(int x, int y){
		this.x=x;		//this�� ���� ��ü�� �ʵ���� �ްڴٴ� �ǹ�
		this.y=y;
	}
	
	//method - ����
	int plus(int x, int y) {		//method �����Ҷ� return�� Ÿ���� �־�� �Ѵ�. -> int
		int result=x+y;
		return result;
	}
	
	int minus(int x, int y) {
		int result=x-y;
		return result;
	}
	
	double rhqgkrl(int x, int y) {		//method�� return Ÿ���� �ٲ��� method�� Ÿ�Ե� ����
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
