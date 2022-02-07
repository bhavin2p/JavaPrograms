package hashTableDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Mango");
		hm.put(2, "Apple");
		hm.put(3, "Banan");
		hm.put(4, "Grapes");
		
		System.out.println("Iterating Hashmap");
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " = " +m.getValue());
		}

	}

}
