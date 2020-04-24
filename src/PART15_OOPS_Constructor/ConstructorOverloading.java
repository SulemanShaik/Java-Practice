package PART15_OOPS_Constructor;

public class ConstructorOverloading {
	
	     int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    ConstructorOverloading(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    //creating three arg constructor  
	    ConstructorOverloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    
	    
	    void display()
	       {
	    	System.out.println(id+" "+name+" "+age);
	    	}  
        

	public static void main(String[] args) {
		
		 ConstructorOverloading con = new  ConstructorOverloading(24, "ramu");
		 ConstructorOverloading con1 = new  ConstructorOverloading(1234, "rao", 35);
		 con.display();
		 con1.display();
		 

	}

}
