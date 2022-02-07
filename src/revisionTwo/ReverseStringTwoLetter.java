package revisionTwo;

public class ReverseStringTwoLetter {

	public static void main(String[] args) {
		String input = "JavaProgram";
		String output = "";
		int len = input.length();
		for(int i=0; i<len; i++) {
			if(i%4 ==0 && (i+1) < len) {
				output += input.charAt(i+1);
				output += input.charAt(i);
				i++;
			}
			else {
				output += input.charAt(i);
			}
		}
		System.out.println("input : " +input);
		System.out.println("Output : " +output);

	}

}
