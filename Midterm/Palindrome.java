package midterm;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Midterm
 * 26 March 2022
 */

public class Palindrome {
	static String[] input = new String[5];
	
	//checks if the given string is a palindrome or not
	static boolean palindrome(String str) {
		int x = str.length() - 1;
		int i = 0;
		
		/*this loop checks if the characters within the string are the same
		 * forward and backwards.
		 * if they are not the same, returns false
		 * if they are the same, returns true
		 */
		while (i < x) {
			if(str.charAt(i) != str.charAt(x)) {
				return false;
			}
			i++;
			x--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter five words or numbers: ");
		for (int i = 0; i < 5; i++) {
			input[i] = user.nextLine();
		}
		
		//prints out the string based on whether or not it was true or not
		System.out.println("Palindrome: ");
		
		for (int i = 0; i < 5; i++) {
			String temp = input[i];
			if (palindrome(temp) == true) {
				System.out.println(temp);
			}
		}
		
		System.out.println("");
		System.out.println("Not Palindrome: ");
		
		for (int i = 0; i < 5; i++) {
			String temp = input[i];
			if (palindrome(temp) == false) {
				System.out.println(temp);
			}
		}
	}
}
