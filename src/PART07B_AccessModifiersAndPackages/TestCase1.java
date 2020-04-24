package PART07B_AccessModifiersAndPackages;

public class TestCase1 {
	
	public   int publicVariable=10;
	private  int privateVariable=20;
	protected int protectedVariable=30;
	int defaultVariable=40;
	
	
	public static void main(String args[]) {
		
		TestCase1 obj= new TestCase1();
		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
	}

}
