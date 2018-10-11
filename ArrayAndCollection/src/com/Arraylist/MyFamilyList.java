package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MyFamilyList {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<>();
		list.add("ravindra");
		list.add("surendra");
		list.add("upendra");
		list.add("harendra");
		 Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
