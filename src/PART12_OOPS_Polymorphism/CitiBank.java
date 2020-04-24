package PART12_OOPS_Polymorphism;

public class CitiBank extends RBI1{
	
	
	public static void main(String[] args) {
		
	
		CitiBank cb = new CitiBank();           //creating object
		System.out.println(cb.getCarLoanROI());  //calling method
	
	}
	
	public double getCarLoanROI() {
		
		return 17.15;                       //Override
		   
	}

	
}
    
	

