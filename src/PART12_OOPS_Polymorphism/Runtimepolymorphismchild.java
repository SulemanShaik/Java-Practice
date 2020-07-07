package PART12_OOPS_Polymorphism;

public class Runtimepolymorphismchild extends  RuntimePolymorphismParent {

	public static void main(String[] args) {
		
		RuntimePolymorphismParent obj = new  Runtimepolymorphismchild();
		 obj.run();

	}
	
	
	public void run() {
		System.out.println("BMW Started");
	}

}
