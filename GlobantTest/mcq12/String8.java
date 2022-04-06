package mcq12;

public class String8 {

	public static void main(String[] args) {
		String cities[] = {"London", "Tokyo", "NY"};
		String states[] = new String[3];
		int i=0;
		try {
			for(String n: cities) {
				states[i] = n.substring(2,6);
				i++;
			}
		}catch (Exception e) {
			System.out.print("invalid");
		}
		for(String s: states) {
			System.out.print(s);
		}
	}
}
/*
 * ndonkyonull
 * invalidndonnullnull = correct
 * invalidndonkyonnull
 * invalidnullnullnull
 * */
