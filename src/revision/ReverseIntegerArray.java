package revision;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,45,5,2,1};
		
		int len = arr.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
