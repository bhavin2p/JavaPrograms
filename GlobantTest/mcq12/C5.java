package mcq12;

class A{
	A() {
		System.out.print("A");
	}
}

class B extends A{
	B(String str){
		System.out.print(str);
	}
}

public class C5 extends B{

	C5(){
		super(" C");
		new B(" C");
	}
	public static void main(String[] args) {
		new C5();

	}

}
/*
Compilation fails
A C
A C A C = correct
C C
*/