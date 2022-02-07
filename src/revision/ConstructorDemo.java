package revision;

public class ConstructorDemo {
	
	ConstructorDemo() {
		System.out.println("Hello");
		System.out.println(GetValue());
		
	}
	
	private static int GetValue() {
		int a=12, b=32, n;
		n=a+b;
		return n;
	}

}
