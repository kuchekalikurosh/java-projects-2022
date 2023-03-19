package lab1;

/* Kurosh Kuchekali
 * Chapter 5 Lab
 * 13 March 2022
 */

public class PrimeGenerator {
	
	public PrimeGenerator() {

	}
	
	//takes the limit and runs it through the for loop
	//prints out the prime numbers and excludes the numbers that are not prime
	public void nextPrime(int y) {
		
		for (int x = 2; x <= y; x++) {
			if (isPrime(x)) {
				System.out.println(x);
			}
		}
	}
	
	//if it is not a prime number, returns false
	//if it is a prime number, returns true
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2 ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}


	

