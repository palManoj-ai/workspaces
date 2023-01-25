package webappDay8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prompt")       //rem no ; here
public class promptservlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String temail=req.getParameter("email");
		String tpaswd=req.getParameter("password");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic","root","root");
			PreparedStatement ps=conn.prepareStatement("Select email,password,phone from tableday8 where email=? and password=?");
			ps.setString(1, temail);
			ps.setString(2, tpaswd);			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				userData userdata=new userData(rs.getString("email"),rs.getString("password"),rs.getString("phone"));
				req.setAttribute("user", userdata);     
				//try declaring it outside loop, know about var. scope in a loop, edit used if
			}
		
			req.setAttribute("message2", "Your stored credentials are: ");
			req.getRequestDispatcher("landingPage.jsp").forward(req, resp);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
