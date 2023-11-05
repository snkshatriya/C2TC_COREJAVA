package com.cg.throwdemo;

import java.io.IOException;

public class ThrowsDemo {
	 void MyMethod(int num) throws Exception {
		if(num==1)
			throw new IOException("IO Exception occur");
		else
			throw new ClassNotFoundException("Class not found exception");
	}

	public static void main(String[] args) {
		ThrowsDemo td=new ThrowsDemo();
		try {
			td.MyMethod(1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
