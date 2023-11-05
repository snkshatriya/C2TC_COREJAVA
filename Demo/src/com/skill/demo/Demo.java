package com.skill.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    	Scanner sc= new  Scanner(System.in);
    	System.out.println("Enter 2 decimal number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        String s1=Integer.toBinaryString(sum);       
        System.out.println("Sum of 2 decimal numbers in binary"+s1);
        
       System.out.println("Enter the binary number");
       String a1=sc.nextLine();
       String b1=sc.nextLine();
       int n1=Integer.parseInt(a1,2);
       int n2=Integer.parseInt(b1,2);
       int sum1=n1+n2;
       String l1=Integer.toBinaryString(sum1);
       System.out.println("Sum of 2 binary number in binary"+l1);
       
    
       
       System.out.println("Enter the demical to convert into hexa  number");
      int l= sc.nextInt();
      String n3=Integer.toHexString(l);
      System.out.println(n3);
     
    	/*System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
      
      */
    
       
    }
}

