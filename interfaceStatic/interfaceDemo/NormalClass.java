package interfaceDemo;

public class NormalClass extends AbstractClass {
	
	NormalClass(){
		System.out.println("Main method constructor");
	}

	public static void main(String[] args) {
		
		staticMethod();
		InterfaceA n1 = new NormalClass();
		AbstractClass.staticMethod();
		InterfaceA.staticBlock();

	}

	@Override
	public void abstractMethod() {
		System.out.println("unimplmented abstract method");
		
	}

	@Override
	public void AbstractMethodb() {
		System.out.println("unimplmeneted abstract method");
		
	}

}
