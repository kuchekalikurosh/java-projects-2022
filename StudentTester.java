package problem1;

/* Kurosh Kuchekali
 * Chapter 3 Lab
 * 22 February 2022
 */

public class StudentTester {
	
	public static void main(String[] args)
	{
		Student Output = new Student();
		
		/* it first adds the score of the quiz then prints the student's name with the score
		 * then adds the student's score into the total */
		Output.addQuiz(80);
		Output.getName("Newton");
		Output.totalScore();
		
		/* this repeats two more times */
		Output.addQuiz(50);
		Output.getName("Albert");
		Output.totalScore();
		
		Output.addQuiz(80);
		Output.getName("von Braun");
		Output.totalScore();
		
		/* calculates the average */
		Output.averageScore();
		
		/* finally, prints every output such as the total score and the average score */
		Output.printInfo();
	}
}
