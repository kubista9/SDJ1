public class Student extends Person{
	private int averageGrade;

	public Student(String name, int SSN, int averageGrade){
		super(name, SSN);
		this.averageGrade = averageGrade;
	}

	public int getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(int averageGrade) {
		this.averageGrade = averageGrade;
	}

	public String toString() {
		return "Person" + super.toString() + "Average grade: " + averageGrade;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Student other = (Student) obj;
		return super.equals(obj) && averageGrade == other.averageGrade;
	}
}
