package javaProgramPart1;

public class SortInteger {

	public static void main(String[] args) {


		int arr[] = {40, 40, 12, 11, 10, 4, 32, 6, 8};
		
		int len = arr.length;
		
		int temp;
		for(int i = 0; i<=len-1; i++) {
			for(int j=i+1; j<=len-1; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
