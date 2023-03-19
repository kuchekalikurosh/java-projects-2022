package chapter7;

/* Kurosh Kuchekali
 * Chapter 7 Lab
 * 19 March 2022
 */

public class PetInvoice {
	
	public static void main(String[] args) {
		//tester program
		Invoice input = new Invoice();
		Item item = new Item(0, false, 0);
		
		input.add(item);
		double discount = input.getDiscount(item);
		System.out.println("Your Discount: " + discount);
		
	}

}
