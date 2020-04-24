package PART06_ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		
		/*final int x=100;
		x=200;*/
		
		//
		
		
		try {
			int [] num=new int[5];
			num[5]=100;
			  //DB Connection
			  //Execute some queries
			  //validating data and comparing from websites
			  //Closing Connection


		}catch(Throwable t) {
			System.out.println("Error Occured");
			
		}finally{
			System.out.println("Closing the data base connection");
		}
		
		

	}

}
