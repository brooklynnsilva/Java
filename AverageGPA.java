import java.util.Scanner;

public class MidtermProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Brooklynn Silva
		// Java program that accepts students (male and female),
			// accepts their GPA, and calculates the male and female GPA avg.
		// June 26, 2020
		
		Scanner input = new Scanner(System.in);
		
		// List all of the variables and constants for the program
		String promptUser = "Please enter the student type ('male' or 'female') or 'quit' to exit.";
		String studentEntry = "";
		String finalResult = "";
		final String MALE = "male";
		final String FEMALE = "female";
		final String SENTINEL = "quit";
		double maleGPA = 0;
		double totalMaleGPA = 0;
		double totalMaleStudents = 0;
		double averageMaleGPA = 0;
		double femaleGPA = 0;
		double totalFemaleGPA = 0;
		double totalFemaleStudents = 0;
		double averageFemaleGPA = 0;
		
		// Create a while loop that continues until the user enters 'quit'
		while (true) {
			System.out.println(promptUser);
			studentEntry = input.next();
			// Be able to accept entries in upper or lower case
			String lc = studentEntry.toLowerCase();
			
			// Break the loop if the user enters 'quit'
			if (lc.equals(SENTINEL)) {
				break;
			}
			// Add male GPA to total
			else if (lc.equals(MALE)) {
				System.out.println("Please enter this male's GPA:");
				maleGPA = input.nextDouble();
				totalMaleGPA += maleGPA;
				totalMaleStudents ++;
			}
			// Add female GPA to total
			else if (lc.equals(FEMALE)) {
				System.out.println("Please enter this female's GPA:");
				femaleGPA = input.nextDouble();
				totalFemaleGPA += femaleGPA;
				totalFemaleStudents ++;
			}
			// Print an error message for improper input
			else {
				System.out.println("Please enter a valid student type ('male' or 'female').");
			}
		}
		// I was getting the output 'NaN' if there were zero males or zero females so I established the variables above as average male/female GPA= 0
		// This way it only calculates the average if there was at least 1 entry
		if (totalMaleStudents > 0) {
			averageMaleGPA = (totalMaleGPA / totalMaleStudents);
		}
		if (totalFemaleStudents > 0) {
			averageFemaleGPA = (totalFemaleGPA / totalFemaleStudents);
		}
		
		// OUTPUT: with 2 decimal places in the GPA
		System.out.printf("The average GPA of all male students is %.2f%n", averageMaleGPA);
		System.out.printf("The average GPA of all female students is %.2f%n", averageFemaleGPA);
		
	}
}

		
