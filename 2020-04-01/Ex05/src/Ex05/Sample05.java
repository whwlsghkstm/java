package Ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) throws Exception{
		
		Scanner s=new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1111";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		boolean run=true;
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" 1.�����Է� | 2.������ȸ | 3.������� | 4.�������� | 5.�������� | 6.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("�۾� ��ȣ ���� > ");
			int menu=s.nextInt();
			System.out.println();
			switch(menu) {
				case 1:		//�����Է�
					System.out.println(" *** �����Է� *** ");
					Report r=new Report();
					System.out.print("�й� �Է� > ");
					
					String num = s.next();
					sql="select * from tab_report where rnum=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, num);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						System.out.println("�̹� �����ϴ� �й��Դϴ�.");
						System.out.println("�ʱ�ȭ������ ���ư��ϴ�.\n");
					}
					else {
						r.setRnum(num);
						System.out.print("�̸� �Է� > ");
						r.setRname(s.next());
						System.out.print("���� ���� �Է� > ");
						r.setKor(s.nextInt());
						System.out.print("���� ���� �Է� > ");
						r.setEng(s.nextInt());
						System.out.print("���� ���� �Է� > ");
						r.setMat(s.nextInt());
						
						sql="insert into tab_report values(?,?,?,?,?)";
						ps=con.prepareStatement(sql);
						ps.setString(1, r.getRnum());
						ps.setString(2, r.getRname());
						ps.setInt(3, r.getKor());
						ps.setInt(4, r.getEng());
						ps.setInt(5, r.getMat());
						ps.execute();
						
						System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.\n");
					}
					break;
					
				case 2:		//������ȸ
					System.out.println(" *** ������ȸ ***");
					System.out.print("���� ��ȸ ������ �й� �Է� > ");
					num=s.next();
					
					sql="select * from tab_report where rnum=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, num);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						r=new Report();
						r.setRnum(rs.getString("rnum"));
						r.setRname(rs.getString("rname"));
						r.setKor(rs.getInt("kor"));
						r.setEng(rs.getInt("eng"));
						r.setMat(rs.getInt("mat"));
						r.printReport1();
						System.out.println();
					}
					else {
						System.out.println("�Է��Ͻ� �й��� ��ġ�ϴ� ������ �����ϴ�.\n");
					}
					break;
					
				case 3:		//�������
					System.out.println(" *** ������� *** ");
					System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���\t����");
					
					sql="select * from tab_report order by rnum";
					ps=con.prepareStatement(sql);
					rs=ps.executeQuery();
					
					while(rs.next()) {
						r=new Report();
						r.setRnum(rs.getString("Rnum"));
						r.setRname(rs.getString("Rname"));
						r.setKor(rs.getInt("kor"));
						r.setEng(rs.getInt("Eng"));
						r.setMat(rs.getInt("mat"));
						r.printReport1();
					}
					System.out.println();
					break;
					
				case 4:		//��������
					System.out.print("������ ������ �й� �Է� > ");
					num=s.next();
					sql="select * from tab_report where rnum=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, num);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						r=new Report();
						r.setRnum(rs.getString("rnum"));
						r.setRname(rs.getString("rname"));
						r.setKor(rs.getInt("kor"));
						r.setEng(rs.getInt("eng"));
						r.setMat(rs.getInt("mat"));
						
						System.out.println("�̸� : " + r.getRname());
						System.out.print("������ ���� ���� �Է�[" + r.getKor() + "] > ");
						r.setKor(s.nextInt());
						System.out.print("������ ���� ���� �Է�[" + r.getEng() + "] > ");
						r.setEng(s.nextInt());
						System.out.print("������ ���� ���� �Է�[" + r.getMat() + "] > ");
						r.setMat(s.nextInt());
						
						sql="update tab_report set kor=?,eng=?,mat=? where rnum=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, r.getKor());
						ps.setInt(2, r.getEng());
						ps.setInt(3, r.getMat());
						ps.setString(4, r.getRnum());
						ps.execute();
						
						System.out.println("�Է��Ͻ� �й��� ������ ���� �Ǿ����ϴ�.\n");
					}
					else {
						System.out.println("�Է��Ͻ� �й��� �������� �ʽ��ϴ�.\n");
					}
					
					break;
					
				case 5:		//��������
					System.out.println(" *** �������� *** ");
					System.out.print("������ ������ �й� �Է� > ");
					num=s.next();
					
					sql="select * from tab_report where rnum=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, num);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						sql="delete from tab_report where rnum=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, num);
						ps.execute();
						System.out.println("�Է��Ͻ� �й��� ������ ���� �Ǿ����ϴ�.\n");
					}
					else {
						System.out.println("�Է��Ͻ� �й��� �������� �ʽ��ϴ�.\n");
					}
					break;
					
				case 6:		//���α׷�����
					System.out.println("���α׷��� �����մϴ�.");
					run=false;
					break;
			}
		}
	}
}