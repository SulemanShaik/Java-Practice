package PART05_Java_Strings;

public class StringContains {

	public static void main(String[] args) {

		String str1="selenium";
		String str2="selenium web driver";
		
		if(str2.contains(str1)) {
			System.out.println("Test Pass");
		}
		
		else {
			System.out.println("Test Fail");
		}
		
		if (str2.toLowerCase().contains(str1.toLowerCase()))
				{
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
	}

}
