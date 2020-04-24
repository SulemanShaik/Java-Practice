package PART04_Java_Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//Syntax
		/*dataType[] arr; (or)  
		dataType []arr; (or)  
		dataType arr[]; */ 
		
		//arrayRefVar=new datatype[size]; Instantiation of an Array in Java
		
		int[]arr = new int[5];
		arr[0]=10;    //initialization
		arr[1]=20; 
		arr[2]=30;
		arr[3]=40;
		arr[4]=50; 
		
		//System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
       /*for(int num:arr) {
    	   System.out.println(num);      //For each Loop
       }
       */
       
       String [] month= {"jan","feb","mar","apr"};    //declaration, instantiation and initialization  
          //System.out.println(month[0]);
       
       for (int i=0;i<month.length;i++) {
    	   
    	   System.out.println(month[i]);
       }
       
       /*for(String mon:month) {
    	   System.out.println(mon);
       }*/
       
       
}
}
