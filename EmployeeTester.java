package problem2;

public class EmployeeTester {
	
	public static void main(String[] args) {
		Manager one = new Manager("Justin", 75000, "Customer Relations");
		Manager two = new Manager("Gabe", 100000, "Quality Assurance");
		Manager three = new Manager("Justin", 75000, "Customer Relations");
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		
		System.out.println(one);
		System.out.println(two);
		
		Executive exec1 = new Executive("Harold", 75000, "Customer Relations", true);
		Executive exec2 = new Executive("Blanc", 100000, "Quality Assurance", false);
		Executive exec3 = new Executive("Harold", 75000, "Customer Relations", true);
		
		System.out.println(exec1.equals(exec2));
		System.out.println(exec1.equals(exec3));
		
		System.out.println(exec1);
		System.out.println(exec2);
	}

}
