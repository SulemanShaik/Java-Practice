package PART12_OOPS_Polymorphism;

public class RBI {
	
	
	public void getHoamLoanROI(String bankname,int amount) {
		
	}
	
	
    /*public void getHoamLoanROI(String bankname,int amount) {
		
	}*/        //we can't write same methods
	
	
    public void getHoamLoanROI(int amount,String bankname) {
		
	}      //we can write by using method signature-
           //method name is same but method signature is different
    
    public void getHoamLoanROI() {
    	
    }            ////we can write by using method signature

}
