package webappDay8;

public class userData {
	String email;
	String password;
	String phone;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public userData() {}

	public userData(String email, String password, String phone) {
		super();
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	
	

}
