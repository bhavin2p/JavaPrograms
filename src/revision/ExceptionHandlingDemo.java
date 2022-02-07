package revision;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Number divide by zero issue");
		}
		System.out.println("End ");
		
		/*
		 * File file = new File("text.txt"); Scanner sc1 = new Scanner(file);
		 */
		
		int a1[] = new int[5];
		a1[10]=2;
		System.out.println(a1);

	}

}
