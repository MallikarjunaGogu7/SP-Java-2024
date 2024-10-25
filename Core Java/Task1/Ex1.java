package Task1;

import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of circle: ");
		double radius = sc.nextDouble();
		double PI = 3.14159;
		double area = PI * radius * radius;
		
		System.out.println("the area of circle for a given radius is:  "+area);
		
	}
}
