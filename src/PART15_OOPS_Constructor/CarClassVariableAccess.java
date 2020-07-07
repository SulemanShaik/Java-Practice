package PART15_OOPS_Constructor;

public class CarClassVariableAccess {
	
	
	String name;
	int price;
	String engine ;
	

	public static void main(String[] args) {
           
		 CarClassVariableAccess ca= new  CarClassVariableAccess("BMW",2500000,"Automatic");
		 CarClassVariableAccess ca1= new  CarClassVariableAccess("Audi",5500000,"Auomatic");
		 CarClassVariableAccess ca2= new  CarClassVariableAccess("Honda",250000,"Manual");
		
		System.out.println(ca.name+ " "+ ca.price+ " "+ ca.engine);
		System.out.println(ca1.name+ " "+ ca1.price+ " "+ ca1.engine);
		System.out.println(ca2.name+ " "+ ca2.price+ " "+ ca2.engine);
		
	}
	
	public  CarClassVariableAccess(String name, int price,String engine) {
		this.name= name;
		this.price= price;
		this.engine= engine;
		
		
	}

}
