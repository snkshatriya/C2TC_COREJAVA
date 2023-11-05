package com.cg.jdbcexample;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String db_driverclass="";
	private static final String db_username="root";
	private static final String db_password="admine123";
	private static final String db_url="jdbc:mysql://localhost:3306/jdbcdb";
	private static Connection con=null;
	static {
		try {
			Class.forName(db_driverclass);
			con=DriverManager.getConnection(db_url);
		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static Connection getConnection() {
		return con;
	}
	
}
