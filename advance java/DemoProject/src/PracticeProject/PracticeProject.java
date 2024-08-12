package PracticeProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PracticeProject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String s = sc.nextLine();
		
//		System.out.println("Enter your Address:");
//		String a = sc.nextLine();
		
		System.out.println("Enter your gmail:");
		String b = sc.nextLine();
		
//		System.out.println("Enter your Reg_no:");
//		String k = sc.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load Suceesfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","Kirti@123");
//		PreparedStatement ps=con.prepareStatement("insert into abc values(?,?,?,?)");
		PreparedStatement ps=con.prepareStatement("update abc set name=? where gmail=?");
		ps.setString(1, s);
		ps.setString(2, b);
//		ps.setString(3, b);
//	    ps.setString(4, k);
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
