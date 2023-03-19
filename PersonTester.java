package problem1;

public class PersonTester {
	
	public static void main(String[] args) {
		Student one = new Student("James", "01/01/2000", "English");
		Student two = new Student("Jane", "01/20/2000", "Math");
		Student three = new Student("James", "01/01/2000", "English");
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		
		Instructor uno = new Instructor("Alex", "02/01/1990", 60000);
		Instructor dos = new Instructor("Kenny", "02/01/1972", 120000);
		Instructor tres = new Instructor("Alex", "02/01/1990", 60000);
		
		System.out.println(uno.equals(dos));
		System.out.println(uno.equals(tres));
		
		System.out.println(uno);
		System.out.println(dos);
		System.out.println(tres);

	}
	
}
