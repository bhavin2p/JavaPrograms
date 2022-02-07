package lambdademo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LambdaExp {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Tom", "Peter", "Naveen", "Simon");
		
		//with Anonymous class
		names.forEach(new Consumer<String>(){
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//lambda express
		names.forEach(str -> System.out.println(str));
		
		//method reference
		names.forEach(System.out :: println);
		System.out.println();
		
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(12);
		arrList.add(43);
		arrList.add(65);
		arrList.add(87);
		
		arrList.add(450);
		
		arrList.forEach(System.out :: println);

	}

}
