package PART12_OOPS_Polymorphism;

public class MethodOverrdingChild extends MethodOverridingParent {

	public static void main(String[] args) {
  
		MethodOverrdingChild obj = new MethodOverrdingChild();
		obj.run();
		
		
	}
	
	
	public void run() {
		System.out.println("Bmw Run Successfully");
	}

}
