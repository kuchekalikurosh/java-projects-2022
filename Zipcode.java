package chapter8;
import java.util.Scanner;

public class Zipcode {
	int digit;
	int checksum;
	int sum = 0;
	int sum2 = 0;
	String mickey = "";
	String temp = "";
	String convert = "";
	String fullbar = "|";
	String binary = "";
	char barcode;
	Scanner input = new Scanner(System.in);
	
	public void Convert(String temp) {
		for(int i = 0; i < 30; i++) {
			barcode = temp.charAt(i);
			if(barcode == '1') {
				fullbar += "|";
			} else {
				fullbar += ":";
			}
		}
		fullbar += "|";
		System.out.println(fullbar);
	}
	
	public String BarcodeConvert(String temp) {
		for(int i = 1; i < 31; i++) {
			barcode = temp.charAt(i);
			if(barcode == '|') {
				binary += "1";
			} else if (barcode == ':') {
				binary += "0";
			}
		}
		return binary;
	}
	
	public String Checksum(String zipcode) {
		for(int i = 0; i < 5; i++) {
			sum += zipcode.charAt(i);
		}
		sum = 10 - (sum % 10);
		zipcode += Integer.toString(sum);
		return zipcode;
	}
	
	public void ReverseChecksum(String barcode) {
		for(int i = 0; i < 5; i++) {
			sum2 += barcode.charAt(i) - '0';
		}
		sum2 = 10 - (sum2 % 10);
		if(sum2 == (barcode.charAt(5) - '0')) {
			barcode = barcode.substring(0, barcode.length() - 1);
			System.out.println("Zipcode for this barcode is: " + barcode);
		}
		else {
			System.out.println("Checksum does not match barcode!");
		}
	}
	
	
	public String BinaryConverter(String zipcode) {
		for(int i = 0; i < 6; i++) {
			digit = zipcode.charAt(i) - '0';
				if(digit == 9) {
					temp += "10100";
				}
				else if(digit == 8) {
					temp += "10010";
				}
				else if(digit == 7) {
					temp += "10001";
				}
				else if(digit == 6) {
					temp += "01100";
				}
				else if(digit == 5) {
					temp += "01010";
				}
				else if(digit == 4) {
					temp += "01001";
				}
				else if(digit == 3) {
					temp += "00110";
				}
				else if(digit == 2) {
					temp += "00101";
				}
				else if(digit == 1) {
					temp += "00011";
				}
				else if(digit == 0){
					temp += "11000";
				}
				else {
					System.out.println("Error!");
					break;
				}
		}
		return temp;
	}
	
	public String ReverseBinary(String barcode) {
		for(int i = 0; i < 30; i += 5) {
			convert = "";
			for(int j = i; j < (i + 5); j++) {
				convert = convert + Integer.toString(barcode.charAt(j) - '0');
		}
			if(convert.equals("10100")) {
				mickey += "9";
			}
			else if(convert.equals("10010")) {
				mickey += "8";
			}
			else if(convert.equals("10001")) {
				mickey += "7";
			}
			else if(convert.equals("01100")) {
				mickey += "6";
			}
			else if(convert.equals("01010")) {
				mickey += "5";
			}
			else if(convert.equals("01001")) {
				mickey += "4";
			}
			else if(convert.equals("00110")) {
				mickey += "3";
			}
			else if(convert.equals("00101")) {
				mickey += "2";
			}
			else if(convert.equals("00011")) {
				mickey += "1";
			}
			else if (convert.equals("11000")) {
				mickey += "0";
			}
			else {
				System.out.println("Error!");
			}
			
	}
		return mickey;
}

}
