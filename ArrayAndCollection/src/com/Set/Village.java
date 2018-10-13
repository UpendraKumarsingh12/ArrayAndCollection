package com.Set;

public class Village {
	int pincode;
	String villageName;
	int population;
	public Village(int pincode, String villageName, int population) {
		super();
		this.pincode = pincode;
		this.villageName = villageName;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Village [pincode=" + pincode + ", villageName=" + villageName + ", population=" + population + "]";
	}
	

}
