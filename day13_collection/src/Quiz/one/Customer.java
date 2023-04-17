package Quiz.one;

public class Customer {  // Model 
	
		private String name, address, tel;
		
		public Customer() {	
			this.name = "noName";
			this.address = "Seoul";
			this.tel = "000-0000-0000";
		}

		public Customer(String name, String address, String tel) {
			super();
			this.name = name;
			this.address = address;
			this.tel = tel;
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
		
		public void show() {
			System.out.print(name + "\t" + address + "\t" + tel + "\n");
		}
		
		@Override
		public String toString() {
			return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
		}
}
