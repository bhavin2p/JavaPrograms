package lambdademo;

public class lambdaexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable = (name) -> {
			return "I have to nothing to say " +name;

		};
		System.out.println(sayable.say("Kulsum"));

	}
}
