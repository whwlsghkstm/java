package Ex06;

public class Sample6 {

	public static void main(String[] args) {
		
		String [] name = {"�����", "��Ź��", "�����"};
		int [] stock = {2, 3, 5};
		int [] price = {300, 100, 150};
		int [] tot = new int[3];
		String [] grade = new String[3];
		int sumTot = 0;
		
		System.out.println("**************���⺸����**************");
		System.out.println("-----------------------------------");
		System.out.println("��ǰ��\t����\t�ܰ�\t�ݾ�\t���");
		System.out.println("-----------------------------------");
		
		for(int i=0; i<=name.length-1; i++) {
			
			tot[i] = stock[i] * price[i];
			
			if(tot[i]>=700) {
				grade[i] = "�ֿ��";
			}
			else if(tot[i]>=500) {
				grade[i] = "���";
			}
			else {
				grade[i] = "����";
				
			}
			
			System.out.println(name[i] + "\t" + stock[i] + "\t" + price[i] + 
					"\t" + tot[i] + "\t" + grade[i]);
			sumTot += tot[i];
		}
		
		System.out.println("-----------------------------------");
		System.out.println("�����հ�\t\t\t" + sumTot);

	}

}