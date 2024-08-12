package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SubmitForm")

public class MyServlet1 extends HttpServlet {
	
@Override
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
	{
		 String myname= req.getParameter("name1");
		 String myemail= req.getParameter("email1");
		 
		 
		 System.out.println("Name 1 :" +myname);
		 System.out.println("Email 1 :" +myemail);
		 
		 PrintWriter out=resp.getWriter();
		 out.println("name1:"+myname);
		 out.println("email1:"+myemail);
	}

}
