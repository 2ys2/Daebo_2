package ex02.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel; // 추상클래스

public class MyModel extends AbstractTableModel {
	
	Object[][] data;
	String[] columName;
	int rows, cols; // 레코드 행과 열의 개수를 저장하는 변수
	
	// 추상메소드들
	@Override
	public int getRowCount() { // 레코드 개수
		return data.length;
	}

	@Override
	public int getColumnCount() { // 필드(열)의 개수
		return columName.length;
	}
	
	public void getRowCount(ResultSet rsScroll) { // user method, 레코드 개수
		try {
			rsScroll.last(); // 레코드의 마지막 행으로 커서 이동
			rows = rsScroll.getRow();
		} catch (Exception e) { e.printStackTrace(); }
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { // value(원자)값
		return data[rowIndex][columnIndex];
	}
	
	// DB에 저장된 데이터 채움
	public void setData(ResultSet rs) {
		try {
			String title;
			// 데이터에 대한 정보 얻어옴
			ResultSetMetaData rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); // 열의 개수 얻어옴
			columName = new String[cols];
			for ( int i = 0; i < cols; i++ ) {
				columName[i] = rsmd.getCatalogName(i+1); // db필드번호는 1부터 시작
			}
			
			data = new Object[rows][cols];
			int r = 0;
			while ( rs.next() ) {
				for ( int i = 0 ; i < cols; i++ ) {
					if ( i != 1 ) data[r][i] = rs.getObject(i + 1); // varchar2 type
					else data[r][i] = rs.getObject(i + 1); // number type
				} // for end
				r++;
			} // while end
					
		} catch (Exception e) { e.printStackTrace(); }
	} 
	

}
