package com.cg.interfaces;
interface Dad{
	void snoring();
	void riding();
	
}
 interface Mom{
	void snoring();
	void cleaning();	
}

class You implements Dad,Mom{
public void snoring()
	{
		System.out.println("Yes, i have snoring from dad and mom");
		}

}


public class MultipleInheritance {
	public static void main(String[] args)
	{
		
	}

}
