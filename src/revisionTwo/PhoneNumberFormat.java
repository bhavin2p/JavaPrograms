package revisionTwo;

public class PhoneNumberFormat {

	//input = 1234567890
			 //01234567890123
	//output = (123)45-67-890
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("(");
			}
			if (i == 3)
				System.out.print(")");

			if (i == 5 || i == 7)
				System.out.print("-");

			System.out.print(a[i]);

		}

	}

}
