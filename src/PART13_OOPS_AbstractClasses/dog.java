package PART13_OOPS_AbstractClasses;

public class dog extends Animal{
	
	
	/*public final void eat() {
		System.out.println("Animal is eating");  //final methods
		
	}*/  //we cant override the final method

	public static void main(String[] args) {
 
		 dog d = new dog();
		 d.eat();
		
		
	}

}
