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
         System.out.println("1.�����Է� | 2.������� | 3.����");
         System.out.println("--------------------------");
         System.out.print("�޴� ���� > ");
         int menu=s.nextInt();
         
         switch(menu) {
            case 1:      //�����Է�
               String sql = "insert into tab_grade(sno,sname,kor,eng,mat) "
               		+ "values(?,?,?,?,?)";
               PreparedStatement ps=con.prepareStatement(sql);
               
               sql = "insert into tab_grade(sno,sname,kor,eng,mat) "
               		+ "values(?,?,?,?,?)";
               ps=con.prepareStatement(sql);
               
               System.out.print("��ȣ > ");
               String sno=s.next();
               System.out.print("�̸� > ");
               String sname=s.next();
               System.out.print("���� ���� > ");
               int kor=s.nextInt();
               System.out.print("���� ���� > ");
               int eng=s.nextInt();
               System.out.print("���� ���� > ");
               int mat=s.nextInt();
               
               ps.setString(1,  sno);
               ps.setString(2,  sname);
               ps.setInt(3,  kor);
               ps.setInt(4,  eng);
               ps.setInt(5,  mat);
               ps.execute();
               
               System.out.println(" **�Է� �Ϸ�** ");
               break;
               
            case 2:      //�������
               sql = "select * from tab_grade";
               ps = con.prepareStatement(sql);
               ResultSet rs=ps.executeQuery();
               
               System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
               
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
               
            case 3:      //���α׷� ����
               System.out.println("���α׷��� �����մϴ�.");
               run=false;
               break;
            default:
               System.out.println("�߸� �Է� �߽��ϴ�.");
               System.out.println("���α׷��� �����մϴ�.");
               run=false;
         }
      }

   }

}