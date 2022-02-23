package mapToList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap();
		myMap.put(1, "Java");
		myMap.put(2, "JavaFX");
		myMap.put(3, "CoffeeScript");
		myMap.put(4, "TypeScript");
		
		Iterator<Integer> itr = myMap.keySet().iterator();
		
		while(itr.hasNext()) {
			int i = itr.next();
			if(!myMap.containsValue("ABC")) {
				System.out.println(myMap.get(i));
			}
		}
		
		List<Integer> keyList = new ArrayList<>(myMap.keySet());
		List<String> valueList = new ArrayList<>(myMap.values());
		
		System.out.println(keyList);
		System.out.println(valueList);

	}

}
