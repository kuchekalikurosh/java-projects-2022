package problem2;

/* Kurosh Kuchekali
 * Chapter 3 Lab
 * 22 February 2022
 */

public class Battery {
	
	double batteryCapacity;
	double currentBattery;
	double batteryDrain;
	
	//sets two variables which will be used for calculations
	public Battery(double capacity) {
		batteryCapacity = capacity;
		currentBattery = capacity;
	}
	
	//drains the battery by an x amount
	public void drain(double amount) {
		currentBattery -= amount;
	}
	
	//charges back the battery to the initial charge
	public void charge() {
		currentBattery = batteryCapacity;
	}
	
	//prints the remaining charge of the battery
	public double getRemainingCapacity() {
		System.out.println("Remaining Charge: " + currentBattery + " mAh");
		return batteryCapacity;
	}

}
