package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;
import com.mysql.cj.mysqlx.ResultCreatingResultListener;

	
public class CityRepository extends AbstractSQLDAO 
		implements IQuery<City>	{
	
	ArrayList<City> list = new ArrayList<>();
	
	@Override
	protected void results(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		list.add(new City(id,name,population));
		
/*		try {

			System.out.println(rs.getString("name"));
		}

		catch (SQLException e) {
// remove this add throw to catch the exception.
			e.printStackTrace();
		}*/ 
		
		//System.out.println(rs.getString("name"));
	}

/*	public void process() {
		String sql = "select id , name, population  from city";
// move to array list
		super.process(sql);

	}*/

	@Override
	public ArrayList<City> findAll() {
		// TODO Auto-generated method stub
		String sql = "select id , name, population  from city";
		super.process(sql);
		return list;
	}

	@Override
	public City findByKey(String key) {
		// TODO Auto-generated method stub
		
		String sql = "select id , name, population  from city "
				+ "where id = " + key;
		System.out.println(sql);
		super.process(sql);
		
		City city = list.get(0);
		
		return city;
				
		//return IQuery.super.findByKey(key);
	}

	
}
