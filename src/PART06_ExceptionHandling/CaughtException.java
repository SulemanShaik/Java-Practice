package PART06_ExceptionHandling;

public class CaughtException {

	/*public static void main(String[] args) throws InterruptedException {
		int [] num=new int[5];
		num[5]=100;
		Thread.sleep(1000);
		
		

	}*/
	
	public static void main(String[] args) {
		
		
		int [] num=new int[5];
		num[5]=100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();          //N number of times we need add try catch block in this situation.
		}
	}

}
