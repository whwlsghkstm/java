package Ex01;

import java.sql.*;
import java.util.*;

public class StudentDAO {
	
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	//�����ͺ��̽� ���� method
	public Connection con() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1111";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
	
	//�Է�(insert) method
	public void insert(StudentVO vo) throws Exception{
		
		sql="insert into tab_student(snum,sname,stel) values(?,?,?)";
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSnum());
		ps.setString(2, vo.getSname());
		ps.setString(3, vo.getStel());
		ps.execute();
		con().close();
	}
	
	//����(update) method
	public void update(StudentVO vo) throws Exception{
		
		sql="update tab_student set sname=?, stel=? where snum=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSname());
		ps.setString(2, vo.getStel());
		ps.setString(3, vo.getSnum());
		ps.execute();
		con().close();
	}
	
	//��ȸ(read) method
	public StudentVO read(String snum) throws Exception{
		sql="select * from tab_student where snum=?";
		ps=con().prepareStatement(sql);
		ps.setString(1,  snum);
		rs=ps.executeQuery();
		StudentVO vo=new StudentVO();
		
		if(rs.next()) {
			vo.setSnum(rs.getString("snum"));
			vo.setSname(rs.getString("sname"));
			vo.setStel(rs.getString("stel"));
			con().close();
			
		}
		return vo;
	}
	
	//����(delete) method
	public void delete(String snum) throws Exception{
		sql="delete from tab_student where snum=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, snum);
		ps.execute();
		con().close();
	}
	
	//������ method
	public ArrayList<StudentVO> list() throws Exception{
		
		ArrayList<StudentVO> array=new ArrayList<StudentVO>();
		
		sql="select * from tab_student order by snum";
		ps=con().prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			StudentVO vo=new StudentVO();
			vo.setSnum(rs.getString("snum"));
			vo.setSname(rs.getString("sname"));
			vo.setStel(rs.getString("stel"));
			array.add(vo);
		}
		return array;
	}
}