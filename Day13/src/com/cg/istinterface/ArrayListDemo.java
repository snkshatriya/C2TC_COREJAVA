package com.cg.istinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List listone = new ArrayList();
		listone.add(10);
		listone.add(20);
		listone.add(true);
		listone.add(false);
		listone.add("hello");
		listone.add(10.78);
		listone.add('A');
		listone.add(5,"Hi");//5 - index ;i/p-Hi
		listone.add(20);
		listone.add(null);
		//duplicate
		System.out.println(listone);
		System.out.println(listone.size());//size of list
		System.out.println(listone.isEmpty());//bollean value we get
		System.out.println(listone.contains(10));//T or F we get
		//listone.remove(false);
		//we get IndexOutOfBoundsException
		listone.remove(10.78);
		System.out.println(listone);
		System.out.println(listone.get(5));//index value
		System.out.println(listone.indexOf(20));//firstindex we get
		System.out.println(listone.lastIndexOf(20));//lastindex
		
		//Collections.sort(listone);//ClassCastException 
		List listone1= new ArrayList();
		listone1.add(10);
		listone1.add(20);
		listone1.add(true);
		listone.removeAll(listone1);//used to compare and remove the elements
		System.out.println(listone);
		listone.clear();//is used to make a list empty
		System.out.println(listone);
		
		
		
		
		
	}

}
