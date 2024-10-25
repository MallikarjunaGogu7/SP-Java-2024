package ScannerEx;

import java.util.Scanner;
public class FloatToInt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a float value..");
		float f = sc.nextFloat();
		
		int i = (int) (f);
		System.out.println(i);
	}
}
