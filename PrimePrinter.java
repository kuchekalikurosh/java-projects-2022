package lab1;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Chapter 5 Lab
 * 13 March 2022
 */

public class PrimePrinter {
	public static void main(String[] args) {
		//gets the required class
		//sets the scanner
		PrimeGenerator pg = new PrimeGenerator();
		Scanner input = new Scanner(System.in);
		//asks the usesr for the upper limit
		System.out.println("Enter Upper Limit: ");
		int limit = input.nextInt();
		//does the prime calculation and prints
		pg.nextPrime(limit);
		
	}

}
