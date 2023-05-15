package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {

		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			// SQL 구문, HTML, Tag는 java/jsp/servelt 에서 문자열 취급한다.
			String sql = "CREATE TABLE KOSADB(NAME VARCHAR(20), AGE NUMBER)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql); // 반환값이 없는 경우
			
/*			StringBuffer sb = new StringBuffer();
			sb.append("if exists table Drop");
			sb.append("CREATE TABLE KOSADB(NAME VARCHAR(20), AGE NUMBER)");
			
			System.out.println(sb.toString());
			int result = stmt.executeUpdate(sb.toString()); // 반환값이 없는 경우
*/
			sql = "INSERT INTO KOSADB VALUES('YUNA', 33)"; // 여러개 레코드 추가 가능
			int result = stmt.executeUpdate(sql);
//			int result = stmt.executeUpdate(sb.toString());

			sql="SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sql); // 반환값이 있는 경우

			System.out.println(result + "개 추가됨.");

			while( rs.next() ) {
				System.out.print("name : " + rs.getString(1) + "\t");
				System.out.println("age : " + rs.getInt("age"));
			}

			// conn.commit():
//			 sql = "DROP TABLE KOSADB";
//			 result = stmt.executeUpdate(sql);
//			 System.out.println(result + "개 삭제 됨.");
//			 String sql = "DROP TABLE KOSADB";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);	CloseHelper.close(stmt); CloseHelper.close(conn);
		}
	}
}
