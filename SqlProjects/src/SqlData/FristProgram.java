package SqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FristProgram {
	
	public static void main(String[] args) throws SQLException  {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
		System.out.println("connection created");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}
}