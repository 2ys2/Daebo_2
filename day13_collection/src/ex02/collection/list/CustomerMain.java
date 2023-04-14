package ex02.collection.list;

public class CustomerMain {
	
	protected String name;
	protected String address;
	protected String tel;
	
	// 생성자함수
	public CustomerMain( String name, String address, String tel ) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	

	@Override
	public String toString() {
		return "CustomerM [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
