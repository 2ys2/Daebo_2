package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import dbConn.util.ConnectionSingletonHelper;
import model.GiftVO;

public class GiftController { //controller

	// 연결, 삽입, 삭제, 수정, 검색 ...
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionSingletonHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) { e.printStackTrace(); }
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs); CloseHelper.close(stmt); CloseHelper.close(pstmt); CloseHelper.close(conn);
		} catch (Exception e) { e.printStackTrace(); }
	}

	// menu
	public static void menu() throws SQLException { // 예외처림 위임
		GiftVO vo = new GiftVO();


		while( true ) {
			System.out.println();
			ConnectionHelper.menu();

			switch ( sc.nextInt() ) {
			case 0: System.out.println("Commeit 하시겠습니까(Y/N)");
			System.out.println("안하시려면 Rollbaek 됩니다.");
			if ( sc.next().equalsIgnoreCase("Y")) {
				conn.commit(); // 예외발생
				selectAll(vo.getClassName());
			} else {
				conn.rollback();
				selectAll(vo.getClassName());
			}
			break;

			case 1: selectAll(vo.getClassName()); break;
			case 2: insert(); selectAll(vo.getClassName()); break;
			case 3: update(vo.getClassName()); break;
//			case 4: delete(vo.getClassName()); break;
//			case 5: selectByGno(vo.getClassName()); break;
			case 6: close(); System.out.println("프로그램 종료합니다.");
			System.exit(0); break;
			case 9: conn.commit(); System.out.println("성공적으로 완료 되었습니다."); break;			

			} // end switch
		} // end while
	} // end menu

	private static void update(String className) throws SQLException {
		System.out.println("수정할 번호(gno) : "); String gno = sc.next();
		System.out.println("수정할 칼럼( gno, gname, g_start, g_end ) 중 입력 : "); String columName = sc.next();
		System.out.println("수정할 데이터 입력 : "); String updateinput = sc.next();
//		System.out.println("수정할 상품번호를 입력하시오."); String updategno = sc.next();
//		System.out.println("상품번호를 입력하시오."); String gno = sc.next();
//	    System.out.println("상품이름을 입력하시오."); String gname = sc.next();
//	    System.out.println("상품최저가를 입력하시오."); String g_start = sc.next();
//	    System.out.println("상품최고가를 입력하시오."); String g_end = sc.next();

		try {
			pstmt = conn.prepareStatement("UPDATE " + className
					+ " SET " + columName + " = ? WHERE GNO = ?"); // 반환값 있는 경우
			pstmt.setString(1, updateinput);
			pstmt.setString(2, gno);
			
//			pstmt = conn.prepareStatement("UPDATE " + className + " SET GNO = ?, GNAME = ?, G_START = ?, G_END = ? WHERE GNO = ?");
//			pstmt.setString(1, gno);
//			pstmt.setString(2, gname);
//			pstmt.setString(3, g_start);
//			pstmt.setString(4, g_end);
//			pstmt.setString(5, updategno);


			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터가 수정되었습니다.");

		}catch (Exception e) { e.printStackTrace(); }
	}

	// select All
	public static void selectAll(String className) throws SQLException { //
		rs = stmt.executeQuery("SELECT * FROM " + className); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보
		int count = rsmd.getColumnCount();

		while ( rs.next() ) {
			for ( int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch ( rsmd.getColumnType(i) ) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;
				default :
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				}// switch end
			} // for end
			System.out.println();
		} // end while
	}

	// insert
	public static void insert () {
		System.out.println("GNO : "); String gno = sc.next();
		System.out.println("GNAME : "); String gname = sc.next();
		System.out.println("G_SATRT : "); String g_start = sc.next();
		System.out.println("G_END : "); String g_end = sc.next();

		try {
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?, ?, ?, ?)");
			pstmt.setString(1, gno); pstmt.setString(2, gname);
			pstmt.setString(3, g_start); pstmt.setString(4, g_end);

			int result = pstmt.executeUpdate();

			System.out.println(result + "개 데이터가 추가되었습니다.");


		}catch (Exception e) { e.printStackTrace(); }
	} // end insert()

	// ...

}
