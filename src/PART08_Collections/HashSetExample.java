package PART08_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
         /*  Java HashSet class is used to create a collection that uses a 
		hash table for storage. It inherits the AbstractSet class and implements Set interface
		
		-Difference between List and Set
		A list can contain duplicate elements whereas Set contains unique elements only
		
		-Hierarchy of HashSet class
		The HashSet class extends AbstractSet class which implements Set interface.
		The Set interface inherits Collection and Iterable interfaces in hierarchical order.
		*/
		//Declaration-
	//public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable 
		
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");        //it prints not (sorted) in order
        set.add("Five");  
        set.add("Two");       //it cannot print duplicate value
        System.out.println(set);
        
        
        
        //For Loop 
        
        /*for(int i=0;i<set.size();i++) {
        	System.out.println(set.); // we cant use for loop in this suitation there in no index value.
        }*/
        
		/*for(String var:set) {
			System.out.println(var);
		}
		*/
        //iterator
        
        Iterator <String> itr=set.iterator();
        /*while(itr.hasNext()) {
        	System.out.println(itr.next());*/ //Prints all data
        	
        	while(itr.hasNext()) {
        		String var=itr.next();
        		if(var.equals("Two")) {
        			System.out.println(var); //      printing particular data
        		}
        	
        }
        
        
        
		
		
	}

}
