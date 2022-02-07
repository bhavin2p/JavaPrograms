package javaProgramPart1;

public class PrimeNumber {
	//2 is the lowest prime number
	//3 
	public static boolean isPrimeNumber(int num) throws Exception {
		try {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
		//13 17
		try {
		System.out.println(isPrimeNumber(13));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
