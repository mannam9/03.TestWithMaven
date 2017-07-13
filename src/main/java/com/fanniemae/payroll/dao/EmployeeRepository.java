package com.fanniemae.payroll.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.fanniemae.payroll.model.EmployeeType;

public class EmployeeRepository {

	public int getSize(){
		return 3;
	}
	public ArrayList<EmployeeType> findAll() {
		String fileName = "C:/Data/Employees.txt";
//		boolean isEmpty = true;
		FileReader fr;

		ArrayList<EmployeeType> list = new ArrayList<>();
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row = "";
			br.readLine();
			
			while ((row = br.readLine()) != null) {
//				isEmpty = false;
				String[] columns = row.split(",");
				if (columns.length < 3) {
					continue;
				}
				String type = columns[0];
				float salary = Float.parseFloat(columns[1]);
				float hours = Float.parseFloat(columns[2]);
				EmployeeType empType = new EmployeeType(type, salary, hours);
//				System.out.println(empType);
				list.add(empType);
			}
/*			if (isEmpty) {

				System.out.println("The file has empty data.");
			}

			System.out.println("Size of the list:" + list.size());
*/
			br.close();
		} 
/*		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
*/
		
		catch (Exception e) {
//			System.out.println("Other Exceptions");
			e.printStackTrace();
		}
		return list;
	}
}
