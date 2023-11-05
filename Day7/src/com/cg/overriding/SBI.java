package com.cg.overriding;

//subclass
public class SBI extends RBI {
	public float getRateOfInterest()
	{
		return 7.0f;
	}
	public SBI getObject()//wanted my object
	{
		return this;//to return the current class object
	}
}
