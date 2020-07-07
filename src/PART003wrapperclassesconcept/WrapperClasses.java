package PART003wrapperclassesconcept;

public class WrapperClasses {

	public static void main(String[] args) {
      
		
		
		String x="100";
		System.out.println(x+20); //10020 but we need to print 120
		
		//data conversion String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to double conversion
		String y = "12.33";
		double d =Double.parseDouble(y);
		System.out.println(d);
		
		//string to boolean conversion
		
		String z="true";
		boolean b=Boolean.parseBoolean(z);
		System.out.println(b);
		
		//int to string conversion
		
		int j=210;
		System.out.println(j+20); //230 but we need convert into string  like "230"
		
		String st=String.valueOf(j);
		System.out.println(st+20);//23020
		
		
		
	}

}
