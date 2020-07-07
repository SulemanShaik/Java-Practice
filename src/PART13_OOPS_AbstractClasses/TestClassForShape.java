package PART13_OOPS_AbstractClasses;

public class TestClassForShape extends Shape {
	
	
	TestClassForShape(){
		System.out.println("TestClassForShape-- Constructor");
	}

	public static void main(String[] args) {
 
		
		/*Shape s = new TestClassForShape();
		s.drawing();
		s.fill();
	*/
		TestClassForShape tc = new TestClassForShape();
		
	}

	@Override
	void drawing() {
		
		System.out.println("Test--drawing method");
		
	}

}
