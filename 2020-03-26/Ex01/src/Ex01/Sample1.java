package Ex01;

public class Sample1 {

	public static void main(String[] args) {
		
		int [] num= {90, 91, 78, 93, 82, 71, 49, 53, 93};
		int sum = 0;
		int max = -99999;
		int min = 999999;
		
		for(int i=0; i<=num.length-1; i++) {			
			sum += num[i];
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		double avg = (double)sum/num.length;
		
		System.out.println("������ �հ� : " + sum);
		System.out.println("������ ��� : " + avg);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

}
