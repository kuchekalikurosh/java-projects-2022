package lab2;

/* Kurosh Kuchekali
 * Chapter 3 Lab
 * 22 February 2022
 */

public class BalloonTester {
	
	public static void main(String[] args) {
		
		Balloon Output = new Balloon();
		
		//inflates the balloon to a radius of 10 then gets the volume and prints both values
		Output.infalte(10);
		Output.getVolume();
		
		//repeats another time
		Output.infalte(15);
		Output.getVolume();	
	}
}
