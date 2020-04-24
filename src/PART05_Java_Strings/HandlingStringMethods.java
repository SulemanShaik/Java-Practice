package PART05_Java_Strings;

public class HandlingStringMethods {

	public static void main(String[] args) {
		String str="Suleman";
		System.out.println(str.length()); //It Gives length of the given String
		
		 System.out.println(str.substring(4)); //it print man divides the data in parts
	     System.out.println(str.substring(0, 4));//index start form 0
	     
	     String a="hello";
	     String b="there";
	     System.out.println(a.charAt(2));      //charAt()
	     
	     
	     String str1="hello there suleman there";
	     
	     System.out.println(str1.indexOf("there"));     //indexOf()
	     System.out.println(str1.indexOf("there",7));   //indexOf(char,index)
	     
	     String str2="hello there shaik there";
	     System.out.println(str2.lastIndexOf("there"));  //lastIndexOf()
	     
	     
	     
	     
	     
	     
	     
	     
	     
	      
	      
		

	}

}
