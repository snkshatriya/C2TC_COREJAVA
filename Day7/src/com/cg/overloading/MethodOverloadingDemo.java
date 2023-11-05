package com.cg.overloading;

public class MethodOverloadingDemo {
	
	//M1 - 2 parameter
	public static int addition(int a,int b) {
		return a+b;
	}
	//M2- Data type of parameter and return type
	public static float addition(float a,float b) {
		return a+b;
	}
	//M3- Data type in parameter
	public static float addition(int a,float b) {
		return a+b;
	}
	//M4- Data type in parameter
	public static float addition(float a,int b) {
		return a+b;
	}
	
	//public static int addition(int a,float b) {
	//	return a+b;
	//}
	// to achieve method overloading 
	//1. Data type of argument alone
	//2. Number of argument alone
	//3. Data type of argument +return type of method
	//4. Number of argument+type of method
	//5. not possible--return type of method alone

}
