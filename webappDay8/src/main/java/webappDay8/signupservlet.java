package webappDay8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;



@WebServlet("/SignUp")       //rem no ; here
public class signupservlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String paswd=req.getParameter("password");
		String phone=req.getParameter("phoneno");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic","root","root");
			PreparedStatement ps=conn.prepareStatement("insert into tableday8 values(?,?,?)");
			//
			ps.setString(1, email);
			ps.setString(2, paswd);
			ps.setString(3, phone);			
			ps.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("message1", "You have successfully registered.");
		req.getRequestDispatcher("promptPage.jsp").forward(req, resp);
		//dont forget to add .jsp 
		
	}
}
