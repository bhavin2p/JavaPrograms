package revision;

public class ConstructorDemo2 extends ConstructorDemo{
	
	ConstructorDemo2() {
		//super();
		System.out.println("World");
	}
	
	private String GetValue() {
		String str = "Bhavin";
		String str2 = "kulsum";
		String str3 = str+str2;
		return str3;
		
	}
	
	public static void main(String[] args) {
		ConstructorDemo2 d1 = new ConstructorDemo2();
		System.out.println(d1.GetValue());
	}

}
