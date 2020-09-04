package com.telstra.sensitiveUpdatable;
import java.sql.*;

public class Main {

		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","QAZplm_0");
		    System.out.println("Connected database successfully...");
		    
		    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,	ResultSet.CONCUR_UPDATABLE);
		    ResultSet rs=st.executeQuery("Select * from book");
		           
		    rs.absolute(2);
		    rs.updateString(2, "Physics");
		    rs.updateRow();
		            	
		    rs.moveToInsertRow();
		    rs.updateInt(1, 80);
		    rs.updateString(2,"Math");
		    rs.updateInt(3, 200);
		    rs.insertRow();
		    rs.moveToCurrentRow();
		    
            //rs.close();
            //st.close();
            con.close();       
	}

}
