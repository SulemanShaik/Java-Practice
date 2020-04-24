package PART14_OOPS_Interfaces;

public class Child1 implements Parent1,Parent2 {
	
	 //Multiple Inheritance
	@Override
	public void show() {
            System.out.println("Child Show()");		
	}
	public static void main(String[] args) {
		
		 Child1 ch= new Child1();
		  ch.show();
		
		/*Parent1 p= new Child1();
		p.show();*/

	}

}
