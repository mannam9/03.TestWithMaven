package com.fanniemae.payroll.driver;



import com.fanniemae.payroll.dao.RegistrationRepository;
import com.fanniemae.payroll.model.Registration;

public class DriverRegistrationRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegistrationRepository r = new RegistrationRepository();
		Registration t = new Registration(1002, "John", "Lee", 28);
		
		//r.insert(t);
		System.out.println("Insert Successful. " + t);
		
		r.delete(1000);
		System.out.println("Delete Successful.");
	}

}
