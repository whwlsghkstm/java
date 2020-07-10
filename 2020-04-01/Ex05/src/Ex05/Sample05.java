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
			System.out.println(" 1.성적입력 | 2.성적조회 | 3.성적출력 | 4.성적수정 | 5.성적삭제 | 6.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("작업 번호 선택 > ");
			int menu=s.nextInt();
			System.out.println();
			switch(menu) {
				case 1:		//성적입력
					System.out.println(" *** 성적입력 *** ");
					Report r=new Report();
					System.out.print("학번 입력 > ");
					
					String num = s.next();
					sql="select * from tab_report where rnum=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, num);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						System.out.println("이미 존재하는 학번입니다.");
						System.out.println("초기화면으로 돌아갑니다.\n");
					}
					else {
						r.setRnum(num);
						System.out.print("이름 입력 > ");
						r.setRname(s.next());
						System.out.print("국어 점수 입력 > ");
						r.setKor(s.nextInt());
						System.out.print("영어 점수 입력 > ");
						r.setEng(s.nextInt());
						System.out.print("수학 점수 입력 > ");
						r.setMat(s.nextInt());
						
						sql="insert into tab_report values(?,?,?,?,?)";
						ps=con.prepareStatement(sql);
						ps.setString(1, r.getRnum());
						ps.setString(2, r.getRname());
						ps.setInt(3, r.getKor());
						ps.setInt(4, r.getEng());
						ps.setInt(5, r.getMat());
						ps.execute();
						
						System.out.println("성적 입력이 완료되었습니다.\n");
					}
					break;
					
				case 2:		//성적조회
					System.out.println(" *** 성적조회 ***");
					System.out.print("성적 조회 실행할 학번 입력 > ");
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
						System.out.println("입력하신 학번과 일치하는 정보가 없습니다.\n");
					}
					break;
					
				case 3:		//성적출력
					System.out.println(" *** 성적출력 *** ");
					System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균\t학점");
					
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
					
				case 4:		//성적수정
					System.out.print("성적을 수정할 학번 입력 > ");
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
						
						System.out.println("이름 : " + r.getRname());
						System.out.print("수정할 국어 점수 입력[" + r.getKor() + "] > ");
						r.setKor(s.nextInt());
						System.out.print("수정할 영어 점수 입력[" + r.getEng() + "] > ");
						r.setEng(s.nextInt());
						System.out.print("수정할 수학 점수 입력[" + r.getMat() + "] > ");
						r.setMat(s.nextInt());
						
						sql="update tab_report set kor=?,eng=?,mat=? where rnum=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, r.getKor());
						ps.setInt(2, r.getEng());
						ps.setInt(3, r.getMat());
						ps.setString(4, r.getRnum());
						ps.execute();
						
						System.out.println("입력하신 학번의 성적이 수정 되었습니다.\n");
					}
					else {
						System.out.println("입력하신 학번이 존재하지 않습니다.\n");
					}
					
					break;
					
				case 5:		//성적삭제
					System.out.println(" *** 성적삭제 *** ");
					System.out.print("성적을 삭제할 학번 입력 > ");
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
						System.out.println("입력하신 학번의 성적이 삭제 되었습니다.\n");
					}
					else {
						System.out.println("입력하신 학번이 존재하지 않습니다.\n");
					}
					break;
					
				case 6:		//프로그램종료
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
			}
		}
	}
}