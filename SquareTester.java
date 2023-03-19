package chapter2;
/* Kurosh Kuchekali
 * Chapter 2 Lab
 * 9 February 2022
 */


public class SquareTester {
	
	public static void main(String[] args ) {
		
		//essentially calling a function
		//the Square class is being imported to this class as Output
		Square Output = new Square();
		
		//sets the length to 7 for calculations
		Output.setLenght(7);
		
		//calculates the variables in the Square class and outputs it on the screen
		System.out.println("The length of the 1st square is " + Output.squareLength());
		System.out.println("It has an area of " + Output.calcArea() + " and a perimeter of " + Output.calcPerimeter());
		
		//empty space for formatting
		System.out.println(" ");

		//same calculations as last time
		Output.setLenght(10);
		
		System.out.println("The length of the 2nd square is " + Output.squareLength());
		System.out.println("It has an area of " + Output.calcArea() + " and a perimeter of " + Output.calcPerimeter());
		
	}
}
