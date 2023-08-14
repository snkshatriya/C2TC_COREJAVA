package com.cg.demo;

public class TestOne {
	//private  id;
	//private void display()
	public int id;
	public void display()
	{
		System.out.println("Access Modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t1=new TestOne();
		t1.id=5;
		System.out.println(t1.id);
		t1.display();	

	}

}
