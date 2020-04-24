package PART15_OOPS_Constructor;

public class ParameterizedConstructor {
	
	
	int id;  
    String name;  
    //creating a parameterized constructor  
    ParameterizedConstructor(int i,String n)
         {  
    id = i;  
    name = n;  
    }  
  //method to display the values  
    void display()
       {
    	System.out.println(id+" "+name);
    	}  
	public static void main(String[] args) {
		
		
		ParameterizedConstructor ps = new ParameterizedConstructor(10, "suleman");
		ps.display();
		
	}

}
