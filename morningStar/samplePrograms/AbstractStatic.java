package samplePrograms;

public abstract class AbstractStatic {

	/*
	 * Declaring abstract method static If you declare a method in a class abstract
	 * to use it, you must override this method in the subclass. But, overriding is
	 * not possible with static methods. 
	 * 
	 * Therefore, an abstract method cannot be
	 * static.
	 */
	
	//public static abstract void method2(); // error we cannot override static method so we cannot define abstract as static
	public static void Method1() {		
	}

}
