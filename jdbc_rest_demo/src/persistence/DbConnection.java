package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", 
					"root", "Pass1234");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return connection;
	}
}
