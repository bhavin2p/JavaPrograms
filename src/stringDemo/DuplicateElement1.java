package stringDemo;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement1 {

	public static void main(String[] args) {
		
		String names[] = {"Amazon", "Azure", "GCP", "Amazon"};
		
		/*
		 * for(int i=0; i<names.length; i++) { for(int j=i+1;j<names.length; j++) {
		 * 
		 * if(names[i].equals(names[j])) {
		 * System.out.println("1duplicate element is :: " +names[i]); }
		 * 
		 * } }
		 */
		
		/*
		 * Set<String> data = new HashSet<>(); for(String e : names) { if(data.add(e) ==
		 * false) { System.out.println(e); } }
		 */
		int []intArray = {1,2,3,2,4,5,4,3,6};
		
		for(int i =0; i<intArray.length; i++) {
			for(int j = i+1; j<intArray.length; j++) {
				if(intArray[i] == intArray[j]) {
					System.out.println(i);
				}
			}
			
		}
		
		
		
		
	}

}
