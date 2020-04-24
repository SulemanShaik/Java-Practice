package PART03_Java_Methods;


//methods arguments and method calling
public class Assignment_Calculator {
	
	public int addSum(int x , int y) {
		int z=0;
		z=x+y;
		return z;
	}
	
	public int subInter(int x , int y) {
		int z=0;
		z=x-y;
		return z;
	}
	
	public int multiplyInter(int x , int y) {
		int z=0;
		z=x*y;
		return z;
	}
	
	public int divInter(int x , int y) {     //parameters
		int z=0;
		z=x/y;
		return z;
	}
	

	public static void main(String[] args) {
            
		Assignment_Calculator asscal= new Assignment_Calculator();
		System.out.println(asscal.addSum(10, 20));               //10,20 are arguments      
		System.out.println(asscal.subInter(20, 10));
		System.out.println(asscal.multiplyInter(10, 20));
		System.out.println(asscal.divInter(10, 2));
		
              

	}

}
