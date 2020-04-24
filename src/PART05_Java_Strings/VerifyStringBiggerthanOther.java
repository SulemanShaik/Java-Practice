package PART05_Java_Strings;

public class VerifyStringBiggerthanOther {

	public static void main(String[] args) {
		String str1,str2;
	/*String class provided compareTo() which returns the differential ASCII Code 
		  value of two given strings ,
		 if the string compare with another string is
		 bigger we get positive integer code.
		 The string we are comparing with another String is  smaller we get negative code.
		if two strings are same we get 0(zero) */
      str1="a";
      str2="a";
      System.out.println(str2.compareTo(str1));  //0    
      
      
      str1="a";
      str2="b";
      System.out.println(str2.compareTo(str1));  // 1
      str1="b";
      str2="a";
      System.out.println(str2.compareTo(str1));  //-1
	}

}
