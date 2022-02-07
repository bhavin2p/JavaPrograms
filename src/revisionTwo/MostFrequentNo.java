package revisionTwo;

import java.util.Arrays;

public class MostFrequentNo {

	public static void main(String[] args) {
		int arr[] = {1,2,2,5,2,1,3,2,1};

		int n = arr.length;
		System.out.println(mostFrequent(arr, n));
	}

	private static int mostFrequent(int[] arr, int n) {
		Arrays.sort(arr);	
		int max_count = 1, res = arr[0];
		int curr_count = 1;
		for(int i=1; i<n; i++) {
			if(curr_count>max_count) {
				curr_count++;
			}
			else
			{
				if(curr_count>max_count) {
					max_count = curr_count;
					res = arr[i-1];
				}
				curr_count = 1;
			}
		}		
		//last element is most frequent
		if(curr_count>max_count) {
			max_count=curr_count;
			res=arr[n-1];
		}
		return res;
	}

}
