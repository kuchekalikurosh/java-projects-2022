package midterm;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Midterm
 * 26 March 2022
 */

public class UserInput {
	Scanner input = new Scanner(System.in);
	static int[] numbers = new int[20];
	static int total = 0;
	
	public UserInput() {
	
	}
	
	//gets the user input and stores it into an array
	//loop ends when -1 is entered or if 20 numbers have been entered
	public void Input() {
		System.out.println("Enter numbers between 0-9 (-1 to end): ");
		for (int i = 0; i < 20; i++) {
			numbers[i] = input.nextInt();
			if (numbers[i] > 9 || numbers[i] < -1) {
				System.out.println("Enter a valid number: ");
				numbers[i] = input.nextInt();
			}
			if (numbers[i] == -1) {
				break;
			}
			total++;
		}
	}
	
	//counts the frequency of the given numbers
	static int getNextNumber(int compare) {
		int counter = 0;
		
		for (int i = 0; i < total; i++) {
			if (numbers[i] == compare) {
				counter ++;
			}
		}
		return counter;
	}	
}
