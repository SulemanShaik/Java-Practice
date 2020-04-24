package PART03_Java_Methods;

public class Methods_Part5 {
	
	//Static Method --------Non Static Method
	
	
	public static void main(String[] args) {
		
		/*Methods_Part5.go();
		Methods_Part5.go1();*/             //Static Method
		
		
		Methods_Part5 nonstameth= new Methods_Part5();
		
		nonstameth.go();
		nonstameth.go1();
		nonstameth.go2();
		
	}
		public void go() {
			System.out.println("Inside go Method");   // non static method method we need create an object
		}
		
		public void go1() {
			System.out.println("Inside go1 Method");
		}
		
		public void go2() {
			System.out.println("Inside go2 Method");
		}
		
		
	        /* public static void go() {
		        System.out.println("Inside go Method");
	
	         }
	         
	         
	         public static void go1() {
			        System.out.println("Inside go1 Method");
		
		         }
	         
	         public void go2() {
			        System.out.println("Inside go2 Method");
		        go1();            //non static method can allow static method
		         }*/
	         
	         
}
