package javaProgramPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		System.out.println(obj.testSum(x, y)); //Call by value or pass by value

		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	public int testSum(int a, int b) {
		a = 30;
		b=40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
