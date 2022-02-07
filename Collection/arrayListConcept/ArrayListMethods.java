package arrayListConcept;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Testing");
		ar2.add("dev ops");
		
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);

		System.out.println(ar1.contains("python"));
	}

}
