package PART05_Java_Strings;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		
		//String class provided equals and equals ignore case methods
		
		String str1,str2;
		str1= "SELENIUM";
		str2= "Selenium";
		
		if(str1.equals(str2)) {
			System.out.println("Two Strings Are Same");
		}
		else {
			System.out.println("Two Strings Are not Same");
		}
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Two Strings Are Same");
			
		}
		else {
			System.out.println("Two Strings Are not Same");
		}
		
		
		
	}
	
}
