package PART07B_AccessModifiersAndPackages;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		TestCase1 obj = new TestCase1();
		//System.out.println(obj.privateVariable);  //--no accessible outside class
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
	
		
		
	}

}
