package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitForm")
public class SendreDirect extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");
       
        

        // Null check for email and password
        if (myemail != null && mypass != null) {
            if (myemail.equals("kirti@gmail.com") && mypass.equals("kirti123")) {
                RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                rd.forward(req, resp);
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("/index.html");
                rd.forward(req, resp);
            }
        } else {
            // Handle the case where parameters are missing
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.forward(req, resp);
        }
    }
}
