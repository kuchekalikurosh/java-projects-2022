package problem1;

public class Instructor extends Person {
	
	private double salary;
	
	public Instructor(String tag, String bday, double sal) {
		super(tag, bday);
		salary = sal;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Instructor instructor = (Instructor) obj;
		
		return (instructor.salary == this.salary);
	}
	
	public String toString() {
		return super.toString() + " Salary: " + salary;
	}

}
