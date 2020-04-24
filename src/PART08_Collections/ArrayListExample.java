package PART08_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		/*Java ArrayList class uses a dynamic array for storing the elements. 
		It inherits AbstractList class and implements List interface
		Java Non-generic Vs. Generic Collection
		
		Java new generic collection allows you to have only one type of object in a
		 collection. Now it is type safe so typecasting is not required at runtime.

 Let's see the old non-generic example of creating java collection.

                    ArrayList al=new ArrayList();//creating old non-generic arraylist 
                    
                     
 Let's see the new generic example of creating java collection.

ArrayList<String> al=new ArrayList<String>();//creating new generic arraylist  
		
		
		*/
		
		
		
		
		ArrayList list = new ArrayList<>();
		// ArrayList<String> al=new ArrayList<String>();  
		
		//Size
		
		System.out.println(list.size());
		
		
		list.add(10);
		list.add("Suleman");
		list.add(10.25);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("Suleman");
		System.out.println(list); //ArrayList Allows Null Values and Duplicate values
		System.out.println("List Size:: "+list.size());
		
		//How To fetch the values from a list
		
		System.out.println(list.get(0));    //in this case get() printing an object not an value
		System.out.println(list.get(4));
		
		//remove
		
		System.out.println(list.remove(5));
		System.out.println("List Size After Remove:: "+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		
		
		//FOR Each Loop
		
		/*for(Object var:list) {
			System.out.println(var);
		}*/
		
		//iterator
		
		/*Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		
		

	}
	}
}
