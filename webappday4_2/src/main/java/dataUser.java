
public class dataUser {
	
	private String fname;
	private String lname;
	private String email;
	private String phoneno;
	private String gender;
	
	public dataUser(){}
	
	public dataUser(String fname, String lname, String email, String phoneno, String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneno = phoneno;
		this.gender = gender;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
