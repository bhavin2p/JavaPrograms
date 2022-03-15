
public class MainSwitch {

	private void call(int i) {
		switch(i) {
		case 1:
			
		case 2:
			System.out.println("even");
			break;
		default:
			System.out.println("outside");
		case 3 :
			System.out.println("rains");
		}
	}
	public static void main(String[] args) {
		MainSwitch m1 = new MainSwitch();
		m1.call(1);
		m1.call(3);
		m1.call(10);
		m1.call(2);

	}

}
