package com.cg.abstractclass;

public abstract class Student {
	int id;//variable
	public Student() 
	{
		System.out.println("Student Constructor");
	}
	//methods -non abstract method
	public void dislay()
	{
		
	}
	//method -abstract method
	public abstract void show();
	//both class and method need to be abstract
}
