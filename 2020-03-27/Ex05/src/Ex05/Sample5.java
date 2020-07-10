package Ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample5 {

   public static void main(String[] args) throws Exception{
      
      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "system";
      String password = "1111";

      Class.forName(driver);
      Connection con=DriverManager.getConnection(url, user, password);
      
      
      
      boolean run = true;
      Scanner s=new Scanner(System.in);
      
      while(run) {
         System.out.println("--------------------------");
         System.out.println("1.성적입력 | 2.성적출력 | 3.종료");
         System.out.println("--------------------------");
         System.out.print("메뉴 선택 > ");
         int menu=s.nextInt();
         
         switch(menu) {
            case 1:      //성적입력
               String sql = "insert into tab_grade(sno,sname,kor,eng,mat) "
               		+ "values(?,?,?,?,?)";
               PreparedStatement ps=con.prepareStatement(sql);
               
               sql = "insert into tab_grade(sno,sname,kor,eng,mat) "
               		+ "values(?,?,?,?,?)";
               ps=con.prepareStatement(sql);
               
               System.out.print("번호 > ");
               String sno=s.next();
               System.out.print("이름 > ");
               String sname=s.next();
               System.out.print("국어 점수 > ");
               int kor=s.nextInt();
               System.out.print("영어 점수 > ");
               int eng=s.nextInt();
               System.out.print("수학 점수 > ");
               int mat=s.nextInt();
               
               ps.setString(1,  sno);
               ps.setString(2,  sname);
               ps.setInt(3,  kor);
               ps.setInt(4,  eng);
               ps.setInt(5,  mat);
               ps.execute();
               
               System.out.println(" **입력 완료** ");
               break;
               
            case 2:      //성적출력
               sql = "select * from tab_grade";
               ps = con.prepareStatement(sql);
               ResultSet rs=ps.executeQuery();
               
               System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
               
               while(rs.next()) {
                  kor = rs.getInt("kor");
                  eng = rs.getInt("eng");
                  mat = rs.getInt("mat");
                  int sum = kor + eng + mat;
                  double avg = (double)sum/3;
                  
                  System.out.print(rs.getString("sno")+"\t");
                  System.out.print(rs.getString("sname")+"\t");
                  System.out.print(rs.getInt("kor")+"\t");
                  System.out.print(rs.getInt("eng")+"\t");
                  System.out.print(rs.getInt("mat")+"\t");
                  System.out.print(sum + "\t");
                  System.out.println(avg);
               }
               break;
               
            case 3:      //프로그램 종료
               System.out.println("프로그램을 종료합니다.");
               run=false;
               break;
            default:
               System.out.println("잘못 입력 했습니다.");
               System.out.println("프로그램을 종료합니다.");
               run=false;
         }
      }

   }

}