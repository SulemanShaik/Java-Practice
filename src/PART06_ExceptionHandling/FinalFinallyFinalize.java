package PART06_ExceptionHandling;

public class FinalFinallyFinalize {

	
	/*public void finalize()
	{
		System.out.println("finalize called");
		} */ 
	public static void main(String[] args) {
		
		//final
		
		/*final int x=100;  
		x=200;//Compile Time Error  
		  */
        //Finally
		try{  
			int x=300;  
			}catch(Exception e){System.out.println(e);}  
			finally{
				System.out.println("finally block is executed");
				}  
		
		
		
		/*FinalFinallyFinalize f1=new FinalFinallyFinalize();  
		FinalFinallyFinalize f2=new FinalFinallyFinalize();  
		f1=null;  
		f2=null;  
		System.gc();
		*/
	}

}
