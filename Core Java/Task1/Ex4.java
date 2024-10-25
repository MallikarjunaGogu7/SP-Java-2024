package Task1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string 1");
		String name1 = sc.next();
		System.out.println("enter the string 2");
		String name2 = sc.next();
		String result = name1 + name2;
		System.out.println("concatenation of two names is: "+result);
	}
}
