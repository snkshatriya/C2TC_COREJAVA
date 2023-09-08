package com.cg.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide() {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two number");
		try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is:"+c);
		}
		catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		//catch(InputMismatchException e) {
		//	System.out.println(e.getMessage());
		//}
		catch(Exception e) {
			
		}
		
	}

	
}
