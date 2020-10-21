// Brooklynn Silva
// Final Program
// TEST Student Grade Class
// July 31, 2020

import java.util.InputMismatchException;
import java.util.Scanner;


public class TestStudentGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declared variables 
		int assignment1 = 0;
		int assignment2 = 0;
		int assignment3 = 0;
		int test1 = 0;
		int test2 = 0;
		int participationScore = 0;
		
		
		// try/catch block for exception handling	(InputMismatchException)	
		
		try {
			System.out.println("Enter the score for Assignment 1:");
			assignment1 = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}
	
		try {
			System.out.println("Enter the score for Assignment 2:");
			assignment2 = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}	
		
		try {
			System.out.println("Enter the score for Assignment 3:");
			assignment3 = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}
		
		try {
			System.out.println("Enter the score for Test 1:");
			test1 = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}
		
		try {
			System.out.println("Enter the score for Test 2:");
			test2 = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}
		
		try {
			System.out.println("Enter the score for Participation:");
			participationScore = input.nextInt();
		}
		catch (InputMismatchException grades) {
			System.out.println("Try again with a valid numerical value.");	
			System.exit(0);
		}
	
		// run established scores through the Student Grade Class and calculate the final score and grade for the output
		StudentGrade studentGrade = new StudentGrade(assignment1, assignment2, assignment3, test1, test2, participationScore);
		
		System.out.printf("Final Score: %.2f\n", studentGrade.calculateScore());
		System.out.println("Final Grade: " + studentGrade.calculateGrade());

	}
}
