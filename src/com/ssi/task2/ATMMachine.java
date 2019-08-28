package com.ssi.task2;

public class ATMMachine {
	ATMCards cards;
	public void configureATMcard(ATMCards card){
		this.cards = card;
		cards.welcomeMsg();
	}
	
	public void withdraw(){
		
		//cards.checkBalance();
		cards.withdrawMoney();
		//cards.setPIN();
	}
	
	public void checkBalance(){
		cards.checkBalance();
	}
	public void setCardPIN(){
		cards.setPIN();
	}
	

	public static void main(String[] args) {
	    ATMMachine objATM = new ATMMachine();
	    SBICards cardSBI = new SBICards();
	    HDFCCards cardHDFC = new HDFCCards();
	    objATM.configureATMcard(cardSBI);
	    objATM.checkBalance();
	    objATM.withdraw();
	    objATM.configureATMcard(cardHDFC);
	    objATM.checkBalance();
	    objATM.withdraw();
	}

}
