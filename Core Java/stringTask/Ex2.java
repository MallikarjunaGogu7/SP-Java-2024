package stringTask;
//Exercise 2: Count Vowels and Consonants

//Write a Java program to count the number of vowels and consonants in a given string.

import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your fav superHero: ");
		String hero = input.nextLine();
		
		
		// Count vowels and consonants
		int[] counts = countVowelsAndConsonants(hero);
		// Output the results
		System.out.println("Number of vowels: " + counts[0]);
		System.out.println("Number of Consonants: " + counts[1]);
		
	}
	
	// Method to count vowels and consonants
	public static int[] countVowelsAndConsonants(String str)
	{
		int vowelCount = 0;
		int consonantCount = 0;
		String vowels = "AEIOUaeiou";  //Set of vowels
		
		// Loop through each character in the string
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			
			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				//If it;s a vowel, ncrease the vowel count
				if (vowels.indexOf(ch) != -1) {
					vowelCount++;
				} else {
					// Otherwise, it's a consonant
					consonantCount++;
				}
			}	
		}
		return new int[] { vowelCount, consonantCount };
	}
}
