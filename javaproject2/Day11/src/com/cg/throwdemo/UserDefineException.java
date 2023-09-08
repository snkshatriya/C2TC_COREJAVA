package com.cg.throwdemo;

import java.util.Scanner;

public class UserDefineException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		try {
			Validation.validate(age, weight);
		}
		catch(Exception e) {
			System.out.println("Exception Occured"+e.getMessage());
		}
	}

}
