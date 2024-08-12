package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")

public class Login extends HttpServlet {
@Override
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
	{
		 String myname= (String)req.getParameter("name1");
		 String mypass= (String)req.getParameter("pass1");
		 
		 System.out.println("Name 1: " + myname);
	     System.out.println("Password 1: " + mypass);
		 
		 PrintWriter out = resp.getWriter();
//		 System.out.println("Name 1 :" +myname);
//		 System.out.println("Email 1 :" +myemail);
//		 
//		 PrintWriter out=resp.getWriter();
//		 out.println("name1:"+myname);
//		 out.println("email1:"+myemail);
		 if(myname.equals("kirtiranjan") && mypass.equals("kirti2003")) {
			 System.out.println("success");
			 out.println("Success");
		 }
		 else {
			 System.out.println("unsuccessfull");
			 out.println("unsuccessfull");
		 }
	}

}
