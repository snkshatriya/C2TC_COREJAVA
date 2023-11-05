package com.skill.demo;

import java.util.*;
import java.io.*;

class StdSout{
	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int a1 = in.nextInt();
	            int b1 = in.nextInt();
	            int n1 = in.nextInt();
	            
	            for(int j=0;j<n || j<n1;j++){
	                int term=a;
	                		int s=a1;
	                for(int k=0;k<=j;k++){
	                    term+=Math.pow(2,k)*b;
	                    s+=Math.pow(2, k)*b1;
	                }
	                System.out.print(term+" ");
	                System.out.println();
	                System.out.print(s+" ");
	            }
	            	            
	        }
	       
	        in.close();
	    }
	}

