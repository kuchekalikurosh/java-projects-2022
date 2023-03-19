package problem2;

/* Kurosh Kuchekali
 * Chapter 3 Lab
 * 22 February 2022
 */

public class BatteryTester {
	
	public static void main(String[] args) {
		
		//calls the battery class with the initial amount of 2000 mAh charge
		Battery Output = new Battery(2000);
		
		//drains the battery by 500 mAh
		Output.drain(500);
		
		//prints out the current charge of the battery
		Output.getRemainingCapacity();
		
		//charges the battery back to the initial
		Output.charge();
		
		//prints out the current charge of the battery
		Output.getRemainingCapacity();
		
	}

}
