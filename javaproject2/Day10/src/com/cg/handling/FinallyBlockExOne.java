package com.cg.handling;

public class FinallyBlockExOne {
	public static void divide(int x,int y) {
		try {
			int result=x/y;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException caught"+ae.getMessage());
			
		}
		finally {
			
			System.out.println("In finally block");
		}
		System.out.println("Statement after finally block");
		//finally wil work with try and catch
		
	}

}
