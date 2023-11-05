package com.skill.demo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
int num1=sc.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			 System.out.println(num1 +"x"+i+"="+(num1*i));
		}
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum="+(a+b));
		
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter 1 String");
		String m=sc1.nextLine();
		System.out.println("Enter 2 String");
		String n=sc1.nextLine();
		String o=m+n;
		System.out.println(o);
		
		
	}

}
