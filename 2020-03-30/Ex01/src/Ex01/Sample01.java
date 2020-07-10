package Ex01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1111";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		boolean run=true;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.�Է� | 2.��� | 3.���� | 4.���� | 5.����");
			System.out.println("-----------------------------------");
			System.out.print("�۾����� > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1:		//������ �Է�
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
					String sql="insert into tab_grade(sno,sname,kor,eng,mat,tot,aveg)"
							+ " values(?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, sno);
					ps.setString(2,  sname);
					ps.setInt(3, kor);
					ps.setInt(4, eng);
					ps.setInt(5, mat);
					ps.setInt(6, kor+eng+mat);
					ps.setInt(7, (kor+eng+mat)/3);
					ps.execute();
					
					System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
					System.out.println();
					break;
					
				case 2:		//������ ���
					sql = "select * from tab_grade order by sno";
					ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					System.out.println("��ȣ\t�̸�\t��������\t��������\t��������\t����\t���");
					
					while(rs.next()) {
						sno = rs.getString("sno");
						sname = rs.getString("sname");
						kor = rs.getInt("kor");
						eng = rs.getInt("eng");
						mat = rs.getInt("mat");
						int tot = kor+eng+mat;
						double aveg = (double)tot/3;
						System.out.print(sno + "\t");
						System.out.print(sname + "\t");
						System.out.print(kor + "\t");
						System.out.print(eng + "\t");
						System.out.print(mat + "\t");
						System.out.print(tot + "\t");
						System.out.println(aveg + "\t");
					}
					System.out.println();
					break;
					
				case 3:		//������ ����
					System.out.print("������ ��ȣ �Է� > ");
					sno=s.next();
					sql="select * from tab_grade where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, sno);
					rs=ps.executeQuery();
					if(rs.next()) {
						sname=rs.getString("sname");
						kor=rs.getInt("kor");
						eng=rs.getInt("eng");
						mat=rs.getInt("mat");
						System.out.println("�̸� : " + sname);
						System.out.println("���� ���� : " + kor);
						System.out.println("���� ���� : " + eng);
						System.out.println("���� ���� : " + mat);

						System.out.print("������ ���� ���� ["+kor+"] > ");
						kor=s.nextInt();
						System.out.print("������ ���� ���� ["+eng+"] > ");
						eng=s.nextInt();
						System.out.print("������ ���� ���� ["+mat+"] > ");
						mat=s.nextInt();
						
						sql="update tab_grade set kor=?, eng=?, mat=? where sno=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, kor);
						ps.setInt(2, eng);
						ps.setInt(3, mat);
						ps.setString(4, sno);
						ps.execute();
						
						System.out.println("������ ������ �Ϸ� �Ǿ����ϴ�.");
						System.out.println();
					}
					else {
						System.out.println("�����Ͱ� �����ϴ�.");
					}
					break;
					
				case 4:		//������ ����
					System.out.print("������ ��ȣ �Է� > ");
					sno=s.next();
					sql="delete tab_grade where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, sno);
					ps.execute();
					System.out.println("�����Ͱ� ���� �Ǿ����ϴ�.");
					System.out.println();
					break;
					
				case 5:		//���α׷� ����
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
					
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println("�ٽ� �Է����ּ���.\n");
			}
			
		}
		
		
	}

}
