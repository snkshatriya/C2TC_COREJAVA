package com.cg.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[]= {10,20,30,40,100,90,80};
		
		System.out.println("Given array is :" +Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("Sorted array is :" +Arrays.toString(intArr));
		
		int intkey=20;
		System.out.println(intkey +" found at index "+Arrays.binarySearch(intArr,intkey));
		System.out.println(intkey +" found at index "+Arrays.binarySearch(intArr,1,3,intkey));
		
		int intArrOne[]= {10,15,22};
		System.out.println("Array is:" +Arrays.toString(intArrOne));
		
		if(Arrays.equals(intArr, intArrOne)) {
			System.out.println("both arrays are eqaul");}
		else {
			System.out.println("Both are not equal");
		}
		
		int intArrTwo[]=Arrays.copyOf(intArr,10);//from 0 index	
		System.out.println("Copy of Array is:" +Arrays.toString(intArrTwo));
		int intArrTwo1[]=Arrays.copyOfRange(intArr,1,3);
		System.out.println("Copy of Array is:" +Arrays.toString(intArrTwo1));
		Arrays.fill(intArr, intkey);
		System.out.println("Given array is :" +Arrays.toString(intArr));
		
		
	}
}
