package samplePrograms;

public class MainOverload {

	/*
	//Overriding main method - No
	You cannot override static methods and 
	since the public static void main() method is static we cannot override it.
	
	*/
	//Overloading main method - yes
	public static void main(String[] args) {

		System.out.println("original main method");
		main();
		main(10);
		
		
	}
	
	public static void main() {
		System.out.println("Hello Main without parameter");
	}
	
	public static void main(int a) {
		System.out.println("Value of int is " +a);
	}

}
