package com.skill.demo;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		double j,i;
		j=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(j);
		i=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int avg;
		avg = (a+b+c)/3;
		System.out.println("Average of three number is="+avg);
		
		System.out.println("Enter 2 number");
		int y=sc.nextInt();
		int x=sc.nextInt();
		int temp;
		temp=y;
		y=x;
		x=temp;
		System.out.println(y);
		System.out.println(x);
		
		
		
		
		

	}

}
