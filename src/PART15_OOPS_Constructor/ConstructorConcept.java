package PART15_OOPS_Constructor;

public class ConstructorConcept {
	
	
	String name;  //class var or instance var
	int age;

	public static void main(String[] args) {
		
         ConstructorConcept obj = new ConstructorConcept();//we are not calling method just creating object
		
         ConstructorConcept obj1 = new ConstructorConcept (10);
         
         ConstructorConcept obj2 = new ConstructorConcept (25,50);
		
         ConstructorConcept obj3 = new  ConstructorConcept("Tom",26); //accessing class var
         System.out.println(obj3.name);
         System.out.println(obj3.age);
		
         
	}
	
	
	
	public ConstructorConcept() {
		System.out.println("This is default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("1 parameterized Constructor");
         System.out.println(i);
	}
	
	
	public ConstructorConcept(int i, int j) {
		System.out.println("2 parameterized Constructor");
         System.out.println(i+ "   "+j);
         }
	
	public ConstructorConcept(String name, int age) {
		this.name= name; //this.classvar= localvar
		this.age= age;
		//name= name1;
		//age = age1;  //we can write this type also but this keyword type is recommended
		
         
	}




}
