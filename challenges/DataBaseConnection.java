package challenges;

import java.sql.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataBaseConnection {

	public String lead_id;

	@BeforeMethod
	public void getData() throws ClassNotFoundException, SQLException {
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/sys";
		
		String username = "root";
		String password = "India@123";
		
		//Step1: Register the driver
		Class.forName(jdbc_driver);
		
		//Step2: Connect to the database
		Connection connection = DriverManager.getConnection(jdbc_url,username,password);
		
		//Step3: To execute query
		Statement stmt = connection.createStatement();
		String sql = "select * from sys.lead where LeadID=100";
		ResultSet executeQuery = stmt.executeQuery(sql);
		
		while(executeQuery.next()) {
			lead_id = executeQuery.getString(1);
			String first_name = executeQuery.getString("FirstName");
			String last_name = executeQuery.getString(2);
			System.out.println(lead_id+" "+first_name+" "+last_name);
		}
		
	}
	
	@Test
	public void findLead() {
		System.out.println(lead_id);

	}


}
