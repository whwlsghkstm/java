package Ex03;

public class Sample03 {

	public static void main(String[] args) {
		
		System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���");
		Grade03[] grade = new Grade03[2];
		grade[0]=new Grade03("01","ȫ�浿",90,80,99);
		grade[1]=new Grade03("02","��û��",93,87,43);
		
		for(int i=0; i<=grade.length-1; i++) {
			grade[i].printGrade();
		}
		
	}

}