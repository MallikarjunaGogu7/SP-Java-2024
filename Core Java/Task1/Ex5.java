package Task1;

import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length ..");
		double length = sc.nextDouble();
		System.out.println("enter the width..");
		double width = sc.nextDouble();
		
		double area = length * width;
		System.out.println("area of rectangle is : "+area);
	}
}
