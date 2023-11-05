package com.cg.jdbcexample;

import java.beans.Statement;

public class CurdOperation {
	//create
	public static void addEmployee() throws SQLException  {
		Connection con=DButil.getConnection();
		Statement stmt=con.createStatement();
		String sqlinsert="INSERT into Employee(name,salary,bonus)" + "values("sneha",50000,50)";
		int status=stmt.executeUpdate(sqlinsert);
		if(status==1) {
			System.out.println("Entery is added");
		}
	}
	

}
