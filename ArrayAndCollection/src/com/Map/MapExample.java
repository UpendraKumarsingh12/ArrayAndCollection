package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,Employee>map= new HashMap<>();
		Employee e1= new Employee("upendra",10000);
		Employee e2= new Employee("surendra",50000);
		Employee e3= new Employee("ram",100);
		map.put(1, e1);
		map.put(2, e2);
		map.put(3,e3);
		for(Map.Entry m:map.entrySet()){
			int key=(int) m.getKey();
			Employee e=(Employee) m.getValue();
			 System.out.println(key+" Details:");  
			 System.out.println(e.empName+" : "+e.salary);
		}
	}

}
