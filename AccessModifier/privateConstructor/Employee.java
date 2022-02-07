package privateConstructor;

public class Employee {
	private Employee() {
		System.out.println("Private Constructor");
	}
	
	public static void helloCall() {
		System.out.println("just method");
		new Employee();
	}

}
