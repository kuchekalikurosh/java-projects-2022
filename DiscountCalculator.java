package problem1;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Chapter 4 Lab
 * 5 March 2022
 */

public class DiscountCalculator {
	public static final int MAX_DISCOUNT = 75;
	public int totalmovies;
	public int totalreferrals;
	public int discount;
	public double output;
	
	//allows for user input
	Scanner input = new Scanner(System.in);
	
	//constructor to set all values to zero
	public DiscountCalculator() {
		totalmovies = 0;
		totalreferrals = 0;
		discount = 0;
	}
	
	//asks the user for inputs
	public void Discount() {
		System.out.println("Enter total number of movie rentals: ");
		totalmovies = input.nextInt();
		System.out.println("Enter number of referrals: ");
		totalreferrals = input.nextInt();
		
		//calculates discount based on the total movies and referrals
		discount = totalmovies + totalreferrals;
	}
	
	public void Output() {
		//makes sure that the discount doesn't exceed the maximum of 75
		output = Math.min(MAX_DISCOUNT, discount);
		//prints the final results
		System.out.printf("Discount is equal to: %.2f percent\n", output);
	}

}
