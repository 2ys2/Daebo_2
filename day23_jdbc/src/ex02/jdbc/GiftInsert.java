package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {

		//		1. Driver load ...... exception
		Class.forName("oracle.jdbc.OracleDriver");

		//		2. Connection & Open
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"user01",
				"oracle");

		//		3. 사용 ( DML 명렁어 - Insert ) - Statement / PreparedStatement
		Statement stmt = conn.createStatement();

		// INSERT INTO gift VALUES( 12, '종합과자22', 4000, 20000 );
		// 1) 고정값 레코드 입력
		//		String sql = "INSERT INTO GIFT VALUES( 12, '종합과자22', 4000, 20000)"; // auto commit
		// 2) 레코드값을 입력 받아서 처리 - Scanner, IO main args
				String sql = "INSERT INTO GIFT VALUES(" + args[0] + ", '" + args[1] + "', " + args[2] + ", " + args[3] + ")";

		System.out.println(sql);

		int result = stmt.executeUpdate(sql);
		System.out.println(result + "개 데이터 추가 성공");

		//		4. 닫기 (자원 반환 )
		stmt.close(); conn.close();


	}
}
