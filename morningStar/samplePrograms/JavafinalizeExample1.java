package samplePrograms;

public class JavafinalizeExample1 {

	public static void main(String[] args) {
		
		JavafinalizeExample1 obj = new JavafinalizeExample1();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
		System.out.println("end of Garbage collection");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize");
	}

}
