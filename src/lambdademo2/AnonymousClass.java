package lambdademo2;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Age obj1 = new Age() {
			
			public void getAge() {
				System.out.println("age is " +x);
			}
		};
		obj1.getAge();
		
		Age2 obj2 = new Age2() {

			@Override
			public void getString() {

				System.out.println("UserName : " +name);
				
			}
			
			
		};
		obj2.getAge2();
		obj2.getString();
		
		
		Age3 obj3 = new Age3() {
			
			
		};
		obj3.test1();
		//obj3.test2();

	}

}
