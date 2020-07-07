package PART13_OOPS_AbstractClasses;

public abstract class Animal {
	
	/*public void eat() {
		System.out.println("Animal is eating"); //0% abstraction 
	}*/
	
	public final void eat() {
		System.out.println("Animal is eating");  //final methods
		
	}
 
	
//It can have final methods which will force the subclass not to change the body of the method.
	
}
