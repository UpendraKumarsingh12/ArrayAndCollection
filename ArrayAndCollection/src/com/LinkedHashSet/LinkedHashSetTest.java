package com.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String>set= new LinkedHashSet<>();
		set.add("ravi");
		set.add("ram");
		set.add("sonu");
		set.add("rakesh");
		set.add("lali");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
