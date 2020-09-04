package com.telstra.metadata;

import java.sql.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","QAZplm_0");
	    System.out.println("Connected database successfully...");
	    
	    PreparedStatement ps = con.prepareStatement("SELECT * FROM book");
	    
	    ResultSet rs = ps.executeQuery();
	    
	    ResultSetMetaData rsmd = rs.getMetaData();
	    
	    System.out.println("Total number of columns: "+rsmd.getColumnCount());
	    System.out.println("Name of the first column: "+rsmd.getColumnName(1));
	    System.out.println("Type of the first column: "+rsmd.getColumnType(1));
	    
	    
	}

}
