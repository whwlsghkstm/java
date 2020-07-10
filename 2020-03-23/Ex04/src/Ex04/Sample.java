package Ex04;

public class Sample {

	public static void main(String[] args) {
		
		/* 자동형변환(작은것->큰것) */ 
		char charValue = 'A';
		int intValue = charValue;	/* charValue(1byte) -> intValue(4byte) 자동형변환 */
		System.out.println(intValue);
		
		double doubleValue = charValue;
		System.out.println(doubleValue);
		
		intValue = 100;
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		/* 강제형변환(큰것->작은것) */
		intValue = 65;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue = (int)doubleValue;
		System.out.println(intValue);	
		
		System.out.println(" ");
		
		/* for 반복문 */
		for(char i = 'A'; i <= 'Z'; i++) {
			intValue = i;
			System.out.println(i + " : " + intValue);
		}
	}

}
