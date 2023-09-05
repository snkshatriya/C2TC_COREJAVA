package com.cg.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic binding
		RBI rbi=new SBI ();
		System.out.println(rbi.getRateOfInterest());
		HDFC rbi1=new HDFC();
		System.out.println(rbi1.getRateOfInterest());
		ICIC rbi2=new ICIC();
		System.out.println(rbi2.getRateOfInterest());

	}

}
