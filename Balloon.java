package lab2;

/* Kurosh Kuchekali
 * Chapter 3 Lab
 * 22 February 2022
 */

public class Balloon {
	
	private double radius = 0;
	private double volume;
	
	//inflates the volume by a certain amount
	public void infalte(double amount) {
		radius = amount;
	}
	
	//calculates the volume of the balloon
	public void getVolume() {
		volume = (4.0/3) * Math.PI * (radius * radius * radius);
		//printf function is similar to C
		//used in this context to only print the values up to 2 decimal places
		System.out.printf("Radius: %.2f\n", radius);
		System.out.printf("Volume: %.2f\n\n", volume);
	}

}