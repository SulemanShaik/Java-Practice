package PART08_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		/*Java HashMap class:
		Java HashMap class hierarchy
		
		Java HashMap class implements the map interface by using a hash table.
		It inherits AbstractMap class and implements Map interface.
		
		Java HashMap class contains values based on the key.
		
 Java HashMap class contains only unique keys.
 Java HashMap class may have one null key and multiple null values.
 Java HashMap class is non synchronized.
 Java HashMap class maintains no order.
 The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
 Hierarchy of HashMap class
As shown in the above figure, HashMap class extends AbstractMap class and implements Map interface.

                            HashMap class declaration

public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable 
 
                      HashMap class Parameters


K: It is the type of keys maintained by this map.
V: It is the type of mapped values.
		
*/
		
		
		
		HashMap <String,String>map= new HashMap<String,String>();
		
		map.put("First Name", "Suleman");
		map.put("Last Name", "shaik");
		map.put("Role", "QA Automation");
		map.put("Address", "India");
		
		System.out.println(map); //it prints data not (sorted) in order and duplication not allowed
		System.out.println("Map Size --> "+map.size());
		
		System.out.println(map.get("Role"));
		System.out.println(map.get("First Name"));  //printing particular value
		
		Set<String>keys=map.keySet();    //To print all data
		
		for(String var:keys) {
			//System.out.println(var+map.get(var));
			System.out.println("KEYS--->   "+var+"  VAULES--->"+map.get(var));
		}
		  
		
		//complex  to collect get email from different users
		
		HashMap <String,List<String>>map1 = new HashMap<String,List<String>>();
		
		ArrayList<String> listofemails= new ArrayList<String>();
		
		listofemails.add("test@gmail.com");
		listofemails.add("test1@gmail.com");
		listofemails.add("test2@gmail.com");
		listofemails.add("test3@gmail.com");
		
		 map1.put("email", listofemails);
		
		
		
		
		
		
		
		
	}

}
