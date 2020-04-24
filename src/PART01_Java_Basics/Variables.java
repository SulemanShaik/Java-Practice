package PART01_Java_Basics;

public class Variables {
	
	
	public static void main(String[] args) {
	
 /*Variable is name of reserved area allocated in memory. 
  In other words, it is a name of memory location. 
  It is a combination of "vary + able" that means its value can be changed.
  int data=50;//Here data is variable  */
		
		
		/*
		 class A{
		 int data=50;//instance variable  
		static int m=100;//static variable  
		void method(){  
		int n=90;//local variable  
		}
*/		
		//Syntax:Datatype Variable name   int z;
		/*int x ;
		x=50;*/
		int x=50;
		System.out.println(x);
		
		x=60;
		System.out.println(x);//code will be run line by line
		System.out.println(x+40);
		
		
		/*String words;
		words="this is sentence";*/
		
		String words="this is sentence";
		System.out.println(words+"this is also sentence"); //String data appended

		long l=10000;
		int i= (int)l;             
		System.out.println(i);
		
		float f= 3.14f;
		int in=(int)f;
		System.out.println(in);       //Truncate
		
		
		
		
		
		
		
	}

}
