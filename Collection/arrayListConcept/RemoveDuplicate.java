package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));

		System.out.println("++++++++++++++++++++++++");
		List<Integer> list = new ArrayList<>();
		for(Integer i : numbers) {
			if(!list.contains(i)) {
				list.add(i);
			}
		}
		
		System.out.println(list);
		System.out.println("++++++++++++++++++++++++");
		
		Set<Integer> unique = new HashSet<>(numbers);
		
		ArrayList<Integer> withoutDup = new ArrayList<>(unique);
		System.out.println(withoutDup);
		Iterator<Integer> itr = withoutDup.iterator();
		for(Integer i : withoutDup) {
			System.out.println(i);
		}
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
