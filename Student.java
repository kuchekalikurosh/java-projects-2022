package problem1;

public class Student extends Person {
	
	private String major;
	
	public Student(String tag, String bday, String maj) {
		super(tag, bday);
		major = maj;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Student student = (Student) obj;
		
		return (student.major == this.major);
	}

	public String toString() {
		return super.toString() + " Major: " + major;
	}
	
}
