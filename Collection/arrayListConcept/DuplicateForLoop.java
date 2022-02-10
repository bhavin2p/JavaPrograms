package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateForLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		
		for(int i=0; i<numbers.size(); i++) {
			for(int j=i+1; j<numbers.size(); j++) {
				if(numbers.get(i)==numbers.get(j)) {
					numbers.remove(j);
				}
			}
		}
		System.out.println(numbers);

	}

}
