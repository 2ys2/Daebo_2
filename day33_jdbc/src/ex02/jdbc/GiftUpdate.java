package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		//		1. Driver load ...... exception
		Class.forName("oracle.jdbc.OracleDriver");

		//		2. Connection & Open
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"user01",
				"oracle");

		//		3. 사용 ( DML 명렁어 - Update ) - PreparedStatement
		System.out.println("GIFT Table Update Input : 상품번호/상품명/최저가/최고가/수정할 상품번호 = ");
		String sql = "UPDATE GIFT SET GNO = ?, GNAME = ?, G_START = ?, G_END = ? WHERE GNO = ?"; //
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt()); sc.nextLine();
		ps.setString(2, sc.nextLine());
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, sc.nextInt());
		ps.setInt(5, sc.nextInt());
		
		int result = ps.executeUpdate();
		System.out.println(result + "개 데이터 수정 성공");
		
		
//		4. 닫기 (자원 반환 )
		ps.close(); conn.close();

	}
}
