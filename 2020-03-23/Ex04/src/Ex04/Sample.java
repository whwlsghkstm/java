package Ex04;

public class Sample {

	public static void main(String[] args) {
		
		/* �ڵ�����ȯ(������->ū��) */ 
		char charValue = 'A';
		int intValue = charValue;	/* charValue(1byte) -> intValue(4byte) �ڵ�����ȯ */
		System.out.println(intValue);
		
		double doubleValue = charValue;
		System.out.println(doubleValue);
		
		intValue = 100;
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		/* ��������ȯ(ū��->������) */
		intValue = 65;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue = (int)doubleValue;
		System.out.println(intValue);	
		
		System.out.println(" ");
		
		/* for �ݺ��� */
		for(char i = 'A'; i <= 'Z'; i++) {
			intValue = i;
			System.out.println(i + " : " + intValue);
		}
	}

}
