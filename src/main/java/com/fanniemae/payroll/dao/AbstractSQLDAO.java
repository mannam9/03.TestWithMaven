package com.fanniemae.payroll.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public abstract class AbstractSQLDAO {

	private BasicDataSource ds = new BasicDataSource();

	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	{

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("hexaware");
		ds.setPassword("hexaware");
		ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");

	}

	public void modify(String sqlStatement) {
		AutoCloseable c = null;
		//try catch resource
		try(Connection con = ds.getConnection();) {
			//con = ds.getConnection();
			
			stmt = con.createStatement();
			stmt.executeUpdate(sqlStatement);

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void process(String sqlStatement) {
	
		AutoCloseable c = null;
		// move to above --BasicDataSource ds = new BasicDataSource();

		/*
		 * move to above ds.setDriverClassName("com.mysql.jdbc.Driver");
		 * ds.setUsername("hexaware"); ds.setPassword("hexaware");
		 * ds.setUrl("jdbc:mysql://localhost:3306/world");
		 */

		/*
		 * move to above --Connection con = null; Statement stmt = null;
		 * ResultSet rs = null;
		 */
		try(Connection con = ds.getConnection();) {
			//con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlStatement);
			while (rs.next()) {

				results(rs);

				/*
				 * System.out.println("City ID = " + rs.getString("id") +
				 * " || City Name = " + rs.getString("name") +
				 * " || City Population = " + rs.getInt("population"));
				 */

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
/*		close connection with AutoClosable finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/

	}

	protected abstract void results(ResultSet rs) throws SQLException;

}
