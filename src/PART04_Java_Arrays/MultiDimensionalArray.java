package PART04_Java_Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		
		//Syntax
		/*dataType[][] arrayRefVar; (or)  
		dataType [][]arrayRefVar; (or)  
		dataType arrayRefVar[][]; (or)  
		dataType []arrayRefVar[];  */
		
		//int[][]arr=new int[3][3];  3 rows 3 columns
		
		int rows=3;
		int cols=3;
		
		int table [][]= new int[rows][cols];
		
		//assign the values in the first row
		table[0][0]=10;
		table[0][1]=20;
		table[0][2]=30;
		
		table[1][0]=40;
		table[1][1]=50;
		table[1][2]=60;
		
		table[2][0]=70;
		table[2][1]=80;
		table[2][2]=10;
		
		//row length
		System.out.println(table.length);
		//col length
		System.out.println(table[0].length);
		
		System.out.println(table[0][0]);
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols; j++) {
		
		System.out.print(" "+table[i][j]);
		
		
		
			}
			System.out.println(" ");
			
	}

}
}
