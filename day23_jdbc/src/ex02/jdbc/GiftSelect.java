package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {

		//		1. Driver load ...... exception
		Class.forName("oracle.jdbc.OracleDriver");

		//		2. Connection & Open
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"user01",
				"oracle");

		//		3. 사용 ( DML 명렁어 - Select )
		Statement stmt = conn.createStatement();
		ResultSet rs =  stmt.executeQuery("SELECT * FROM GIFT"); // ctrl+shift+x 대문자
						// 반환값이 있는 경우 : executeQuery() - select

		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while(rs.next()) {
			int gno = rs.getInt(1); // re.getXXX(인덱스 번호); // re.getXXX("필드명");
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		//		4. 닫기 (자원 반환 )
		rs.close(); stmt.close(); conn.close();
	}
}
