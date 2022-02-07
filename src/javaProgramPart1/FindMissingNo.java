package javaProgramPart1;

public class FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,3,4,5};
		int i = findMissingNumber(num, 5);
		System.out.println(i);
	}
	
	public static int findMissingNumber(int num[], int totalCount) {
		int expNum = totalCount * ((totalCount+1)/2);
		int actualSum = 0;
		
		for(int i : num) {
			actualSum += i;
		}
		
		return expNum-actualSum;
	}

}
