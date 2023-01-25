package webappday4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/promptViewUData")
public class viewUData extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String prompt=req.getParameter("viewdata");
		
		if(prompt.equals("Yes")) {
			req.setAttribute("messageDBpage", "Your stored credentials are:");
			req.getRequestDispatcher("landingpage.jsp").forward(req, resp);
		}
		else{
			req.getRequestDispatcher("signupform.jsp").forward(req, resp);
		}		
	}	
}
