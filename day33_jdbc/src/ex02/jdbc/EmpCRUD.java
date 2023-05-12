package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpCRUD {

	static Connection conn;
	static Scanner sc;

	static void dbconn() throws ClassNotFoundException, SQLException { //연결 메소드
		// 1. Driver load ...... exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"user01",
				"oracle");	
		// 스캐너 생성
		sc = new Scanner(System.in);
	}

	static ResultSet selectByNo(int n) throws SQLException { // selectByNo()
		String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, n);
		return pstmt.executeQuery();
	}

	static ResultSet selectByNoBtw(int startn, int endn ) throws SQLException { // selectByNo()
		String sql = "SELECT * FROM EMP WHERE EMPNO BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, startn);
		pstmt.setInt(2, endn);
		return pstmt.executeQuery();
	}

	// selectAll()
	// insert
	// update
	// delete
	// 종료, menu()

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 호출
		dbconn();
		ResultSet rs = selectByNoBtw(sc.nextInt(), sc.nextInt());
		//		ResultSet rs = selectByNo(sc.nextInt());
		while (rs.next()) {
			for (int i = 1; i <= 8; i++) System.out.print(rs.getString(i) + " ");
			System.out.println();
		}


	}
}



//ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
//System.out.println("사번\t사원명\t직위\t매니저\t고용일\t급여\t커미션\t부서번호");
//while (rs.next()) {
//    int empno = rs.getInt("empno");
//    String ename = rs.getString("ename");
//    String job = rs.getString("job");
//    int mgr = rs.getInt("mgr");
//    Date hiredate = rs.getDate("hiredate");
//    int sal = rs.getInt("sal");
//    int comm = rs.getInt("comm");
//    int deptno = rs.getInt("deptno");
//    sb.append(String.format("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d%n", empno, ename, job, mgr, hiredate, sal, comm, deptno));
//}   // while end

