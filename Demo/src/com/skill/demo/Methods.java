package com.skill.demo;

import java.util.Scanner;

class Computer{
	public void playMusic()
	{
		System.out.println("Music is played");
		}
	
	public String genderRevel(char string) {
		if (string=='F')
		return "Female";
		else if(string=='M')
		return "Male";
		else
			return "Nothing";
	}
	public double calculate(double d,double e) {
	double sum=d+e;
	 return sum;
				
	}
}

public class Methods {

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.playMusic();
		String m=obj.genderRevel('F');
		System.out.println(m);
		double p=obj.calculate(33.5,22.8);
		System.out.println(p);
		
	}

}
