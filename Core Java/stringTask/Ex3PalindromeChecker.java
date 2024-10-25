package stringTask;

import java.util.Scanner;
public class Ex3PalindromeChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String name = input.nextLine();
		
		// check if the string is a palindrome
		boolean isPalindrome = checkPalindrome(name);
		// Output the result
		if (isPalindrome) {
			System.out.println(name + "Is a Palindrome");
			
		} else {
			System.out.println(name + "Is a not a Palindrome");
		}
	}
	
	//Method to check if a string is a palindrome
	public static boolean checkPalindrome(String str) {
		str = str.toLowerCase();
		
		String cleanedString = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int length = cleanedString.length();
		for (int i =0; i<length/2; i++) {
			if(cleanedString.charAt(i) != cleanedString.charAt(length-i-1)) {
				return false;
			}
		}
		
		return true;
				
	}
}
