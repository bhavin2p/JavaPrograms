package starPattern;

import java.util.HashMap;
import java.util.Map;

public class StarPattern {

	public static void main(String[] args) {

		int n[] = {1,3,2,4,2,1};
		int count = 0;
		int len=n.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(n[i]==n[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		

	}

}
