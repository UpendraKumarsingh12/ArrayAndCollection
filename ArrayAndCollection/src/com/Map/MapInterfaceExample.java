package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {
		Map<Integer,String>map= new HashMap<Integer,String>();
		map.put(1,"upendra");
		map.put(2,"surendra");
		map.put(3,"ram");
		map.put(4,"lala");
		map.put(4,"rakesh");
		for(Map.Entry e:map.entrySet()){
			System.out.println(e.getKey()+"  "+e.getValue());
			
		}

	}

}
