package javaProgramPart3;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		//371
		
		int num = 153;
		int actualNum = num;
		double result = 0;
		
		while(actualNum != 0) {
			int n = actualNum % 10;
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;
		}

		if(result == num) {
			System.out.println("Numer is armstrong no");
		}else {
			System.out.println("not an armstrong no");
		}
	}

}
