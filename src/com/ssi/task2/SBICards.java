package com.ssi.task2;

public class SBICards implements ATMCards {

	public void welcomeMsg() {
		  System.out.println("#----------------------------------------------------#");
      System.out.println("welcome to SBI Banking Services ");
    
	}

	public void checkBalance() {
		System.out.println("checking balance");
	}

	public void withdrawMoney() {
		System.out.println("Withdrawing Money");
	}

	public void setPIN() {
		System.out.println("Please reset your pin");
	}

}
