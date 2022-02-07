package abstractionConcept;

public abstract class Bank {
	
	//partial abstraction
	//hiding the implemention logic
	//Cannot create object of abstract class
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("bank -- credit");
	}
	
	public void debit() {
		System.out.println("Bank -- debit");
	}
	
	
	
	

}
