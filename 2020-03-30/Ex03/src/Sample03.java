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
		System.out.println("1.상품등록 | 2.상품목록 | 3.상품수정 | 4.종료");
		System.out.println("------------------------------------");
		System.out.print("작업 번호 선택 > ");
		
		int menu=s.nextInt();
		
		switch(menu) {
			case 1:			//상품등록 - insert
				System.out.println(" *** 상품등록 *** ");
				System.out.print("상품번호 입력 > ");
				String gno=s.next();
				System.out.print("상품명 입력 > ");
				String gname=s.next();
				System.out.print("상품가격 입력 > ");
				int gprice=s.nextInt();
				System.out.print("상품수량 입력 > ");
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
				
				System.out.println("상품 등록이 정상 처리 되었습니다.\n");
				break;
				
			case 2:			//상품목록 - select
				System.out.println(" *** 상품목록 *** ");
				
				sql="select * from tab_goods order by gname";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				System.out.println("상품번호\t상품명\t상품가격\t상품수량\t상품총가격");
				
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
				
			case 3:			//상품수정 - update
				System.out.println(" *** 상품수정 *** ");
				System.out.print("수정할 상품 번호 > ");
				gno=s.next();
				sql="select * from tab_goods where gno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, gno);
				rs=ps.executeQuery();
				
				if(rs.next()) {
					gname=rs.getString("gname");
					gprice=rs.getInt("gprice");
					gstock=rs.getInt("gstock");
					System.out.println("상품번호 : " + gno);
					System.out.println("상품명 : " + gname);
					System.out.println("상품가격 : " + gprice);
					System.out.println("상품수량 : " + gstock);

					System.out.print("변경할 상품명 [" + gname + "] > ");
					gname=s.next();
					System.out.print("변경할 상품가격 [" + gprice + "] > ");
					gprice=s.nextInt();
					System.out.print("변경할 상품수량 [" + gstock + "] > ");
					gstock=s.nextInt();
					
					sql="update tab_goods set gname=?, gprice=?, gstock=? where gno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, gname);
					ps.setInt(2, gprice);
					ps.setInt(3, gstock);
					ps.setString(4, gno);
					ps.execute();
					
					System.out.println("상품에 대한 정보수정을 완료하였습니다.\n");					
				}
				
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.\n");
				run=false;
				break;
				
			default :
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("프로그램을 종료합니다.\n");
				run=false;
		}
		
		}
	}

}
