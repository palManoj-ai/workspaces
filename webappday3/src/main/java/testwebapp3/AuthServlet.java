 package testwebapp3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validateUser")   
//validateUser unique name given to servlet
//name as specified in "action" in jsp or html file
//remember to give / wo it doesn't work

public class AuthServlet extends HttpServlet{
	
	//use dpGet+ctrl+spcebar to get below method automatically, remove super.doGet() method to define your logic
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("Username");  //stores username sent from jsp file to var name
		String pword=req.getParameter("Password");
		
		if("root".equals(name)&&"root".equals(pword)) {
//			resp.getWriter().println("<h1> Login Successful, welcome back!!</h1>"); 
//			this line if you want to return a page with header content as mentioned
//			now trying to return a new page if credentials match, for this we create new jsp/html page in web-inf
			req.setAttribute("message1","Login Success!!");
			req.getRequestDispatcher("successpage.jsp").forward(req, resp);
		} else {
//			resp.getWriter().println("<h1> Login Unsuccessful, Try again!!</h1>");
//			this line if you want to return a page with header content as mentioned
			req.setAttribute("message2","UserId Password mismatch, try again!!");  //use with $(message)
			req.getRequestDispatcher("failurepage.jsp").forward(req, resp); //use for custom page for failed attemp
			
		}
	}
	
	
	

}
