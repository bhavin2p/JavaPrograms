package javaProgramPart1;

public class SortArray {

	public static void main(String[] args) throws Exception{		
		int arr[] = {10,0,25,0,0,10,0};
		
		int len = arr.length;
		try {
		for(int i=0; i<len-1;i++) {
			for(int j=i+1; j<len-1; j++) {
				if(arr[i]==0) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int i=0; i<len-1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
