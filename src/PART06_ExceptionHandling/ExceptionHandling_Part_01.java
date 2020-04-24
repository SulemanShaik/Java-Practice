package PART06_ExceptionHandling;

public class ExceptionHandling_Part_01 {

	public static void main(String[] args) {
	
		try {
		System.out.println("Beginning");
		
		int divide=10/0;
		System.out.println(divide);
		}catch(Exception e){        //Exception is an class e is an object.Throwable t we can use
			System.out.println("Error occured");
			System.out.println(e.getMessage());  //its prints the exception-> / by zero
			e.printStackTrace();
			
		
	
			
		}
		
		System.out.println("Ending");
		
		
		//Array Exception
		
		/*System.out.println("Beginning");
		try {
		int [] num=new int[5];
		num[5]=100;
		}catch(Exception e) {
			System.out.println("error occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("Ending");*/
	}

}
