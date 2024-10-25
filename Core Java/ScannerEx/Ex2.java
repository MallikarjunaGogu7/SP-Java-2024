package ScannerEx;

import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first person name..");
		String person1 = sc.next();
		System.out.println("Enter second person name..");
		String person2 = sc.next();
		
		System.out.println(person1+" and "+person2);
	}
}
