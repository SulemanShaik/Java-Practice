package PART12_OOPS_Polymorphism;

public class OverloadingExample {

	public static void main(String[] args) {
		
		OverloadingExample obj= new OverloadingExample();
		obj.add(1, 2);
		obj.add(1, 2, 3);  
		/*byte b1=10;
		byte b2=20;                //if you having same variables and different data types
		obj.add(10, 20);*/      //we need specify which data type is need to store like int,byte,double
		
		obj.fblogin("suleman", "shaik123");
		obj.fblogin(984812, "suleman");
		
		/*we can use add method by using two parameters or three parameters
		this is called overloading*/

	}
	
	public void add(int a,int b) {
		
	}
	
       public void add(byte a,byte b) {
		
	}
	
     public void add(int a,int b,int c) {
		
	}
     public void add(int a,double var) {
 		
 	}
     
     
     public void add(double var,int a) {
  		
  	}
      
     
     public void fblogin(int phoneno,String password) { 
    	      }
     
     public void fblogin( String username,String password) {
    	 
     }
     
     
     
     
     
     
     
}
