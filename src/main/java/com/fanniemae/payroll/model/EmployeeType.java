package com.fanniemae.payroll.model;

public class EmployeeType {
	
	private String type;
	private float salary;
	private float hours;
	
	public EmployeeType(String type, float salary, float hours) {
		//super();
		this.type = type;
		this.salary = salary;
		this.hours = hours;
	}

	public String getType() {
		return type;
	}

	public float getSalary() {
		return salary;
	}

	public float getHours() {
		return hours;
	}

	@Override
	public String toString() {
		return "EmployeeType [type=" + type + ", salary=" + salary + ", hours=" + hours + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(hours);
		result = prime * result + Float.floatToIntBits(salary);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeType other = (EmployeeType) obj;
		if (Float.floatToIntBits(hours) != Float.floatToIntBits(other.hours))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	
	

}
