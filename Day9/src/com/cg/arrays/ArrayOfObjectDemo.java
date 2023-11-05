package com.cg.arrays;

import java.util.Arrays;

public class ArrayOfObjectDemo {
	public static void main(String[] args) {
		Student arr[]=new Student[5];
		arr[0]=new Student(1,"snk");
		arr[1]=new Student(2,"nnn");
		Student arrOne[]= {new Student (1,"snk"),new Student(2,"nnn")};
		//for(int i=0;i<arr.length;i++)
		//{
		//	System.out.println(arr[i].get
		//}
		System.out.println(Arrays.toString(arr));
	}
}
