package midterm;

/* Kurosh Kuchekali
 * Midterm
 * 26 March 2022
 */

public class Tester {
	
	public static void main(String[] args) {
		UserInput input = new UserInput();
		
		//gets the user input
		input.Input();
		
		//loops the number and prints the frequency
		for (int i = 0; i < 10; i++) {
			int temp = UserInput.getNextNumber(i);
			System.out.println(i + ": " + temp);
		}	
	}
}
