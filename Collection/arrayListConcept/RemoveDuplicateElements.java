package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
		
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<>(linkedHashSet);
		
		System.out.println(numbersListWithoutDuplicates);
		
		//2, JDK 8 - stream :
		
		ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
	}

}
