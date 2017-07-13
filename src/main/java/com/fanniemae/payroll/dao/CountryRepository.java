package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;

	
public class CountryRepository extends AbstractSQLDAO 
		implements IQuery<Country>	{
	
	ArrayList<Country> list = new ArrayList<>();
	
	@Override
	protected void results(ResultSet rs) throws SQLException {
		String code = rs.getString("code");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		list.add(new Country(code,name,population));
		
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
	public ArrayList<Country> findAll() {
		// TODO Auto-generated method stub
		String sql = "select code , name, population  from country";

		super.process(sql);
		
		return list;
	}

}
