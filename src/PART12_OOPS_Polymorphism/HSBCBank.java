package PART12_OOPS_Polymorphism;

public class HSBCBank extends RBI1{

	public static void main(String[] args) {
		
		
		HSBCBank obj = new HSBCBank();
		
		System.out.println(obj.getHomeLoanROI());
		
		RBI1 obj1 = new HSBCBank();     //we can create parent object not child object
		
	}
	
	
	public double getHomeLoanROI() {
		
		return 9.15;                   //override
		
	}
	
	//WebDriver driver = new ChromeDriver();    -----polymorphic reference
	
	public HSBCBank getObject() {
		
		HSBCBank obj = new HSBCBank();      //can we return type while performing overriding?
		return obj;                         //Yes->in case the return types are classname
	}
}
