package com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String>set= new HashSet<>();
		set.add("upendra");
		set.add("surendra");
		set.add("ram");
		set.add("shyam");
		set.add("upendra");
		/*Iterator<String>itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		for(String s:set){
			System.out.println(s);
		}

	}

}
