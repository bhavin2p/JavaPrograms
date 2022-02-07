package javaProgramPart1;

public class ArmStrongNumber {

	public static void isArmStrongNumber(int num) {
		int cube=0;
		int r;
		int t;
		
		t=num;
		while(num!=0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("Number is ArmStrong Number");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrongNumber(153);

	}

}
