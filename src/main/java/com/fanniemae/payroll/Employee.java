package com.fanniemae.payroll;

public abstract class Employee {
	
	//Instance Variable
	
	float yearlySalary = 0;
	
	
	public Employee (float yearlySalary){
		this.yearlySalary = yearlySalary;
	}

	//Yearly object
	public float getYearlySalary(){
		return yearlySalary;
	}
	
	//Weekly object
	
	public float getWeeklySalary() {
		// return 100f;
		return yearlySalary / 52;
	}

	//Monthly object
	public float getMonthlySalary() {
		// return 100f;
		return yearlySalary / 12;
	}
	
	public float getHourlyWage() {
		// return 100f;
		return yearlySalary / (52*40);
	}
	
	//Hourly object
/*/	
	public float getHourlyWage() {
		// return 100f;
		return getWeeklySalary()/40;
	}
*/
	public float getOverTimeHourlyWage(){
		return 0;
		
	}
	
	@Override
	public String toString() {

		return "I'm an Employee that makes " + this.getYearlySalary() + " Yearly";
	}
}
