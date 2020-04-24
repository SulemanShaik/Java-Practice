package PART07C_AccessModifiersAndPackages;

import PART07B_AccessModifiersAndPackages.TestCase1;

public class Sample1 extends TestCase1{

	public static void main(String[] args) {
		
		
		Sample1 obj = new Sample1();
		        //System.out.println(obj.privateVariable); 
				System.out.println(obj.publicVariable);
				System.out.println(obj.protectedVariable);
				//System.out.println(obj.defaultVariable);
				
				//outside package using inheritance

	}

}
