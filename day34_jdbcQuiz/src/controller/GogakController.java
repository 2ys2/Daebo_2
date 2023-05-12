package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionSingletonHelper;
import model.GogakVO;

public class GogakController {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionSingletonHelper.getConnection("oracle");
			stmt = conn.createStatement();
//			conn.setAutoCommit(false);
		} catch (Exception e) { e.printStackTrace(); }
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(conn);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(rs);
		} catch (Exception e) { e.printStackTrace(); }
	}

	// menu
	public static void menu() throws SQLException, IOException {
		GogakVO vo = new GogakVO();
		
		while( true ) {
			System.out.println();
			ConnectionSingletonHelper.menu();
			
			switch ( Integer.parseInt(br.readLine()) ) {
			case 1: break;
			case 2: break;
			case 3: update(vo.getClassName()); break;
			case 4: break;
			case 5: break;
			case 0: close(); System.out.println("프로그램을 종료합니다.");
			System.exit(0); break;
			
			} // switch end
		} // while end
	} // menu end

	private static void update(String className) throws IOException {

		System.out.println("수정할 데이터의 번호를 입력하세요(gno : 숫자8자리)");
		String gno = br.readLine();
		System.out.println("수정할 칼럼명을 입럭하세요 (gno, gname, jumin, point)");
		String ColumName = "";
		while ( true ) {
			ColumName = br.readLine();
			if ( ColumName.equalsIgnoreCase("GNO")
					|| ColumName.equalsIgnoreCase("GNAME")
					|| ColumName.equalsIgnoreCase("JUMIN")
					|| ColumName.equalsIgnoreCase("POINT") ) break;
			System.out.println("다시 입력해주세요.");
		}
		System.out.println("수정할 데이터 값을 입럭하세요.");
		String UpdateInput = br.readLine();

		try {
			pstmt = conn.prepareStatement("UPDATE " + className
					+ " SET " + ColumName + " = ? WHERE GNO = ?"); // 반환값 있는 경우
			pstmt.setString(1, UpdateInput);
			pstmt.setString(2, gno);

			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터가 수정되었습니다.");

		} catch (Exception e) { e.printStackTrace(); }
	}





}
