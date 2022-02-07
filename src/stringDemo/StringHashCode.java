package stringDemo;

public class StringHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "whatsup";
		String s3 = new String("hello");
		System.out.println(s1 == s3);
		System.out.println("String with New Hashcode : " +System.identityHashCode(s3));
		System.out.println("String literal Hashcode : " + System.identityHashCode(s1));
		System.out.println("hell".hashCode());
		System.out.println(s2.hashCode());

	}

}
