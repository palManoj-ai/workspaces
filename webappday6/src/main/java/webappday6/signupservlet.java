package webappday6;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userSignUp")
public class signupservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String upsswd = req.getParameter("password");
		String phone = req.getParameter("phoneno"); // rem to use name
		String gender = req.getParameter("gender");

		// now posting this data to sql
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// create connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_db", "root", "root");
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into tabledata values(?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, upsswd);
			ps.setString(5, phone);
			ps.setString(6, gender);
			ps.setDate(7, new java.sql.Date(System.currentTimeMillis()));
			// https://stackoverflow.com/questions/18614836/using-setdate-in-preparedstatement
			// executing statement
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		
//		UserData uData=new UserData(fname,lname,email,phone,gender); 
		req.setAttribute("message", "Registration suceesful!!Welcome Home ");
//		<br>
		req.getRequestDispatcher("prompt.jsp").forward(req, resp);
	}
}
