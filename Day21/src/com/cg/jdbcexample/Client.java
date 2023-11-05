package com.cg.jdbcexample;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DButil.getConnection();
		if(con!=null) {
			System.out.println("JDBC:Connection is established");
		}
	}

}
