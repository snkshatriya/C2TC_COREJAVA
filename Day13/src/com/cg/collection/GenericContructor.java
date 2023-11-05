package com.cg.collection;

public class GenericContructor {
	private double v;
	public<T extends Number> GenericContructor(T t)
	{
		v=t.doubleValue();
	}
	void show() {
		System.out.println("Value of v in double "+v);
	}

}
