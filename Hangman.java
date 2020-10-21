import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Assignment6 {

	
	// Brooklynn Silva
	// HANGMAN GAME
	// July 9, 2020
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char userAnswer;
		
		// Do/while loop to repeat the game if the user wants to play again
		do {
			System.out.println("Let's play HANGMAN!");
			newGame();	
			System.out.println("Would you like to play again? (y/n)");
			userAnswer = input.next().charAt(0);
		} while(userAnswer == 'y');
		
		// If the user answers 'n' / no the game will terminate
		System.out.println("Okay, thanks for playing!");
	}

// Generate a random work to guess from the array LOADWORDS
	public static String loadWords(final String[] LOADWORDS) {
		final Random RANDOM = new Random();
		return (LOADWORDS[RANDOM.nextInt(LOADWORDS.length)]);
	}
	
	
	// newGame function
	public static void newGame() {
		Scanner input = new Scanner(System.in);
		
		// Constant array of strings / word options for game
		final String [] LOADWORDS = {"APPLE", "ASSERTIVE", "BANANA", "CANARY", "CONTINUE", "DICTIONARY", "ELEPHANT", "FALAFEL", "GREENHOUSE", "HOSPITAL", "INDIGO", "INTERFACE", "JUPITER", "KNOWLEDGE", "LEMONADE", "MOUNTAIN", "NEGATIVE", "OCTOPUS", "PENCIL", "QUARANTINE", "RASCALS", "SALTINESS", "TROUBADOUR", "UMBRELLA", "VIOLIN", "WATERCRESS", "XYLOPHONE", "YELLOW", "ZERO"};
		
		// Declaring variables for the game
		String solveWord;
		char[] wordArray = null;
		int userErrors = 0;
		StringBuilder tempWord = null;
		
		// use loadWords function to bring the randomly selected word into the game
		solveWord = loadWords(LOADWORDS);
		
		// Show the length of the word with asterisks
		StringBuilder asteriskWord = new StringBuilder(solveWord.length());
		
		for (int i = 0; i < solveWord.length(); i++) {
        	asteriskWord.append("*");
        }   
		
        System.out.println("Your word is: " + asteriskWord.toString());
        
        
        wordArray = new char[solveWord.length()];
        Arrays.fill(wordArray, '*');
        tempWord = new StringBuilder(new String(wordArray));
        
        // Prompt the user to guess letters until the word is solved (using a do/while loop)
		do {
			System.out.println("Guess a letter:");
			
			// Take a single letter from the user and convert it to upper case to compare to solveWord
			char userChar;
			userChar = input.next().toUpperCase().charAt(0);
			
			// Replace asterisks with the guessed letter if found in the word
		    for (int i = solveWord.indexOf(userChar); i >= 0; i = solveWord.indexOf(userChar, i + 1)) {
		    	tempWord.setCharAt(i, userChar);
		    }
			
		    // User wins when they complete the word and will be notified how many errors they made while guessing
		    if (solveWord.equals(tempWord.toString())){
				System.out.println("You win! The word is " + solveWord);
				System.out.println("You guessed wrong " + userErrors + " times.");
		    }
		    
		    // If the word does not contain the letter, count the error and ask for another letter
		    else if (!solveWord.contains("" + userChar)){
		    	System.out.println("Darn, that letter was not found in the mystery word!");
		    	System.out.println("Guess again! Your word is now: " + tempWord);
		        userErrors ++;
			}
		    
		    // If the letter is found in the word, ask for another letter
		    else if (solveWord.contains("" + userChar)) {
		    	System.out.println("YAY! Your letter was found in the mystery word!");
		    	System.out.println("Guess again! Your word is now: " + tempWord);
		    }
			
		    
		    
		} while (solveWord.equals(tempWord.toString()) == false);
	}		
}		



	