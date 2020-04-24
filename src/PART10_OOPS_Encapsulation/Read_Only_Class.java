package PART10_OOPS_Encapsulation;

public class Read_Only_Class {

	

		private String college="RVR";     //private data member 

		public String getCollege() {
			return college;
		}
          
		/*Now, you can't change the value of the college data member which is "RVR".

		s.setCollege("KITS");           //will render compile time error  */
                                                              
}
