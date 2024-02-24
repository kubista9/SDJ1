public class Teacher extends Employee{
	private String subject;

	public Teacher(String name, int SNN,String role, int salary, String subject){
		super(name, SNN, role, salary);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String toString() {
		return "Person" + super.toString() + "Subject: " + subject;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Teacher other = (Teacher) obj;
		return super.equals(obj) && subject.equals(other.subject);
	}
}
