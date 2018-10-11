package com.LinkedList;

import java.util.LinkedList;
import java.util.List;

class Company{
	int companycineNumber;
	String companyName;
	String CompanyLevel;
	String Specification;
	public Company(int companycineNumber, String companyName, String companyLevel, String specification) {
		super();
		this.companycineNumber = companycineNumber;
		this.companyName = companyName;
		CompanyLevel = companyLevel;
		Specification = specification;
	}
	
}
public class LinkedListExample {

	public static void main(String[] args) {
		//Creating list of Companies  
	    List<Company> list=new LinkedList<Company>();
	    Company c1=new Company(1000021,"TECH Mahindra","CMM5","Development");  
	    Company c2=new Company(102222,"TCS","CMM5","Dvelopment&Marketing");  
	    Company c3=new Company(103,"Wipro","CMM5","DEVlopment"); 
	    //Adding Companies to list  
	    list.add(c1);  
	    list.add(c2);  
	    list.add(c3);  
	    //Traversing companylist  
	    for(Company c:list){  
	    System.out.println(c.companycineNumber+" "+c.companyName+" "+c.CompanyLevel+" "+c.Specification);  
	    }  
	}

}
