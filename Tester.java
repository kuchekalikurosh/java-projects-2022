package chapter8;
import java.util.Scanner;

public class Tester {
	
	public static void main(String [] args) {
		Scanner user = new Scanner(System.in);
		Zipcode input = new Zipcode();
		String zipcode = "";
		String barcode = "";
		
		
			System.out.println("Enter Zipcode: ");
			zipcode = user.nextLine();
			input.Convert(input.BinaryConverter(input.Checksum(zipcode)));
			
			System.out.println("Enter Barcode: ");
			barcode = user.nextLine();
			input.ReverseChecksum(input.ReverseBinary(input.BarcodeConvert(barcode)));
		}
}	

