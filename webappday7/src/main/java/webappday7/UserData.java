package webappday7;
import java.sql.Date;

public class UserData {
	String fname;
	String lname;
	String email;
	String pword;
	String phone;
	String gender;
	Date cdate;
	
public UserData(){}
	
	public UserData(String fname, String lname, String email, String pword, String phone, String gender, Date date) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pword=pword;
		this.phone = phone;
		this.gender = gender;
		this.cdate=date;
		
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
}



