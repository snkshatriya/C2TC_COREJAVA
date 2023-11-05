package com.cg.overloading;

public class Point {
	private float x,y;
	//Constructor Overloading
	// c1(constructor)-0 Parameter
	public Point() {
		x=0.0f;
		y=0.0f;
			}
	//c2- single parameter
	public Point(int x) {
		this.x=x;
				
	}
	//c3- two parameter
	public Point(float x) {
		this.x=x;
		
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//overloading can be achieved by either difference in parameter or data type

}
