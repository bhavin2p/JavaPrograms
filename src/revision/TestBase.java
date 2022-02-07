package revision;

public class TestBase {

	public static void main(String[] args) {
		System.out.println("main method");
		
		recursion();
		

	}
	
	public static void recursion() {
		System.out.println("I am from recursion method");
		recursion();
	}

}
