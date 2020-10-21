import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Brooklynn Silva
		// "Pig Latin"
		// June 9, 2020
		
		Scanner input = new Scanner(System.in);
		// Write a program that converts a word into pig-latin using the String class
		// Prompt the user for a word, then print the pig-latin word
		System.out.println("Please enter a word:");
		String userWord = input.nextLine();
		// Convert the input to lower case in order to examine the word
		String lowerWord = userWord.toLowerCase();
		
		// Create an array to list the vowels and prefixes
		String[] vowel = {"a", "e", "i", "o", "u"};
		String[] prefix = {"bl", "br", "ch", "cl", "cr", "dr", "fl", "fr", "gl", "gr", "kl", "ph", "pl", "pr", "sh", "sl", "sp", "sr", "st", "th", "tr", "wh", "wr"};
		// Create substrings to examine the first letters and define them
		String firstLetter = lowerWord.substring(0,1);
		String firstTwo = lowerWord.substring(0,2);
		// Create substrings for printing the first letters with proper capitalization
		String origFirstLetter = userWord.substring(0,1);
		String origFirstTwo = userWord.substring(0,2);
		
		// Use a for loop to check for vowels (learned from tutor and stack overflow)
		for (int i = 0; i < vowel.length; i++) {
			if (vowel[i].equals(firstLetter)) {
				// If the word begins with a vowel, append "yay" to the end of the word
				System.out.println(userWord + "yay");
				return;
			} 
		}
		// Use a for loop to check for prefixes
		for (int i = 0; i < prefix.length; i++) {
			// If the word begins with a common prefix, move those first 2 letter to the end of the word
			// Then add "ay"
			if (prefix[i].equals(firstTwo)) {
				System.out.println(userWord.substring(2, userWord.length()) + origFirstTwo + "ay");
				return;
			}
		}
		// If the word being with anything else, move the first letter to the end
		// Then add "ay"
		System.out.println(userWord.substring(1, userWord.length()) + origFirstLetter + "ay");
		
		
		
		
	}

}
