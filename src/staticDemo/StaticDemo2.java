package staticDemo;

public class StaticDemo2 {
	int num = 10;
	static int Value = 50;
	
	public static void main(String[] args) {
		DisplayStatic();
		//StaticDemo2.DisplayStatic();
		
		
		StaticDemo2 d1 = new StaticDemo2();
		//d1.DisplayStatic();
		d1.DisplaynonStatic();
		
		
	}
	
	
	public static void DisplayStatic() {
		System.out.println("Static Block");
		StaticDemo2 d2 = new StaticDemo2();
		d2.DisplaynonStatic();
	}
	
	public void DisplaynonStatic() {
		System.out.println("Non-Static Block");
		//DisplayStatic();
	}

}
