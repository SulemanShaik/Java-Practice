package PART14_OOPS_Interfaces;

public class Testclass_USbank_Hsbcbank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//USBank.min_bal=200; we cant change the value Final in nature
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		
		//dynamic polymorphism
		//child class objects can be referred by parents Interface reference variables
		 
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//it will access only overridden methods only
	}

}
