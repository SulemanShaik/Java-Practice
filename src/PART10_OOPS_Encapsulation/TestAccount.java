package PART10_OOPS_Encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		//Creating instances of AccountExample class
		AccountExample acc= new AccountExample();
		acc.setAcco_no(123456789);
		acc.setName("Suleman");
		acc.setEmail("test@123");
		acc.setAmount(10000f);
		
		//getting values through getter methods  
		
		
		System.out.println(acc.getAcco_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());

	}

}
