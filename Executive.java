package problem2;

public class Executive extends Manager {
	
	private boolean isExec;
	
	public Executive(String n, double sal, String dep, boolean exec) {
		super(n, sal, dep);
		isExec = exec;
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Executive executive = (Executive) obj;
		
		return (executive.isExec == this.isExec);
	}
	
	public String toString() {
		
		return super.toString() + " Is Executive?: " + isExec;
	}

}
