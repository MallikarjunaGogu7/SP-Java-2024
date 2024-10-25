package Task1;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("the the num1");
		float f1 = sc.nextFloat();
		System.out.println("the the num2");
		float f2 = sc.nextFloat();
		System.out.println("the the num3");
		float f3 = sc.nextFloat();
		
		float avg = (f1+f2+f3) / 3;
		System.out.println("the average of 3 nums is : "+avg);
		
	}
}
