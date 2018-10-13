package com.Set;

import java.util.HashSet;
import java.util.Set;

public class ListOfVillageInPanchayat {
	 
	
	public static void main(String[] args) throws VillageException {
		Village v1= new Village(802212,"Bhagwatipur",100);
		Village v2= new Village(802213,"Jonhi",1000);
		Village v3= new Village(802214,"Najirganj",105);
		Village v4= new Village(802215,"tola",10);
		Village v5= new Village(802216,"sudharsan",150);
		Set<Village>set= new HashSet<Village>();
		
		set.add(v5);
		set.add(v4);
		set.add(v3);
		set.add(v2);
		set.add(v1);
		
		for(Village v:set){
		//System.out.println(v);	
		if(set.size()<3){
			throw  new VillageException();
			
		}else{
			System.out.println(v);
		}
		}

	}

}
