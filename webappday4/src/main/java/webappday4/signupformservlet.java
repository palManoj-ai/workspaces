package webappday4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/userSignUp")
public class signupformservlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp); by default, commented out
		String ufname=req.getParameter("firstname");
		String ulname=req.getParameter("lastname");
		String uemail=req.getParameter("email");
		String uphoneno=req.getParameter("phoneno");
		String ugender=req.getParameter("gender");
		
		UserDB userdb=new UserDB(ufname,ulname,uemail,uphoneno,ugender);
		req.setAttribute("user", userdb);
		req.getRequestDispatcher("promptdata.jsp").forward(req, resp);	
	}

}

