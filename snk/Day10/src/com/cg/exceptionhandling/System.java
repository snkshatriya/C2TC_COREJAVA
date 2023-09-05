package com.cg.exceptionhandling;

public class System {

	public static Object out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st line");
		System.out.println("2nd line");
		int[] myIntArray;
		try {
			myIntArray = new int[] {1,2,3};
			print(myIntArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("there is no index 3");
		}
		
		System.out.println("3rd line");		
	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
		System.out.println("4th element successfully displayed");
		
	}

}