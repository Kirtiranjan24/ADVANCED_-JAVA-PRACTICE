package Lms1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Lms1.model.Book;

/**
 * Servlet implementation class AddBookController
 */
@WebServlet("/addBook")
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Book book =new Book();
		 book.setName(request.getParameter("book_name"));
		 book.setAuthor(request.getParameter("author"));
		 book.setPublisher(request.getParameter("publisher"));
		 
		 BookDao bookDao=new BookDao();
		 if(bookDao.addBook(book)) {
			 request.setAttribute("message","Data Added Sucessfully");
		 }else {
			 
		 }
		 
		 request.getRequestDispatcher("addBook.jsp").forward(request, response);
	}

}
