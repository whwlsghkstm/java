package Ex06;

public class Sample6 {

	public static void main(String[] args) {
		
		String [] name = {"냉장고", "세탁기", "냉장고"};
		int [] stock = {2, 3, 5};
		int [] price = {300, 100, 150};
		int [] tot = new int[3];
		String [] grade = new String[3];
		int sumTot = 0;
		
		System.out.println("**************매출보고서**************");
		System.out.println("-----------------------------------");
		System.out.println("상품명\t수량\t단가\t금액\t비고");
		System.out.println("-----------------------------------");
		
		for(int i=0; i<=name.length-1; i++) {
			
			tot[i] = stock[i] * price[i];
			
			if(tot[i]>=700) {
				grade[i] = "최우수";
			}
			else if(tot[i]>=500) {
				grade[i] = "우수";
			}
			else {
				grade[i] = "보통";
				
			}
			
			System.out.println(name[i] + "\t" + stock[i] + "\t" + price[i] + 
					"\t" + tot[i] + "\t" + grade[i]);
			sumTot += tot[i];
		}
		
		System.out.println("-----------------------------------");
		System.out.println("매출합계\t\t\t" + sumTot);

	}

}
