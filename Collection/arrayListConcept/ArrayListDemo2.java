package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(134);
		list.add(431);
		list.add(12);
		
		System.out.println(list);
		list.set(1, 12);
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println(list.get(2));
	}

}
