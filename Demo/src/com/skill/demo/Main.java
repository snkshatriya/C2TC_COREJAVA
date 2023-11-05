package com.skill.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creating the object of the scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		sc.nextInt();
		System.out.println("Enter the value of b");
		sc.nextInt();
		sc.close();
		//Creating the object of add class
		Add a=new Add();
		a.setA(a);
		a.setB(b);
		System.out.println("Add:");
		System.out.println("First Num: "+a.getA());
		System.out.println("Second Num: "+a.getB());
		
		

	}

}
