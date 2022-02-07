package interfaceDemo1;

public class InterfaceExample {
	
	public void demo() {
		System.out.println("This is the implementation of the demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj = new InterfaceExample();
		obj.demo();
		MyInterface.display();
		

	}

}
