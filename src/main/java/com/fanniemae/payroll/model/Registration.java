package com.fanniemae.payroll.model;

public class Registration {
	
	private int id;
	private String fristname; 
	private String lastname;
	private int age;
	
	public Registration(int id, String fristname, String lastname, int age) {
		super();
		this.id = id;
		this.fristname = fristname;
		this.lastname = lastname;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Registration [id = " + id + ", fristname = " + fristname + ", lastname = " + lastname + ", age = " + age + "]";
	}

	

}
