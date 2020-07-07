package PART12_OOPS_Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);

	}
	
	
	
	public void add(int x, int y) {
		
		System.out.println("Two interger addtion is");
		int p =x+y;
		System.out.println(p);
		
	}
	
	
    public void add(int x, int y, int z) {
		
		System.out.println("Three interger addtion is");
		int q=x+y+z;
		System.out.println(q);
		
		
		
	}

}
