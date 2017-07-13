package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {

	public CarRepository() {
		// TODO Auto-generated constructor stub
		System.out.println("I'm on!!!");
	}

	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> findMaps() {
		// TODO Auto-generated method stub

		Map<String, Double> carMap = new HashMap<>();

		carMap.put("Camrey", 20000d);
		carMap.put("Accord", 30000d);
		carMap.put("RAV4", 40000d);
		carMap.put("CRV", 50000d);
		carMap.put("ML450", 60000d);
		carMap.put("I30t", 70000d);
		carMap.put("Lexus", 80000d);
		carMap.put("Prius", 90000d);
		carMap.put("BMW", 10000d);
		carMap.put("Pathfinder", 25000d);

		return carMap;
	}

}
