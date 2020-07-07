package PART10_OOPS_Encapsulation;

public class EmployeeData {

	//Encapsulation is also called data hiding
	//private data variables:so that these variables can not accessed directly
	 //from outside the class
	private int empId;
	private int empAge;
	private String empName;
	
	public static void main(String[] args) {
		
	   	
		 EmployeeData  obj = new  EmployeeData ();
		 
		 obj.setEmpName("Peter");
		 obj.setEmpAge(26);
		 obj.setEmpId(123456);
		 
		 System.out.println(obj.getEmpName());
		 System.out.println(obj.getEmpId());
		 System.out.println(obj.getEmpAge());
		 
		 
		
		

	}
	
	//public getters and setters methods: to set and get the values of the fields
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//Read Only class
	/*1.	//A Java class which has only getter methods.  
	2.	public class Student{  
	3.	//private data member  
	4.	private String college="AKG";  
	5.	//getter method for college  
	6.	public String getCollege(){  
	7.	return college;  
	8.	}  
	9.	}  
*/
	 
	//Write only class
	/*1.	//A Java class which has only setter methods.  
	2.	public class Student{  
	3.	//private data member  
	4.	private String college;  
	5.	//getter method for college  
	6.	public void setCollege(String college){  
	7.	this.college=college;  
	8.	}  
	9.	}  
*/
	
	
	

}
