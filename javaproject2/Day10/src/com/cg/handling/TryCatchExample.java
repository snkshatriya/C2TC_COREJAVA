package com.cg.handling;

public class TryCatchExample {
	static void performDivision(int x,int y) {
		System.out.println("I am in try block");
		int z;
		try {
		z=x/y;
		System.out.println(z);
		}
		catch(Exception e) {
			System.out.println("I am in catch block" +e.getMessage());
		}
	}
	

}
