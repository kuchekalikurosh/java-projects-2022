package problem2;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String n, double sal) {
		name = n;
		salary = sal;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Employee employee = (Employee) obj;
		
		return (employee.name == this.name && employee.salary == this.salary);
	}
	
	public String toString() {
		
		return "Employee Name: " + name + " Salary: " + salary;
	}
	
}
