package protected1;

public class ProtecedDemo {

	protected void Demo1() {
		System.out.println("From protected method");
	}
	
	public void Demo2() {
		System.out.println("From public method");
	}
	
	private void Demo3() {
		System.out.println("From private method");
	}
	
	void Demo4() {
		System.out.println("From default method");
	}
}
