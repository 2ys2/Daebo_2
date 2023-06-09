package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSingletonHelper {
	private static Connection conn;
	private ConnectionSingletonHelper() { }
	
	public static Connection getConnection(String dsn) {
		if ( conn != null ) {
			return conn;
		}
		
		try {
			if ( dsn.equalsIgnoreCase("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl",
						"user01",
						"oracle"
						);
				System.out.println("oracle Connection Success !!!");
			} else if ( dsn.equalsIgnoreCase("mysal") ) {
				Class.forName("com.mysql.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/kosaDB",
						"user01",
						"oracle");
				System.out.println("mysql Connection Success !!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	

	public static void menu() {
		
		System.out.println("\n=-=-=-=-=-=-=-= 고객 관리 =-=-=-=-=-=-=-=");
		System.out.println("\t 1. 전 체 보 기");
		System.out.println("\t 2. 레코드 추가");
		System.out.println("\t 3. 레코드 수정");
		System.out.println("\t 4. 레코드 삭제");
		System.out.println("\t 5. 조건에 의한 검색(ex> gno)");
		System.out.println("\t 0. 프로그램 종료");
		System.out.println("\t >> 원하는 메뉴 선택하세요.");
		
	}

}
