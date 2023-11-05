package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> ArrayDeque = new ArrayDeque<>();
		ArrayDeque.add("A");
		ArrayDeque.add("B");
		ArrayDeque.add("C");
		System.out.println(ArrayDeque);
		
		ArrayDeque.offer("F");
		System.out.println(ArrayDeque);
		
		for(String item:ArrayDeque)
			System.out.println(ArrayDeque);
			
		
		

	}

}
