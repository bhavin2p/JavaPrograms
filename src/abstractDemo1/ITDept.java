package abstractDemo1;

public abstract class ITDept implements Emp{
	
	
	public ITDept() {
		System.out.println("Hello from Abstract Constructor");
	}
	
	public abstract void demo();
	
	public void demo1() {
		System.out.println("Non abstract method in Abstract class");
	}

	@Override
	public abstract void sal();

	@Override
	public void goodies() {
		// TODO Auto-generated method stub
		System.out.println("Laptop");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Automation");
	}

}
