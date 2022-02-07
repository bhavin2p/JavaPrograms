package revision;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "100";
		System.out.println(x+20);
		
		//data conversion : String to Int:
		int i = Integer.parseInt(x);
		System.out.println(i + 20);
		
		//Integer, Double, Character, Boolean, 
		
		String y = "12.33";
		System.out.println(y);
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean : 
		String k = "true";
		boolean b = Boolean.parseBoolean(k);

	}

}
