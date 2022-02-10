package hashTableDemo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new Hashtable<>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		hm.put(103, "Rahul");
		
		Iterator<Integer> itr2 = hm.keySet().iterator();
		while(itr2.hasNext()) {
			int key = itr2.next();
			System.out.println(key + " " +hm.get(key));
		}
		
		
		Set<Integer> setKey= hm.keySet();
		
		Iterator<Integer> itr = setKey.iterator();
		
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " " +hm.get(key));
		}
		
		

	}

}
