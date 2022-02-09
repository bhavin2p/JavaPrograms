package protected2;

import protected1.ProtecedDemo;

public class AccessPRotected extends ProtecedDemo {
	
	protected void protecMethod() {
		ProtecedDemo p1 = new ProtecedDemo();
		System.out.println();
	}
	
	public static void main(String[] args) {
		ProtecedDemo p1 = new ProtecedDemo();
		p1.Demo2();
		
		AccessPRotected a1 = new AccessPRotected();
		a1.Demo1();
	}
}
