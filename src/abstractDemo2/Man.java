package abstractDemo2;

public class Man extends Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human m1 = new Man();
		m1.walk();
		m1.speak();

	}

	@Override
	void walk() {
		System.out.println("Abstract method 1");
		
	}

	@Override
	void speak() {
		System.out.println("Abstract method 2");
	}

	@Override
	public void Girl() {
		// TODO Auto-generated method stub
		
	}


}
