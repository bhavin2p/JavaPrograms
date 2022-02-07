package lambdademo;

public class lambdaexample4 {

	public static void main(String[] args) {
		
		Addable ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
	
		Addable addable = (a, b)->{return (a+b);
		};
		System.out.println(addable.add(100, 200));

	}
}
