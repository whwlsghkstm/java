package Ex01;

import java.util.Scanner;

public class Sample1 {
   
   public static void method1() {
      
      //�̸�, ����, ����, ���� Ű���� �Է�
            //����, ��� ���
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("�̸� : ");
            String name = scanner.next();
            
            System.out.print("���� : ");
            int kor = scanner.nextInt();
            
            System.out.print("���� : ");
            int eng = scanner.nextInt();
            
            System.out.print("���� : ");
            int mat = scanner.nextInt();
            
            int tot = kor + eng + mat;
            double avg = (double)tot/3;
            
            System.out.println("���� : " + tot);
            System.out.println("��� : " + avg);
            
   }

   public static void method2() {
      
      // ���� �������� �Է� �޾� ���� ���̸� ���Ѵ�.
      // r = 0 �̸� ���α׷� ����
      
      boolean run = true;
      
      while(run) {
         Scanner scanner = new Scanner(System.in);      
         System.out.print("���� ������ : ");
         int r = scanner.nextInt();
      
         double area = r * r * 3.14;
         System.out.println("���� ���� : " + area + "\n");
         
         if(r==0) {
        	 System.out.println("���α׷� ����");
        	 run = false;
         }
      }
      
   }
   
   public static void method3() {
	   
	   // �ﰢ���� ���̿� �غ��� Ű���忡 �Է�
	   // �ﰢ���� ���̸� ���Ͽ� ����Ѵ�.
	   boolean run = true;
	   
	   while(run) {
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("�ﰢ���� ���̸� ���Ѵ�.(y/n)");
		   String q=scanner.next();
		   if(q.equals("y") || q.equals("Y")) {
		   
			   System.out.print("�ﰢ���� ���� : ");
			   int h = scanner.nextInt();
			   System.out.print("�ﰢ���� �غ� : ");
			   int w = scanner.nextInt();
		   
			   double area = h * w * 1/2.; // ���Ŀ� . �� ���̸� �Ǽ������� ��°���
			   System.out.println("�ﰢ���� ���� : " + area + "\n");
			   		if(h==0 || w==0) {
			   			System.out.println("���α׷� ����");
			   			run=false;
			   		}
		   }
		   else if(q.equals("n") || q.equals("N")) {
			   System.out.println("���α׷��� ���� �Ͻðڽ��ϱ�?(y/n)");
			   String q2 = scanner.next();
			   if(q2.equals("y") || q2.equals("y")) {
				   System.out.println("���α׷� ����");
				   run=false;
			   }
			   else if(q2.equals("n") || q2.equals("N")) {
				   
			   }
			   else {
				   System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			   }
		   }
		   else {
			   System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		   }
		   
	   }
	   
   }
   
   public static void main(String[] args) {
      
      // method1();
      // method2();
	  // method3();
	   
	   System.out.println("1. �������α׷�");
	   System.out.println("2. ���� ����");
	   System.out.println("3. �ﰢ���� ����");
	   System.out.println("4. ���α׷� ����");
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("��ȣ ���� : ");
	   int menu = scanner.nextInt();	   
	   
	   switch(menu) {
	   		case 1:
	   			method1();
	   			break;
	   		case 2:
	   			method2();
	   			break;
	   		case 3:
	   			method3();
	   			break;
	   		case 4:
	   			System.out.println("���α׷� ����");
	   			break;
	   		default :
	   			System.out.println("�߸� �Է� �ϼ̽��ϴ�.\n���α׷��� �����մϴ�.");
	   }
      
   }

}