package revision;

public class ThisDemo1 {
	private String name;
	private int age;
	
	public ThisDemo1(String name) {
		this(20);
		System.out.println("Name of Student = " +name);
	}
	public ThisDemo1(int age) {
		System.out.println("Age of the Student = " +age);
	}
	public ThisDemo1() {
		this("Bhavin");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo1 s1 = new ThisDemo1();
	}
}
