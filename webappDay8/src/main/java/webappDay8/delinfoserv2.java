package webappDay8;

import java.io.IOException;
import java.sql.Connection;
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

@WebServlet("/deleteRow")       //rem no ; here
public class delinfoserv2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uemail=req.getParameter("key");
		String demail=req.getParameter("keydel");
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic","root","root");			
			if(demail!=null) {
				PreparedStatement ps=conn.prepareStatement("delete from tableday8 where email=?");
				ps.setString(1,demail);
				ps.execute();
			}			
			PreparedStatement ps1=conn.prepareStatement("select email,password,phone from tableday8");
			ResultSet rs=ps1.executeQuery();
			List<userData> listOfUser=new ArrayList<userData>();
			while(rs.next()) {
				String temail=rs.getString("email");
				String tpaswd=rs.getString("password");
				String tphone=rs.getString("phone");
				
				if(temail.equals(uemail)) {
					userData user=new userData(temail,tpaswd,tphone);
					req.setAttribute("user", user);
				}
				else {
					listOfUser.add(new userData(temail,tpaswd,tphone));
				}
			}
			req.setAttribute("listofuser", listOfUser);
		}catch (Exception e) {
			e.printStackTrace();
		}
		req.setAttribute("message3", "All stored credentials are: ");
		req.getRequestDispatcher("landingPage.jsp").forward(req, resp);
		//dont forget to add .jsp 
		
	}
}
