package revision;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int c = 4;
		Integer b = new Integer(a);
		Integer d= a;
		boolean eq = d ==b;
		Integer e =d;
		e++;
		Integer f = b;
		b=8;
		System.out.println(
				"a=" + a + "," + "b=" +b+ "c=" +c+ "d= " +d+ "e = " +e+ "f=" +f+ "eq="  +eq);

	}

}
