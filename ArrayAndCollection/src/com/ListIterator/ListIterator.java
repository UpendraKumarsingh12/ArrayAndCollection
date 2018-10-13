package com.ListIterator;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<>();
		list.add("upendra");
		list.add("surendra");
		list.add("santosh");
		list.add("sonu");
		list.add(1,"Sachin");
		System.out.println("Elements at second position : "+list.get(2));
		java.util.ListIterator<String>itr=list.listIterator();
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

System.out.println("traversing elements in backward direction..."); 
while(itr.hasPrevious()){
System.out.println(itr.previous());	
}
	}

}
