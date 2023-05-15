package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper 클래스의 문제
 매번 드라이버 로드...
 Connection 생성... <- 리소스낭비

 어차피 하나의 프로세스에서 하나만 만들어서 재사용 하면 될텐데...
 < 해결방법 > : 공유자원( 싱글톤 )
 */

public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)
	private static Connection conn;
	private ConnectionSingletonHelper() { }

	public static Connection getConnection(String dsn) {
		if ( conn != null ) {
			return conn;
		} // 핵심 !

		try {
			if ( dsn.equalsIgnoreCase("mysql") ) {
				Class.forName("com.mysql.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/kosaDB",
						"user01",
						"oracle");
				System.out.println("MySQL Connection Success !!!");

			} else if ( dsn.equalsIgnoreCase("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl",
						"user01",
						"oracle");
				System.out.println("ORACLE Connection Success !!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}

	}

	public static void close() throws SQLException {

		if ( conn != null ) {
			if ( !conn.isClosed() ) {
				conn.close();
			}
		}

	}
		
}
