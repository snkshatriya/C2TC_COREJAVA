package com.cg.arrays;

public class MultiLevelArray {

public static void printArray(int c[][])
		{
			System.out.println("Array Elemnts are as follow:");
			for(int i=0;i<c.length;i++)
			for(int j=0;j<c[i].length;j++)
			System.out.println(c[i][j]+ " ");
					
					
		}
	}
