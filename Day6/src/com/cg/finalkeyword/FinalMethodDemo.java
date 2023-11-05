package com.cg.finalkeyword;

public class FinalMethodDemo {
	 int a=90;
	 
	
	public FinalMethodDemo() {
			}

	public FinalMethodDemo(int a) {
		//super(); to call the immediate parent class 
		this.a = a;
	}

	final void display() {
		System.out.println("value of a:" +a);
	}

	@Override
	public String toString() {
		return "FinalMethodDemo [a=" + a + "]";
	}

}
