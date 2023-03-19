package problem2;

public class Manager extends Employee {
	
	private String department;
	
	public Manager(String n, double sal, String dep) {
		super(n, sal);
		department = dep;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Manager manager = (Manager) obj;
		
		return (manager.department == this.department);
	}
	
	public String toString() {
		
		return super.toString() + " Department: " + department;
	}

}
