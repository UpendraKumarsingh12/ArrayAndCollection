package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedArrayList {

	public static void main(String[] args) {
		Employee e1= new Employee(101,"upendra",40000);
		Employee e2= new Employee(102,"surendra",60000);
		Employee e3= new Employee(103,"harendra",30000);
		Employee e4= new Employee(104,"ravindra",10000);
		ArrayList<Employee>list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e1);
		Iterator<Employee>itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
