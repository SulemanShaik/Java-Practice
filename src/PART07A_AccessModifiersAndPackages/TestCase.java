package PART07A_AccessModifiersAndPackages;

import PART07_AccessModifiersAndPackages.ClassA;

public class TestCase {

	public static void main(String[] args) {
		
		
		ClassA obj= new ClassA();
		obj.addOn();  //ClassA as Public Access Modifier and it can access any package
		
		//ClassB obj2 = new ClassB();
		
//ClassB as Default Access Modifier and it can access within that particular package only
		
		
	

	}

}
