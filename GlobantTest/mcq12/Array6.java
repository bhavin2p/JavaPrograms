package mcq12;

public class Array6 {

	public static void main(String[] args) {
		int nums1[] = {1,2,3};
		int nums2[] = {1,2,3,4,5};
		nums1 = nums2;
		for(int num: nums1) {
			System.out.print(num);
		}

	}

}
/*
12312345
12345 = correct
123
ArrayIndexOutOfBoundException
*/