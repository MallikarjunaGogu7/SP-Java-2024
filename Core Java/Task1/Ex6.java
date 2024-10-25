package Task1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the price of item..");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity of item..");
		int quantity = sc.nextInt();
		
		double totalCost = price * quantity;
		System.out.println("total cost : "+totalCost);
	}
}
