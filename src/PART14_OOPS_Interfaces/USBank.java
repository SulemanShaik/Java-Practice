package PART14_OOPS_Interfaces;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body - only method prototype
	//in Interface, we can declare the variables, variables are static in nature
	//variables value will not be change, its Final/Constant in nature
	//no static method in Interface
	//no main method in Interface
	//we cannot create the object of Interface
	//Interface is abstract in nature
		
	

}
