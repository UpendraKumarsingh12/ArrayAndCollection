package com.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String>queue= new PriorityQueue<>();
		queue.add("surendra");
		queue.add("upendra");
		queue.add("Shyam");
		queue.add("ram");
		queue.add("ravi");
		queue.add("raj");
		System.out.println("head : "+queue.element());
		System.out.println("head : "+queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String>itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String>itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}

}
