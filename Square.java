package chapter2;
/* Kurosh Kuchekali
 * Chapter 2 Lab
 * 9 February 2022
 */
public class Square {
		
		/* private integer so when a new number is put in
		 * it does not interfere with the other values/data
		 */
		private int length;
		
		//object to set the length for calculations
		public void setLenght(int value) {
			length = value;
		}
		
		//object to be able to return the length to print on the screen
		public int squareLength() {
			return length;
		}
		
		//object to calculate area of the square
		public int calcArea() {
			return (length * length);
		}
		
		//object to calculate the perimeter of the square
		public int calcPerimeter() {
			return (length + length + length + length);
		}
			
}