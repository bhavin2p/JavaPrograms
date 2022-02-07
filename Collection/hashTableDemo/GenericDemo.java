package hashTableDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Hello");
		
		list.add(123);
		list.add(12.3);
		list.add(true);
		list.add("World");
		
		System.out.println(list);

	}

}
