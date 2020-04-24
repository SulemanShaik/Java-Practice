package PART10_OOPS_Encapsulation;

public class AccountExample {
	
	//private data members
	
	private long acco_no;
	private String name,email;
	private float amount;
	
	
	//public getter and setter methods   
	
	public long getAcco_no() {
		return acco_no;
	}
	public void setAcco_no(long acco_no) {
		this.acco_no = acco_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}  
	
	
	
	
	

}
