package com.fanniemae.payroll.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DriverMap {

	//The object of this topic is to discusss Map and HashMap Interface implementation
	// my name is Sridhar Mannam
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		
		//Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("David", 1000000d);
		map.put("Lucy", 2000000d);
		map.put("Peter", 3000000d);
		
		System.out.println(map.get("David"));
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string.toUpperCase());
		}
		
	}

}
