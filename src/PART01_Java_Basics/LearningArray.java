package PART01_Java_Basics;

public class LearningArray {
	public static void main(String args[]) {
		int [] values= new int[100];
		values[0]=56;
		values[56]=57;
		values[62]=58;
		values[99]=60;
		
		System.out.println(values[2]);
		System.out.println(values[99]);
		System.out.println(values[0]);
		System.out.println(values[90]);
	
	
	
	String [] words= new String[10];
	words[0]="my";
	words[1]="name";
	words[2]="is";
	System.out.println(words[1]);
	
	}
}
