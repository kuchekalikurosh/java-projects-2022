package lab2;
import java.io.*;

public class Hotel {
	
	public static void reader() throws IOException {
	try {
		FileReader list = new FileReader("list.txt");
		FileWriter dinner = new FileWriter("dinner.txt");
		FileWriter conference = new FileWriter("conference.txt");
		
		BufferedReader reader = new BufferedReader(list);
		
		String line = "";
		String[] seperate = new String[100];
		
		double dinnerTotal = 0.00;
		double conferenceTotal = 0.00;
		
		while((line = reader.readLine()) != null) {
			seperate = line.split(";");
			
			
			if (seperate[1].equals("Dinner")) {
				dinner.write(line + '\n');
				dinnerTotal += Double.parseDouble(seperate[2]);
				
			}
			
			if (seperate[1].equals("Conference")) {
				conference.write(line + '\n');
				conferenceTotal += Double.parseDouble(seperate[2]);
			}
			
		}
		
		System.out.println("Dinner Total: " + dinnerTotal);
		System.out.println("Conference Total: " + conferenceTotal);
		
			list.close();
			dinner.close();
			conference.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
	}

	public static void main(String args[]) throws IOException {
		reader();
	}
}
