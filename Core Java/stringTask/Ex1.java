package stringTask;
//Exercise 1: Reverse a String

//Write a Java program to reverse a given string.

import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a string
		System.out.println("Enter a name: ");
		String name = input.nextLine();
		
		//Reverse the String
		String reversedString = reverse(name);
		
		// Output the reversed String
		System.out.println("Reversed string: " + reversedString);
		
	}
	
	// Method to reverse the string
	public static String reverse(String str) 
	{
		// Convert string to a character array
		char[] chars = str.toCharArray();
		String reversed = "";
		
		//Iterate from end of the array to the beginning
		for( int i = chars.length -1; i >= 0; i--) {
			reversed += chars[i];
		}
		
		return reversed;
		
	}
}











