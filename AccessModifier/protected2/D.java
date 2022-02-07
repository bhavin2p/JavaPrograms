package protected2;

import protected1.A;

public class D extends A{
	
	void test() {
		//A a1 = new D();
		//a1.fn();
		//super.fn();
		D d1 = new D();
		d1.fn();
	}
	public static void main(String[] args) {
		D d1 = new D();
		d1.test();
	}

}
