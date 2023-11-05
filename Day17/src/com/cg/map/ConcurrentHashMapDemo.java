package com.cg.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
		chm.put(100, "hello");
		chm.put(101, "Hru");
		chm.put(102, "Fine");
		System.out.println(chm);
		
		chm.putIfAbsent(103, "helllo");
		System.out.println(chm);
		
		chm.remove(104,"hru");
		System.out.println(chm);
		
		chm.remove(101,"Hru");
		System.out.println(chm);
		
		chm.replace(100,"hello","hey");
		System.out.println(chm);
		
	}

}
