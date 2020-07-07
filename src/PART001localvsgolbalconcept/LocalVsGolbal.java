package PART001localvsgolbalconcept;

public class LocalVsGolbal {
	
	String name="john";  //Global variables or class variables
	int age=26;
	public static void main(String[] args) {
		
		int i=10;  // local variables
		System.out.println(i);
		//System.out.println(name); name we can't print name, be'z its an global variables 
		//we need create object
		LocalVsGolbal obj = new LocalVsGolbal ();
		System.out.println((obj.name));
		System.out.println((obj.age));
			
		}
	public void sum()
	{
	int i=15;   //local var for sum method
	int j=20;
	
	}

}
