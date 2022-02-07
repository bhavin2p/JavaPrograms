package lambdademo;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.add(4);
		numbers.add(7);
		
		numbers.forEach((n)->{System.out.println(n);});
		

	}

}
