package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>set= new TreeSet<>();
		set.add("upendra");
		set.add("surendra");
		set.add("harendra");
		set.add("ravindra");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}

	}

}
