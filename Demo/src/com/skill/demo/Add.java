package com.skill.demo;

public class Add {
	private int a;
	private int b;
	private int sum=a+b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Add(int a, int b, int sum) {
		super();
		this.a = a;
		this.b = b;
		this.sum = sum;
	}
	public Add() {
		// TODO Auto-generated constructor stub
	}
	

}
