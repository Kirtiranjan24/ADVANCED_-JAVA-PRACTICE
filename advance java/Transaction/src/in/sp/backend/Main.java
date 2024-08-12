package in.sp.backend;

public class Main {
	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	
	    public static void main(String[] args) {
	        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
	        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
	        String url = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false"; // SSL disabled
	        String username = "root";
	        String password = "Kirti@123";
	        
	        try {
	            // Load the MySQL JDBC driver (optional in recent versions)
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded successfully.");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Driver loading failed: " + e.getMessage());
	            return; // Exit if the driver is not found
	        }

	        try (Connection con = DriverManager.getConnection(url, username, password)) {
	            System.out.println("Connection established successfully.");
	            con.setAutoCommit(false); // Disable auto-commit mode

	            try (PreparedStatement withdrawStatement = con.prepareStatement(withdrawQuery);
	                 PreparedStatement depositStatement = con.prepareStatement(depositQuery)) {

	                // Withdraw 500.00 from account123
	                withdrawStatement.setDouble(1, 500.00);
	                withdrawStatement.setString(2, "account123");

	                // Deposit 500.00 into account456
	                depositStatement.setDouble(1, 500.00);
	                depositStatement.setString(2, "account456");

	                withdrawStatement.executeUpdate();
	                depositStatement.executeUpdate();
	                
	                con.commit(); // Commit the transaction
	                System.out.println("Transaction successful.");
	                
	            } catch (SQLException e) {
	                con.rollback(); // Rollback the transaction in case of error
	                System.out.println("Transaction failed: " + e.getMessage());
	            }
	        } catch (SQLException e) {
	            System.out.println("Connection failed: " + e.getMessage());
	        }
	    
	}


