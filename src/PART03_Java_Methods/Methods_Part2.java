package PART03_Java_Methods;

public class Methods_Part2 {
	
	//Calling a Method
	
	
	public  int addSum(int x,int y) {
		int z=0;
		z=x+y;
		return z;
				
	}
	
	void show() {
		
	}
	
	

	public static void main(String[] args) {
		
          
           
           Methods_Part2 sum= new Methods_Part2(); //Create an object of that class to calling Method
         
           int sumofaddition=sum.addSum(1, 2);
           System.out.println("Sum of two values::"+sumofaddition);
           sum.show();
           //Methods_Part2.addSum(1, 2);             //  for Static method
           //System.out.println( Methods_Part2.addSum(1, 2));
      
           
	
		 /*Methods_Part3 sub= new  Methods_Part3 ();  //Instance /global variable     
		 System.out.println(sub.i);*/
		
	}
}
