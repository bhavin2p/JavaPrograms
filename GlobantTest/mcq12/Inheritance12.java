package mcq12;

class A1{
	public void test() {
		System.out.print("A");
	}
}
class B1 extends A1{
	public void test() {
		System.out.print("B");
	}
}

public class Inheritance12 extends A1{
	
	public void test() {
		System.out.print("C");
	}
	public static void main(String[] args) {
		A1 b1 = new A1();
		A1 b2 = new Inheritance12();
		
		b1= (A1)b2;
		A1 b3 = (Inheritance12)b2;
		b1.test();
		b3.test();
	}
}
//options
/*	AC
 * 	CC
 * 	AA
 * 	complication fails
 */

