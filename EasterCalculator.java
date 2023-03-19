package problem2;
import java.util.Scanner;

/* Kurosh Kuchekali
 * Chapter 4 Lab
 * 5 March 2022
 */

public class EasterCalculator {
	
	Scanner input = new Scanner(System.in);
	public int a, b, c, d, e, g, h, j, k, m, n, r, p;
	public int y;
	
	//constructor of all values;
	public EasterCalculator() {
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		g = 0;
		h = 0;
		j = 0;
		k = 0;
		m = 0;
		n = 0;
		r = 0;
		p = 0;
		y = 0;
	}
	
	//asks for the year then calculates the Easter
	public void Calculator() {
		System.out.println("Enter year: ");
		y = input.nextInt();
		
		a = y % 19;
		
		b = y / 100;
		c = y % 100;
		
		d = b / 4;
		e = b % 4;
		
		g = (8 * b + 13) / 25;
		
		h = (19 * a + b - d - g + 15) % 30;
		
		j = c / 4;
		k = c % 4;
		
		m = (a + 11 * h) / 319;
		
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		
		n = (h - m + r + 90) / 25;
		
		p = (h - m + r + n + 19) % 32;
	}
	
	//prints and outputs the results
	public void Output() {
		System.out.println("Easter falls on the month of " + n);
		System.out.println("and the day of " + p);
	}

}
