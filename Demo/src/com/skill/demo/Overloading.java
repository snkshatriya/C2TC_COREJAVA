package com.skill.demo;

class cal
{
	public int add(int n1,int n2) {
		int result=n1+n2;
		return result;		
	}
	public int add(int n1,int n2,int n3) {
		int result=n1+n2+n3;
		return result;		
	}
	
	public double add(double d, double e, double f) {
		double result=d+e+f;
		return result;
	}
}

public class Overloading {

	public static void main(String[] args) {
		cal obj = new cal();
		int result=obj.add(2,3);
		System.out.println(result);
		int s=obj.add(2,3,4);
		System.out.println(s);
		double m=obj.add(2.0,5.0, 5.0);
		System.out.println(m);
		
		

	}

}
