package Ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
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

		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		boolean run=true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.성적입력 | 2.성적조회 | 3.성적수정 | 4.성적삭제 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("작업 번호 선택 > ");
			int menu=s.nextInt();
			System.out.println();
			
			switch(menu) {
				case 1:
					System.out.println(" *** 성적입력 *** ");
					SungjukVO vo=new SungjukVO();
					
					boolean find=true;
					while(find) {
						System.out.print("성적을 입력할 학번 입력 > ");
						vo.setSnum(s.next());
						
						sql="select * from tab_student where snum=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getSnum());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							System.out.println("학생 이름 : " + rs.getString("sname"));
							
							System.out.print("몇 월의 성적을 입력하시겠습니까? > ");
							vo.setSmonth(s.next());
							
							sql="select * from tab_sungjuk where smonth=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, vo.getSmonth());
							rs=ps.executeQuery();
							if(rs.next()==false) {
								System.out.print("국어 점수 입력 > ");
								vo.setKor(s.nextInt());
								System.out.print("영어 점수 입력 > ");
								vo.setEng(s.nextInt());
								System.out.print("수학 점수 입력 > ");
								vo.setMat(s.nextInt());
								
								sql="insert into tab_sungjuk(snum,smonth,kor,eng,mat) values(?,?,?,?,?)";
								ps=con.prepareStatement(sql);
								ps.setString(1, vo.getSnum());
								ps.setString(2, vo.getSmonth());
								ps.setInt(3, vo.getKor());
								ps.setInt(4, vo.getEng());
								ps.setInt(5, vo.getMat());
								ps.execute();
								
								System.out.println("성적 입력이 완료 되었습니다.\n");
								find=false;
							}
							else {
								System.out.println("입력하신 " + vo.getSmonth() + "월에는 이미 성적이 입력되어 있습니다.");
								System.out.println("성적을 입력하실 학번을 다시 입력해 주세요.\n");
							}
							
						}
						else {
							System.out.println("입력하신 학번의 학생이 존재하지 않습니다.");
							System.out.println("학번을 다시 입력해 주세요.\n");
						}
					}
					break;
					
				case 2:
					System.out.println(" *** 성적조회 *** ");
					vo=new SungjukVO();
					
					find=true;
					while(find) {
						System.out.print("성적을 조회할 학번 입력 > ");
						vo.setSnum(s.next());
						
						sql="select * from tab_student where snum=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getSnum());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							System.out.println("이름 : " + rs.getString("sname"));
							
							sql="select * from tab_sungjuk where snum=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, vo.getSnum());
							rs=ps.executeQuery();
							
							System.out.println("월\t국어점수\t영어점수\t수학점수\t총점\t평균");
							while(rs.next()) {
								System.out.print(rs.getString("smonth")+"월"+"\t");
								System.out.print(rs.getInt("kor")+"\t");
								System.out.print(rs.getInt("eng")+"\t");
								System.out.print(rs.getInt("mat")+"\t");
								
								int sum=(rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat"));
								System.out.print(sum+"\t");
								double avg=sum/3.;
								DecimalFormat df=new DecimalFormat("###.00");
								System.out.println(df.format(avg));
							}
							System.out.println();							
							find=false;
						}
						else {
							System.out.println("입력하신 학번은 존재하지 않습니다.");
							System.out.println("다시 입력해 주세요.\n");
						}
					}
					break;
					
				case 3:
					System.out.println(" *** 성적수정 *** ");
					vo=new SungjukVO();
					
					find=true;
					while(find) {
						System.out.print("성적을 수정할 학번 입력 > ");
						vo.setSnum(s.next());
						
						sql="select * from tab_student where snum=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getSnum());
						rs=ps.executeQuery();
							
						if(rs.next()) {
							System.out.println("이름 : " + rs.getString("sname"));
							System.out.print("성적을 수정할 월 선택 > ");
							vo.setSmonth(s.next());
							
							sql="select * from tab_sungjuk where smonth=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, vo.getSmonth());
							rs=ps.executeQuery();
							
							if(rs.next()) {
								vo.setSmonth(rs.getString("smonth"));
								vo.setKor(rs.getInt("kor"));
								vo.setEng(rs.getInt("eng"));
								vo.setMat(rs.getInt("mat"));
			
								System.out.print("수정할 국어 점수 [" + vo.getKor() + "] > ");
								vo.setKor(s.nextInt());
								System.out.print("수정할 영어 점수 [" + vo.getEng() + "] > ");
								vo.setEng(s.nextInt());
								System.out.print("수정할 수학 점수 [" + vo.getMat() + "] > ");
								vo.setMat(s.nextInt());
								
								sql="update tab_sungjuk set kor=?,eng=?,mat=? where snum=? and smonth=?";
								ps=con.prepareStatement(sql);
								ps.setInt(1, vo.getKor());
								ps.setInt(2, vo.getEng());
								ps.setInt(3, vo.getMat());
								ps.setString(4, vo.getSnum());
								ps.setString(5, vo.getSmonth());
								ps.execute();
								
								System.out.println("입력하신 학번의 성적이 수정 되었습니다.\n");
								
								find=false;
							}
						}
						
						else {
							System.out.println("입력하신 학번은 존재하지 않습니다.");
							System.out.println("다시 입력해 주세요.\n");
						}
					}
					
					break;
					
				case 4:
					System.out.println(" *** 성적삭제 *** ");
					vo=new SungjukVO();
					
					find=true;
					while(find) {
						System.out.print("성적을 삭제할 학번 입력 > ");
						vo.setSnum(s.next());
						
						sql="select * from tab_student where snum=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getSnum());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							System.out.println("이름 : " + rs.getString("sname"));
							System.out.print("성적을 삭제할 월 선택 > ");
							vo.setSmonth(s.next());
							
							sql="select * from tab_sungjuk where smonth=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, vo.getSmonth());
							rs=ps.executeQuery();
							
							if(rs.next()) {
								vo.setSmonth(rs.getString("smonth"));
								
								sql="delete tab_sungjuk where snum=? and smonth=?";
								ps=con.prepareStatement(sql);
								ps.setString(1, vo.getSnum());
								ps.setString(2, vo.getSmonth());
								ps.execute();
								
								System.out.println("입력하신 학번의 성적이 삭제 되었습니다.\n");
								
								find=false;
							}
							else {
								System.out.println("입력하신 월은 존재하지 않습니다.");
								System.out.println("다시 입력해 주세요.\n");								
							}
						}
						else {
							System.out.println("입력하신 학번은 존재하지 않습니다.");
							System.out.println("다시 입력해 주세요.\n");								
						}
					}
					break;
					
				case 5:
					System.out.println("프로그램을 종료합니다.\n");
					run=false;
					break;
			}
		}
		
	}

}
