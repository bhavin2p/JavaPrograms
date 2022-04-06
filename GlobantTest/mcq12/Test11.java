package mcq12;

interface Testable111 {
	String toString();
}

public class Test11 {

	public static void main(String[] args) {
		System.out.println(new Testable111() {
			public String toString() {
				return "Globant";
			}
		});

	}

}
/*
 * Globant = correct
 * null
 * Runtime exception
 * Compilation fails
 */
