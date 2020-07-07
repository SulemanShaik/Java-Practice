package PART14_OOPS_Interfaces;

public class HSBCBank implements USBank, BrazilBank {//we are achieving multiple Interface
	//IS a relationship
	
	
//If a class implements any Interface, then its mandatory to define/override all the methods of Interface.
	//override the USBank
	
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	
	//Separate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--car loan");
	}
	//Brazil bank method: overriding from the brazil bank
	public void mutualFund() {
		System.out.println("hsbc--mutualFund");
	}

}
