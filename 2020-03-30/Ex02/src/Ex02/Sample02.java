package Ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample02 {

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
			System.out.println("---------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.계좌입금 | 4.계좌출금 | 5.계좌삭제 | 6.종료");
			System.out.println("---------------------------------------------------------");
			
			System.out.print("작업 번호 선택 > ");
			int menu=s.nextInt();
			switch(menu) {
				case 1:			//계좌생성 - insert
					System.out.println(" *** 계좌생성 *** ");
					System.out.print("계좌번호 입력 > ");
					String ano=s.next();
					System.out.print("예금주 이름 입력 > ");
					String aname=s.next();
					System.out.print("초기 입금액 입력 > ");
					int balance=s.nextInt();
					
					String sql="insert into tab_account(ano, aname, balance)"
								+ "values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, ano);
					ps.setString(2, aname);
					ps.setInt(3, balance);
					ps.execute();
					
					System.out.println("계좌가 성공적으로 생성 되었습니다.\n");
					break;
					
				case 2:			//계좌목록 - select
					System.out.println(" *** 계좌목록 *** ");
					
					sql="select * from tab_account order by aname";
					ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					System.out.println("계좌번호\t예금주\t잔액");
					
					while(rs.next()) {
						ano=rs.getString("ano");
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.print(ano + "\t");
						System.out.print(aname + "\t");
						System.out.println(balance + "\t");
					}					
					System.out.println();
					break;
					
				case 3:			//계좌입금 - update
					System.out.println(" *** 계좌입금 *** ");
					System.out.print("입금할 계좌번호 > ");
					ano=s.next();
					sql="select * from tab_account where ano=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, ano);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.println("예금주 이름 : " + aname);
						System.out.println("잔액 : " + balance);
						System.out.print("입금액 > ");
						int in = s.nextInt();
						
						sql="update tab_account set balance=balance+? where ano=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, in);
						ps.setString(2, ano);
						ps.execute();
						
						System.out.println("입금이 정상 처리되었습니다.\n");
					}
					else {
						System.out.println("입력하신 계좌번호와 일치하는 정보가 없습니다.\n");
					}					
					break;
					
				case 4:			//계좌출금 - update
					System.out.println(" *** 계좌출금 *** ");
					System.out.print("출금할 계좌번호 > ");
					ano=s.next();
					sql="select * from tab_account where ano=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, ano);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.println("예금주 이름 : " + aname);
						System.out.println("잔액 : " + balance);
						System.out.print("출금액 > ");
						int out=s.nextInt();
						
						sql="update tab_account set balance=balance-? where ano=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, out);
						ps.setString(2, ano);
						ps.execute();
						
						System.out.println("출금이 정상 처리되었습니다.\n");
					}
					else {
						System.out.println("입력하신 계좌번호와 일치하는 정보가 없습니다.\n");
					}
					break;
					
				case 5:			//계좌삭제 - delete
					System.out.println(" *** 계좌삭제 *** ");
					System.out.print("삭제할 계좌번호 > ");
					ano=s.next();
					sql="select * from tab_account where ano=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, ano);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.println("예금주 이름 : " + aname);
						System.out.println("잔액 : " + balance);
						
						System.out.print("정말 계좌를 삭제 하시겠습니까?(y/n) > ");
						String q=s.next();
						
						if(q.equals("Y") || q.equals("y")) {
							sql="delete from tab_account where ano=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, ano);
							ps.execute();
							
							System.out.println("입력하신 계좌가 삭제 되었습니다.\n");
						}
						else if(q.equals("N") || q.equals("n")){
							System.out.println("계좌 삭제가 취소 되었습니다.");
							System.out.println("초기 화면으로 돌아갑니다.\n");
							break;
						}
						else {
							System.out.println("잘못 입력하셨습니다.");
							System.out.println("초기 화면으로 돌아갑니다.\n");
						}
					}
					else {
						System.out.println("입력하신 계좌번호와 일치하는 정보가 없습니다.\n");
					}
					
					break;
					
				case 6:
					System.out.println("프로그램을 종료합니다.\n");
					run=false;
					break;
					
				default:
					System.out.println("잘못 입력 하셨습니다.");
					System.out.println("다시 입력해 주세요.\n");
			}
		
		}
	}

}
