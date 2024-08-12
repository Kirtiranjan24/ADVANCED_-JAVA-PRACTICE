package Lms1.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import Lms1.model.Book;

public class BookDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException , Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Kirti@123");
		
	}
		public static  boolean addBook(Book book) {
			boolean flag=false;
			Connection con=null;
			PreparedStatement st=null;
			try {
				con=BookDao.getConnection();
				st =con.prepareStatement("insert into book(BookName, Author,Publisher) values(?,?,?)");
				System.out.println("hello");
				st.setString(1, book.getName());
				st.setString(2, book.getAuthor());
				st.setString(3, book.getPublisher());
				int i = st.executeUpdate();
				
				if (i>0) {
					flag=true;
				}
				
			} catch(SQLException e) {
				
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return flag;
			
		}
		
}


