package lab1;
import java.io.*;

public class Babynames {
	
	public static void reader() {
		try {
			FileReader names = new FileReader("babynames.txt");
			FileWriter male = new FileWriter("boynames.txt");
			FileWriter female = new FileWriter("girlnames.txt");
			
			BufferedReader reader = new BufferedReader(names);
			
			String line = " ";
			
			String[] seperate = new String[100];
			
			while((line = reader.readLine()) != null) {
				seperate = line.split(" ");
				male.write(seperate[1]);
				female.write(seperate[4]);
			}
			
			male.close();
			female.close();
			names.close();
			
		} 
		
		catch (FileNotFoundException ex) {
			System.out.println("File Not Found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		reader();
	}
	
}
