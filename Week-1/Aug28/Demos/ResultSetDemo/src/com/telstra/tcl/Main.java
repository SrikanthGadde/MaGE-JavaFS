package com.telstra.tcl;

import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","QAZplm_0");
	    System.out.println("Connected database successfully...");
	    
	    con.setAutoCommit(false);
	    
	    //String query1 = "INSERT INTO book VALUES (13,\"Biology\",400)";
	    String query2 = "SELECT * FROM book FOR UPDATE";
	    String query3 = "INSERT INTO book VALUES (10,\"Economics\",350)";

	    Statement s = con.createStatement();
	    //System.out.println(s.execute(query1));
	    Savepoint save = con.setSavepoint("before");

	    System.out.println(s.execute(query3));
	    System.out.println("fetched the data");
	    ResultSet rs = s.executeQuery(query2); 
	    
	    rs.next();
	    System.out.println(rs.getInt(1)+" "+rs.getString(2));
	    int next = 0;
	    System.out.println("Enter 1 to continue");
	    while(next == 0) {
	    	next = sc.nextInt();
	    	
	    }
	    con.rollback(save);
	    con.commit();
	    
	}

}