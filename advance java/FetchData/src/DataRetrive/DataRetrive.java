package DataRetrive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetrive {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con100 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","Kirti@123");
		PreparedStatement ps100 =con100.prepareStatement("select * from abc");
		ResultSet rs100= ps100.executeQuery();
		while(rs100.next()) {
			
			
			System.out.print("Nmae:"+rs100.getString("name"));
			System.out.print("gmail:"+rs100.getString("gmail"));
			System.out.print("Address:"+rs100.getString("address"));
			System.out.print("Regno:"+rs100.getString("regno"));
			
		}
		con100.close();
		

	}

}
