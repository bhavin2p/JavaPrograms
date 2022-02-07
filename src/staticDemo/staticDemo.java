package staticDemo;

public class staticDemo {
	int rollno;
	String name;
	static String college = "ITS";
	
	staticDemo(int r, String n){
		rollno=r;
		name=n;
	}
	static void Display1 () {
		System.out.println("Static method displayed first");
	}
	
	public void Display() {
		System.out.println(college + " " + rollno + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticDemo s1 = new staticDemo(1, "Bhavin");
		s1.Display();
		//Display1();
	}

}
