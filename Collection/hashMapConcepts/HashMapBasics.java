package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no order - no indexting
		//stores values -- key-value <k,v>
		//key can not be duplicate
		//can store n number of null values but only one null key
		//hashmap is not thread safe - unsynchronized
		
		HashMap<String, String> capitalMap = new HashMap<>();
		
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get(null));
		
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(capitalMap.get(key));
		}

	}

}
