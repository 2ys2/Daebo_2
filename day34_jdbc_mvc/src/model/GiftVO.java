package model;

public class GiftVO { // model; ~~~VO, ~~~DAO, ~~~TO
	
	public final String ClassName = "Gift"; // 옵션) 테이블 명 못바꾸게 하려고...
	// gno, gname, g_start, g_end
	
	private int gno;
	private String gname;
	private int g_start;
	private int g_end;
	
	// 데이터만 필요해서 toString 안만들었음
	
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getG_start() {
		return g_start;
	}
	public void setG_start(int g_start) {
		this.g_start = g_start;
	}
	public int getG_end() {
		return g_end;
	}
	public void setG_end(int g_end) {
		this.g_end = g_end;
	}
	
	
	public String getClassName() { // final 이라 setter 없음
		return ClassName;
	}
	
	
}
