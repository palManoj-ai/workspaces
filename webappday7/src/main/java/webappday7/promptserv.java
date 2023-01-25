package webappday7;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userPrompt")
public class promptserv extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uemail = req.getParameter("email");
		String upswd = req.getParameter("password");

		// now posting this data to sql
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// create connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic", "root", "root");
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("select firstname,lastname,email,pswd,phone,gender,cdate from tablesignup where email=? and pswd=?");
			ps.setString(1, uemail);
			ps.setString(2, upswd);
			// executing statement
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				req.setAttribute("message2", "Credentials found:");
				UserData uData = new UserData(rs.getString(1), rs.getString(2), uemail, upswd, rs.getString(5),rs.getString(6), rs.getDate(7));
				req.setAttribute("udata", uData);
				req.getRequestDispatcher("data.jsp").forward(req, resp);
			} else {
				req.setAttribute("warning", "Email and password mismatch, please retry");
				req.getRequestDispatcher("form.jsp").forward(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

