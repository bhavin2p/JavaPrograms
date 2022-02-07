package revision;

import java.util.Arrays;

public class SortArrayInt {

	public static void main(String[] args) {
		
		int i[] = {1,2,3,2,6,5,2};
		
		int len = i.length;
		
		int temp;
		for(int j=0;j<len; j++) {
			for(int k=j+1; k<len; k++) {
				if(i[j] > i[k]) {
					temp=i[j];
					i[j]=i[k];
					i[k]=temp;
				}
			}
		}
		//Arrays.sort(i);
		for(int j=1; j<=len-1; j++) {
			System.out.println(i[j]);
		}
		
		
		

	}

}
