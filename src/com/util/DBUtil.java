package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	
	
	public static Connection getConnect() throws SQLException, ClassNotFoundException{
       Connection con  = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ILPAustin","root","Lebanonhbb93$");
		
		return con;
		
	}
	
	public static void closeConnection(Connection con) throws SQLException {
		if(con != null) {
			con.close();
		}
	}
	
}
