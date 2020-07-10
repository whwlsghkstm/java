package Ex01;

import java.util.Scanner;

public class Sample1 {
   
   public static void method1() {
      
      //이름, 국어, 영어, 수학 키보드 입력
            //충점, 평균 출력
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("이름 : ");
            String name = scanner.next();
            
            System.out.print("국어 : ");
            int kor = scanner.nextInt();
            
            System.out.print("영어 : ");
            int eng = scanner.nextInt();
            
            System.out.print("수학 : ");
            int mat = scanner.nextInt();
            
            int tot = kor + eng + mat;
            double avg = (double)tot/3;
            
            System.out.println("총점 : " + tot);
            System.out.println("평균 : " + avg);
            
   }

   public static void method2() {
      
      // 원의 반지름을 입력 받아 원의 넓이를 구한다.
      // r = 0 이면 프로그램 종료
      
      boolean run = true;
      
      while(run) {
         Scanner scanner = new Scanner(System.in);      
         System.out.print("원의 반지름 : ");
         int r = scanner.nextInt();
      
         double area = r * r * 3.14;
         System.out.println("원의 넓이 : " + area + "\n");
         
         if(r==0) {
        	 System.out.println("프로그램 종료");
        	 run = false;
         }
      }
      
   }
   
   public static void method3() {
	   
	   // 삼각형의 높이와 밑변을 키보드에 입력
	   // 삼각형의 넓이를 구하여 출력한다.
	   boolean run = true;
	   
	   while(run) {
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("삼각형의 넓이를 구한다.(y/n)");
		   String q=scanner.next();
		   if(q.equals("y") || q.equals("Y")) {
		   
			   System.out.print("삼각형의 높이 : ");
			   int h = scanner.nextInt();
			   System.out.print("삼각형의 밑변 : ");
			   int w = scanner.nextInt();
		   
			   double area = h * w * 1/2.; // 수식에 . 을 붙이면 실수형으로 출력가능
			   System.out.println("삼각형의 넓이 : " + area + "\n");
			   		if(h==0 || w==0) {
			   			System.out.println("프로그램 종료");
			   			run=false;
			   		}
		   }
		   else if(q.equals("n") || q.equals("N")) {
			   System.out.println("프로그램을 종료 하시겠습니까?(y/n)");
			   String q2 = scanner.next();
			   if(q2.equals("y") || q2.equals("y")) {
				   System.out.println("프로그램 종료");
				   run=false;
			   }
			   else if(q2.equals("n") || q2.equals("N")) {
				   
			   }
			   else {
				   System.out.println("잘못 입력하셨습니다.");
			   }
		   }
		   else {
			   System.out.println("잘못 입력하셨습니다.");
		   }
		   
	   }
	   
   }
   
   public static void main(String[] args) {
      
      // method1();
      // method2();
	  // method3();
	   
	   System.out.println("1. 성적프로그램");
	   System.out.println("2. 원의 넓이");
	   System.out.println("3. 삼각형의 넓이");
	   System.out.println("4. 프로그램 종료");
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("번호 선택 : ");
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
	   			System.out.println("프로그램 종료");
	   			break;
	   		default :
	   			System.out.println("잘못 입력 하셨습니다.\n프로그램을 종료합니다.");
	   }
      
   }

}