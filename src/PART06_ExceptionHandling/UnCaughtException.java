package PART06_ExceptionHandling;

public class UnCaughtException {

	public static void main(String[] args) throws Exception {
	
		 
		throw new Exception("Error Exception");

		//Differences Between throw and throws
		
		/*1) Java throw keyword is used to explicitly throw an exception.
             Java throws keyword is used to declare an exception.
		2)	Checked exception cannot be propagated using throw only.
			Checked exception can be propagated with throws.
		3)	Throw is followed by an instance.
			Throws is followed by class.
		4)	Throw is used within the method.
			Throws is used with the method signature.
		5)	You cannot throw multiple exceptions.
			You can declare multiple exceptions e.g.
		public void method()throws IOException,SQLException.
		*/
	}

}
