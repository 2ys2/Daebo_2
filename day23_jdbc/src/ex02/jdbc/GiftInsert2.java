package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftInsert2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {

		//		1. Driver load ...... exception
		Class.forName("oracle.jdbc.OracleDriver");

		//		2. Connection & Open
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"user01",
				"oracle");

		//		3. 사용 ( DML 명렁어 - Insert ) - PreparedStatement
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)"; // 1, 2, 3, 4
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 20);
		ps.setString(2, "초코렛");
		ps.setInt(3, 3000);
		ps.setInt(4, 9999);

		int result = ps.executeUpdate();
		System.out.println(result + "개 데이터 추가 성공");

		//		4. 닫기 (자원 반환 )
		ps.close(); conn.close();


	}
}
