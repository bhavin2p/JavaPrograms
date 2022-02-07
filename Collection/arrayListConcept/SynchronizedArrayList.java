package arrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1.collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add, remove - we dont need explicit synchronization
		
		//to fetch/traverse the values from this list -- we have to use explicit synchronization

		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
			
		}
		
		//2. copyOnWriteArrayList -- its a class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		
		//we dont need explicit synchronization for any operation: add/remove/traverse
		
		Iterator<String> itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		
	}

}
