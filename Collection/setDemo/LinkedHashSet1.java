package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		java.util.LinkedHashSet<String> values = new LinkedHashSet<>();
		values.add("Selenium");
		values.add("1");
		values.add("12.32");
		System.out.println(values);
		for(String e:values) {
			System.out.println(e);
		}

	}

}
