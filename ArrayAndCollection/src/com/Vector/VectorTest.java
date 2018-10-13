package com.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String>v= new Vector<String>();
		v.add("upendra");
		v.add("surendra");
		v.add("Ram");
		Iterator<String>itr= v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
