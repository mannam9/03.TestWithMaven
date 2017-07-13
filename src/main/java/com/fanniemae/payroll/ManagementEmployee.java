package com.fanniemae.payroll;

public class ManagementEmployee extends Employee {

	float hoursWorked = 40f;

	// Constructor method

	public ManagementEmployee(float yearlySalary) {
		super(yearlySalary);

	}

	public ManagementEmployee(float yearlySalary, float hw) {
		super(yearlySalary);
		this.hoursWorked = hw;
	}

	@Override
	public float getOverTimeHourlyWage() {

		float otPayamt1 = 1000f;
		float otPayamt2 = 2000f;
		float otPayamt3 = 3000f;
		float otPayamt4 = 0f;

		float otWage = 0f;

		if (hoursWorked < 50) {
			otWage = otPayamt4 / (hoursWorked - 40);
		} else if (hoursWorked >= 50 && hoursWorked < 60) {
			otWage = otPayamt1 / (hoursWorked - 40);
		} else if (hoursWorked >= 60 && hoursWorked < 80) {
			otWage = otPayamt2 / (hoursWorked - 40);
		} else if (hoursWorked >= 80) {
			otWage = otPayamt3 / (hoursWorked - 40);
		}

		return otWage;
	}

	@Override
	public float getWeeklySalary() {

		float otPayamt1 = 1000f;
		float otPayamt2 = 2000f;
		float otPayamt3 = 3000f;
		float otPayamt4 = 0f;

		float otSalary = super.getWeeklySalary();

		// TODO Auto-generated method stub
		/*
		 * float otPayamt1 = 0f; float otPayamt2 = 1000f; float otPayamt3 =
		 * 2000f; float otPayamt4 = 3000f; float weeklySalary = 0;
		 * 
		 * if (this.hoursWorked <= 49){ weeklySalary = super.getWeeklySalary() +
		 * otPayamt1; } else {
		 * 
		 * if (this.hoursWorked > 50 AND this.hoursWorked <= 59) {
		 * 
		 * weeklySalary = super.getWeeklySalary() + otPayamt2; }
		 * 
		 */

		if (hoursWorked < 50) {
			otSalary = super.getWeeklySalary() + otPayamt4;
		} else if (hoursWorked >= 50 && hoursWorked < 60) {
			otSalary = super.getWeeklySalary() + otPayamt1;
		} else if (hoursWorked >= 60 && hoursWorked < 80) {
			otSalary = super.getWeeklySalary() + otPayamt2;
		} else if (hoursWorked >= 80) {
			otSalary = super.getWeeklySalary() + otPayamt3;
		}

		// return super.getWeeklySalary() + otSalary;
		return otSalary;
	}

	@Override
	public String toString() {

		return "I'm an Employee that makes " + this.getYearlySalary() + " Yearly";

	}
}
