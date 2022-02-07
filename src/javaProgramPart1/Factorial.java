package javaProgramPart1;

public class Factorial {
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

	}

}
