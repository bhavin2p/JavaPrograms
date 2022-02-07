package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<>();
		
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Steve");
		studentList.add("Bhavin");
		
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		for(String student : studentList) {
			System.out.println(student);
		}
		
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
