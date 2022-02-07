package javaProgramPart2;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num = 5, fact = 1;
		
		for(int j=1; j<=num; j++) {
			fact = fact * j;
		}
		System.out.println(fact);
	}

}
