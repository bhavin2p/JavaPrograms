import staticDemo.staticDemo;

public class StaticNonStatic {
	
	//int a;
	
	static int a;
	
	/*int f() {
		return a;
	}*/
	
	static int f() {
		return a;
	}

	public static void main(String[] args) {
		StaticNonStatic static1 = new StaticNonStatic();
		
		System.out.println(static1.f());

	}

}
