package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DbConnection {
	public static void main(String arg[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String n=sc.nextLine();
//		System.out.println("Enter your email");
//		String g=sc.next();
//		System.out.println("Enter your Address");
//		String a=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Kirti@123");
//		PreparedStatement ps=con.prepareStatement("update details set name=? where email=?");
		PreparedStatement ps=con.prepareStatement("delete from details where name=?");


//		System.out.println("yes");
//		PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?)");
		ps.setString(1, n);
//		ps.setString(2, g);
//		ps.setString(3, a);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
		}else {
			System.out.println("unsuccess");
		}
		sc.close();
		con.close();
	}
}
