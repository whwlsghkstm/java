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
			System.out.println("1.입력 | 2.출력 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("작업선택 > ");
			int menu=s.nextInt();
			
			switch(menu) {
				case 1:		//데이터 입력
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
					
					System.out.println("데이터 입력이 완료되었습니다.");
					System.out.println();
					break;
					
				case 2:		//데이터 출력
					sql = "select * from tab_grade order by sno";
					ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					System.out.println("번호\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
					
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
					
				case 3:		//데이터 수정
					System.out.print("수정할 번호 입력 > ");
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
						System.out.println("이름 : " + sname);
						System.out.println("국어 점수 : " + kor);
						System.out.println("영어 점수 : " + eng);
						System.out.println("수학 점수 : " + mat);

						System.out.print("변경할 국어 점수 ["+kor+"] > ");
						kor=s.nextInt();
						System.out.print("변경할 영어 점수 ["+eng+"] > ");
						eng=s.nextInt();
						System.out.print("변경할 수학 점수 ["+mat+"] > ");
						mat=s.nextInt();
						
						sql="update tab_grade set kor=?, eng=?, mat=? where sno=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, kor);
						ps.setInt(2, eng);
						ps.setInt(3, mat);
						ps.setString(4, sno);
						ps.execute();
						
						System.out.println("데이터 변경이 완료 되었습니다.");
						System.out.println();
					}
					else {
						System.out.println("데이터가 없습니다.");
					}
					break;
					
				case 4:		//데이터 삭제
					System.out.print("삭제할 번호 입력 > ");
					sno=s.next();
					sql="delete tab_grade where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, sno);
					ps.execute();
					System.out.println("데이터가 삭제 되었습니다.");
					System.out.println();
					break;
					
				case 5:		//프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("다시 입력해주세요.\n");
			}
			
		}
		
		
	}

}
