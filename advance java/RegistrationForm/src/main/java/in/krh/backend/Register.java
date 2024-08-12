package in.krh.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String myName = req.getParameter("name1");
        String myEmail = req.getParameter("email1");
        String myPass = req.getParameter("password");
        String myGender = req.getParameter("gender1");
        String myCity = req.getParameter("city1");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegForm", "root", "Kirti@123");

            PreparedStatement ps = con.prepareStatement("INSERT INTO register (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)");
            
            ps.setString(1, myName);
            ps.setString(2, myEmail);
            ps.setString(3, myPass);
            ps.setString(4, myGender);
            ps.setString(5, myCity);

            int count = ps.executeUpdate();
            if (count > 0) {
                resp.setContentType("text/html");
                out.print("<h3 style='color:green'>User registered successfully</h3>");
            } else {
                resp.setContentType("text/html");
                out.print("<h3 style='color:red'>User not registered due to some technical issue</h3>");
            }

            RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
            rd.include(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3 style='color:red'>Exception Occurred: " + e.getMessage() + "</h3>");
            
            RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
            rd.include(req, resp);
        }
    }
}
