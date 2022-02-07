package javaProgramPart1;

public class javaDataType {
	int myVariable;
	static int data = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		javaDataType j1 = new javaDataType();
		
		System.out.println("Value of instance variable myVariable:" +j1.myVariable);
		System.out.println("Value of static variable data: " +javaDataType.data);
		System.out.println("Value of local variable a: "+a);

	}

}
