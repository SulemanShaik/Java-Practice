package PART13_OOPS_AbstractClasses;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b;
		b=new SBIBank();  
		System.out.println("Rate of Interest SBI is: "+b.rateOfInterest()+" %");    
		b=new AndhraBank();  
		System.out.println("Rate of Interest Andhra Bank is: "+b.rateOfInterest()+" %");    
		
		
		
		
		
		
		
		
		
		
     }
}
