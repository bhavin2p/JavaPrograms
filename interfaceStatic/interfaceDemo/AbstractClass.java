package interfaceDemo;

public abstract class AbstractClass implements InterfaceA {
	
	public AbstractClass() {
		System.out.println("Constructor in Abstract method");
	}
	
	
	public static void staticMethod() {
		System.out.println("Static method in abstract class");
	}
	public abstract void AbstractMethodb();

}
