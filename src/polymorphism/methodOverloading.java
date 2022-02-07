package polymorphism;

public class methodOverloading {
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	public int add(double x, int y) {
		return (int)x+y;
	}
	public static void main(String[] args) {
		methodOverloading m1 = new methodOverloading();
		System.out.println(m1.add(10.1, 12));
		System.out.println(m1.add(10, 20));
		System.out.println(m1.add(12, 13, 14));
	}
}
