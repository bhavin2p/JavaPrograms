package interfaceDemo;

import javax.management.remote.SubjectDelegationPermission;

public class TestClassInterface extends AbstractDemo implements TestInterface{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClassInterface t1 = new TestClassInterface();
		t1.test2();
		TestInterface.TestMethod(); 
		TestClassInterface t2 = new TestClassInterface();
		TestInterface.main("Hello");
		//t2.TestMethod(); // Error call must be using interfacename in interface defined static method
		testDemoAbstract();
		
		

	}
	


	@Override
	public void test2() {
		
		System.out.println("Interface abstract method");
		
	}

}
