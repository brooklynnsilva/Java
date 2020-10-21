// Brooklynn Silva
// Student Grade Class
// Java program that calculates a student's final grade when given weighted scores
// July 31, 2020


public class StudentGrade {

	// 3 programming assignment scores
	private int assignment1;
	private int assignment2;
	private int assignment3;
	
	// 2 test scores
	private int test1;
	private int test2;
	
	// 1 participation score
	private int participationScore;
	
	
	// default constructor
	StudentGrade(){
		this.assignment1 = 0;
		this.assignment2 = 0;
		this.assignment3 = 0;
		this.test1 = 0;
		this.test2 = 0;
		this.participationScore = 0;
	}
	
	// second constructor that initializes the six attributes
	StudentGrade(int newAssignment1, int newAssignment2, int newAssignment3, int newTest1, int newTest2, int newParticipationScore){
		setAssignment1(newAssignment1);
		setAssignment2(newAssignment2);
		setAssignment3(newAssignment3);
		setTest1(newTest1);
		setTest2(newTest2);
		setParticipationScore(newParticipationScore);
	}
	
	// getter methods for all attributes
	public int getAssignment1() {
		return this.assignment1;
	}
	
	public int getAssignment2() {
		return this.assignment2;
	}
	
	public int getAssignment3() {
		return this.assignment3;
	}
	
	public int getTest1() {
		return this.test1;
	}
	
	public int getTest2() {
		return this.test2;
	}
	
	public int getParticipationScore() {
		return this.participationScore;
	}
	
	// setter methods for all attributes (between 0-100)
	public void setAssignment1(int newAssignment1) {
		if (newAssignment1 > 0.0 && newAssignment1 <= 100.0) {
			this.assignment1 = newAssignment1;
		}
		else {
			this.assignment1 = -1;
		}
	}
	
	public void setAssignment2(int newAssignment2) {
		if (newAssignment2 > 0.0 && newAssignment2 <= 100.0) {
			this.assignment2 = newAssignment2;
		}
		else {
			this.assignment2 = -1;
		}
	}
	
	public void setAssignment3(int newAssignment3) {
		if (newAssignment3 > 0.0 && newAssignment3 <= 100.0) {
			this.assignment3 = newAssignment3;
		}
		else {
			this.assignment3 = -1;
		}
	}
	
	public void setTest1(int newTest1) {
		if (newTest1 > 0.0 && newTest1 <= 100.0) {
			this.test1 = newTest1;
		}
		else {
			this.test1 = -1;
		}
	}
	
	public void setTest2(int newTest2) {
		if (newTest2 > 0.0 && newTest2 <= 100.0) {
			this.test2 = newTest2;
		}
		else {
			this.test2 = -1;
		}
	}
	
	public void setParticipationScore(int newParticipationScore) {
		if (newParticipationScore > 0.0 && newParticipationScore <= 100.0) {
			this.participationScore = newParticipationScore;
		}
		else {
			this.participationScore = -1;
		}
	}
	
	private double finalScore;
	private String finalGrade;
	
	// method that will calculate and return the student's total score based on a weighted average
	public double calculateScore() {
		double assignmentScore = (this.assignment1 + this.assignment2 + this.assignment3) / 3;
		this.finalScore = (assignmentScore * .4) + (this.test1 * .2) + (this.test2 * .2) + (this.participationScore * .2);
		return this.finalScore;
	}
	
	// method that returns a letter grade based on the student's total score
	public String calculateGrade() {
		
		if (this.finalScore <= 100 && this.finalScore >= 90) {
			this.finalGrade = "A";
		}
		else if (this.finalScore < 90 && this.finalScore >= 80) {
			this.finalGrade = "B";
		}
		else if (this.finalScore < 80 && this.finalScore >= 70) {
			this.finalGrade = "C";
		}
		else if (this.finalScore < 70 && this.finalScore >= 60) {
			this.finalGrade = "D";
		}
		else if (this.finalScore < 60) {
			this.finalGrade = "F";
		}
		return this.finalGrade;
	}
}
