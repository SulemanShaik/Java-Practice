package PART10_OOPS_Encapsulation;

public class Write_Only_Class {

	private String college;
	
	public void setName() {
		
	}

	public void setCollege(String college) {
		this.college = college;
	}
		
	/*Now, you can't get the value of the college, you can only change the value of college data member.

	System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
	System.out.println(s.college);//Compile Time Error, because the college data member is private.   
	//So, it can't be accessed from outside the class  */

	}


