package data;

import java.sql.*;

public class DataManager {
	private static Connection con;
	public static Connection getConnect() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","QAZplm_0");
		}
		catch (ClassNotFoundException e) {
			//InstantiationException| IllegalAccessException| 
			e.printStackTrace();
		}
		catch (SQLException en) {
			en.printStackTrace();
		}
		return con;
	}
}
