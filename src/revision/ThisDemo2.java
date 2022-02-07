package revision;

public class ThisDemo2 {
	
	private String name;
	private int age;
	
	public ThisDemo2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("Name = " +this.name);
		System.out.println("Age = " +this.age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo2 s1 = new ThisDemo2("Bhavin", 20);
		s1.show();
	}

}
