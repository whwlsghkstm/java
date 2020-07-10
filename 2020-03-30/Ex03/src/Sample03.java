import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) throws Exception{
		
		Scanner s=new Scanner(System.in);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1111";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		boolean run=true;
		while(run) {
		System.out.println("------------------------------------");
		System.out.println("1.��ǰ��� | 2.��ǰ��� | 3.��ǰ���� | 4.����");
		System.out.println("------------------------------------");
		System.out.print("�۾� ��ȣ ���� > ");
		
		int menu=s.nextInt();
		
		switch(menu) {
			case 1:			//��ǰ��� - insert
				System.out.println(" *** ��ǰ��� *** ");
				System.out.print("��ǰ��ȣ �Է� > ");
				String gno=s.next();
				System.out.print("��ǰ�� �Է� > ");
				String gname=s.next();
				System.out.print("��ǰ���� �Է� > ");
				int gprice=s.nextInt();
				System.out.print("��ǰ���� �Է� > ");
				int gstock=s.nextInt();
				
				int gsum=gprice*gstock;
				
				String sql="insert into tab_goods(gno, gname, gprice, gstock, gsum) values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, gno);
				ps.setString(2, gname);
				ps.setInt(3, gprice);
				ps.setInt(4, gstock);
				ps.setInt(5, gsum);
				ps.execute();
				
				System.out.println("��ǰ ����� ���� ó�� �Ǿ����ϴ�.\n");
				break;
				
			case 2:			//��ǰ��� - select
				System.out.println(" *** ��ǰ��� *** ");
				
				sql="select * from tab_goods order by gname";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				System.out.println("��ǰ��ȣ\t��ǰ��\t��ǰ����\t��ǰ����\t��ǰ�Ѱ���");
				
				while(rs.next()){
					gno=rs.getString("gno");
					gname=rs.getString("gname");
					gprice=rs.getInt("gprice");
					gstock=rs.getInt("gstock");
					gsum=rs.getInt("gsum");
					System.out.print(gno + "\t");
					System.out.print(gname + "\t");
					System.out.print(gprice + "\t");
					System.out.print(gstock + "\t");
					System.out.println(gsum);
				}
				System.out.println();
				break;
				
			case 3:			//��ǰ���� - update
				System.out.println(" *** ��ǰ���� *** ");
				System.out.print("������ ��ǰ ��ȣ > ");
				gno=s.next();
				sql="select * from tab_goods where gno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, gno);
				rs=ps.executeQuery();
				
				if(rs.next()) {
					gname=rs.getString("gname");
					gprice=rs.getInt("gprice");
					gstock=rs.getInt("gstock");
					System.out.println("��ǰ��ȣ : " + gno);
					System.out.println("��ǰ�� : " + gname);
					System.out.println("��ǰ���� : " + gprice);
					System.out.println("��ǰ���� : " + gstock);

					System.out.print("������ ��ǰ�� [" + gname + "] > ");
					gname=s.next();
					System.out.print("������ ��ǰ���� [" + gprice + "] > ");
					gprice=s.nextInt();
					System.out.print("������ ��ǰ���� [" + gstock + "] > ");
					gstock=s.nextInt();
					
					sql="update tab_goods set gname=?, gprice=?, gstock=? where gno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, gname);
					ps.setInt(2, gprice);
					ps.setInt(3, gstock);
					ps.setString(4, gno);
					ps.execute();
					
					System.out.println("��ǰ�� ���� ���������� �Ϸ��Ͽ����ϴ�.\n");					
				}
				
				break;
				
			case 4:
				System.out.println("���α׷��� �����մϴ�.\n");
				run=false;
				break;
				
			default :
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				System.out.println("���α׷��� �����մϴ�.\n");
				run=false;
		}
		
		}
	}

}