package eceptionHandling;

public class TryBlockwithoutCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello from try block");
		}
		finally {
			System.out.println("I will execute always from finally even without catch block");
		}

	}

}
