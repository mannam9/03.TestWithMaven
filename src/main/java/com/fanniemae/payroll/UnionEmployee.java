package com.fanniemae.payroll;

public class UnionEmployee extends Employee {

	// UnionEmployee is a employee

	float hoursWorked = 40f;

	public UnionEmployee(float yearlySalary) {
		super(yearlySalary);

	}

	public UnionEmployee(float yearlySalary, float hoursWorked) {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;

	}
	// code = new, code == season
	public UnionEmployee(String code, float yearlySalary, float hoursWorked) throws Exception {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;

		if (hoursWorked > 40 && (code.equals("new"))) {
			Exception e = new Exception();
			throw e;
			
		}
		
	}

	// Annotations

	@Override
	public String toString() {

		return "I'm an Employee that makes " + this.getYearlySalary() + " Yearly";

	}

	@Override
	public float getWeeklySalary() {

		float otHours = 0;
		float otPay = 0;
		float weeklySalary = 0;

		if (hoursWorked > 40) {

			otHours = this.hoursWorked - 40;
			otPay = otHours * this.getOverTimeHourlyWage();

			weeklySalary = 40 * super.getHourlyWage() + otPay;

		} else {

			weeklySalary = super.getHourlyWage() * this.hoursWorked;

		}
		return weeklySalary;
	}

	@Override
	public float getOverTimeHourlyWage() {
		float ot = super.getHourlyWage() * 1.5f;
		return ot;

	}

}
