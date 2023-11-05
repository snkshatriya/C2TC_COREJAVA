package com.cg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		//key-should be unique , value - can be duplicate
		hm.put("Let Us C", 320);
		hm.put("The compelte reference c++", 450);
		hm.put("The compelte reference java", 465);
		hm.put("Python Programming", 599);
		hm.put("Aplication Develoment using Spring Boot", 600);
		System.out.println(hm);
		
		Set  set=hm.entrySet();
		Iterator i= set.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			//System.out.println(me.getValue());
			System.out.println(me);
		}
		
		HashMap<String,String> hm1=new HashMap<>();
		hm1.put("snk", "snk@gmail.com");
		hm1.put("vnk", "vnk@gmail.com");
		hm1.put("rnk", null);
		hm1.put(null, "abc@gmail.com");
		hm1.put("har", "har@gmail.com");
		hm1.put(null, null);
		System.out.println(hm1);
		
		Map<String,Student> hm2=new HashMap<>();
		hm2.put("snk", new Student(1,"snk"));
		
		System.out.println(hm2);
		
		
		

	}

}
