package webappday7;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/moreInfo")
public class Moreinfo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String passedEmail=req.getParameter("instanceOfEmail");
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic", "root", "root");
			// prepared statement to select all entries from mysql_table
			PreparedStatement ps = conn.prepareStatement("select firstname,lastname,email,pswd,phone,gender,cdate from tablesignup");
			// executing statement
			ResultSet rs = ps.executeQuery();
			
			List<UserData> listOfUser=new ArrayList<UserData>();
			
			while(rs.next()) {
				String ufname=rs.getString("firstname");
				String ulname=rs.getString("lastname");
				String uemail=rs.getString("email");
				String upswd=rs.getString("pswd");
				String uphone=rs.getString("phone");
				String ugender=rs.getString("gender");
				Date ucdate=rs.getDate("cdate");
				
				UserData user=new UserData(ufname,ulname,uemail,upswd,uphone,ugender,ucdate);
		
					if (uemail.equals(passedEmail)) {
						req.setAttribute("udata",user);
					}else {
						listOfUser.add(user);
					}
			}

			//adding 
			req.setAttribute("listudata", listOfUser);	
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		req.getRequestDispatcher("data.jsp").forward(req, resp);
		
		
		
		
	}

}
