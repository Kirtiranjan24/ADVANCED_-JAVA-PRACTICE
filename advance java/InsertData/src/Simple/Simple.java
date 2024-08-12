package Simple;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Simple {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		String name1="akash";
		String e_mail1="akasha@gmail.com";
		String address1="gop";
		String city1="puri";
		int id =99;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/impo","root","Kirti@123");
//	    String url= "jdbc:mysql://localhost 3306/impo";
//		String user_Name="root";
//		String pass="Kirti@123";
		String query = "INSERT INTO details (name, e_mail, address, city, id) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name1);
		ps.setString(2, e_mail1);
		ps.setString(3, address1);
		ps.setString(4, city1);
		ps.setInt(5, id);
		int x = ps.executeUpdate();
		if(x>0) {
			System.out.println("sucessfully");
		}
		else {
			System.out.println("unsucessfully");
			
		}
		con.close();
		
	}

}
