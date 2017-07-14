package com.fanniemae.payroll;

public class EmailProcess implements Runnable {
	
	public void sendEmail() {
		System.out.println("e-Mail process Started");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
			
		System.out.println("e-Mail process Ended");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sendEmail();
		
		
	}

}
