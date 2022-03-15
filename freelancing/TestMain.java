
public class TestMain {

	public static void main(String[] args) {
		Test v1 = new Test();
		v1.field = 5;
		
		Test v2 = v1;
		Test v3 = new Test();
		v3.field = v2.field;
		v1.field = 10;
		System.out.println(v1.field);
		System.out.println(v2.field);
		System.out.println(v3.field);

	}

}
