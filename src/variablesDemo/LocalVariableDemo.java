package variablesDemo;

public class LocalVariableDemo {
	
	int result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println(x);
		
		LocalVariableDemo l1 = new LocalVariableDemo();
		l1.show();

	}
	
	public void marks() {
		int marks = 90;
	}
	
	public void show() {
		System.out.println("Marks are = " +result);
	}

}
