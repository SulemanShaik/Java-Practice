package PART002staticandnonstaticmethodsconcept;

public class StaticAndNonStaticMethods {
	
	String name="john"; //Global variable - Scope of the variable is though out the functions
	static int age= 25; //static global variable
	
	
	public static void main(String[] args) {
		
		//how to call static methods and vars
		//1.direct calling
		sum();
		//2.call by classname:
		StaticAndNonStaticMethods.sum();
		System.out.println(age);//direct calling by variables
		System.out.println(StaticAndNonStaticMethods.age); //by class name to call variables
		
		//how to call non static methods and vars
		
		StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
		obj.sentMail();
		System.out.println(obj.name);
		
		//can i access static method by using object references? YES
		//obj.sum(); // it is not a good practice
	}
	

	
public  void sentMail() {
		
		System.out.println("sentMail method");
		
	}

public static void sum() {
	
	System.out.println("Sum method");
	
}

	

}
