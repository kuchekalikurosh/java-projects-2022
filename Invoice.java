package chapter7;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Chapter 7 Lab
 * 19 March 2022
 */

public class Invoice {
	Scanner input = new Scanner(System.in);
	int i = 0;
	int total = 0;
	double discount = 0;
	int quantityTotal = 0;
	
	//adds each item into the array
	public void add(Item anItem) {
		while(i < 20) {
			System.out.println("What is the price of your item? Enter -1 to end: ");
			anItem.price[i] = input.nextDouble();
			//checks to see if you want to stop adding items
			if (anItem.price[i] == -1) {
				break;
			}
			System.out.println("Quantity of item: ");
			anItem.quantity[i] = input.nextInt();
			System.out.println("Is it a pet? [True/False]: ");
			anItem.isPet[i] = input.nextBoolean();
			i++;
		}
	}
	
	//gets the discount if the conditions are met
	public double getDiscount(Item anItem) {
		//totals the entire array without counting the pets
		for (int x = 0; x < anItem.quantity.length; x++) {
			if(anItem.isPet[x] == false) {
				total += anItem.price[x] * anItem.quantity[x];
				quantityTotal += anItem.quantity[x];
			}
		}
		//if the conditions are met for a discount, then the discount is calculated and returned
		for (int x = 0; x < anItem.quantity.length; x++) {
			if(anItem.isPet[x] == true && quantityTotal >= 5) {
				discount = total * 0.20;
			}
		}
		return discount;
	}

}
