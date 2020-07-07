package PART13_OOPS_AbstractClasses;

public abstract class Shape {
	
	Shape(){
		System.out.println("Shape --- Constructor");
	}
	
	int color;
	abstract void drawing();   //abstract method
	
	
	public void fill() {
		System.out.println("Shape fill--method");   //non abstract method
	}

            //Can't create the object of interface
	
	         //we can create constructors also
	         //it can have abstract methods non abstract methods 
	         //in Abstraction we can achieve 0 to 100% abstraction
	   // It can have final methods which will force the subclass not to change the
	    // body of the method.
}
