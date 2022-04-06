package mcq12;
class Super{
	private int a;
	//int a;
	protected Super(int a) {
		this.a = a;
		System.out.println(a);
	}
}
public class RemoveError7 extends Super{
	public RemoveError7(int a) {
		super(a);
	}
	public RemoveError7() {
		//this.a=5; // which line will remove error here
		this(5);
		//super(a);
	}
	public static void main(String[] args) {
		new RemoveError7();
	}
}

/*
 * Change line no. 2 to public int a
 * Change line no 13 to this(5); = correct
 * Change line no. 2 to int a
 * Change line no. 13 to super(a) 
 * */
