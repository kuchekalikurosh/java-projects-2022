package problem1;

public class Person {
	
	private String name;
	private String birthday;
	
	public Person(String tag, String bday) {
		name = tag;
		birthday = bday;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Person person = (Person) obj;
		
		return (person.name == this.name && person.birthday == this.birthday);
	}
	
	public String toString() {
		
		return "Name: " + name + " DOB: " + birthday;
	}

}
