package exceptionHandling;

import java.util.Scanner;
public class ExceptionDemo{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 = sc.nextInt();
		
		try {
			int result = num1 / num2;
			System.out.println("result is :" + result);
		}
		
		catch(ArithmeticException ar) {
			System.out.println("dont enter denominator as Zero");
		}
		
		System.out.println("remaining 1900 lines of code");
	}
}
