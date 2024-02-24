public class Student {
	private String name;
	private Education education;

	public Student(String name, Education education){
		this.name = name;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public Education getEducation() {
		return education;
	}

	public void changeEducation(Education education){
		this.education = education;
	}

	public boolean Equals(Object obj){
		if (obj == null && getClass() != obj.getClass()){
			return false;
		}

		Student other = (Student) obj;
		return this.name.equals(other.name) & this.education.equals(other.education);
	}

	public String toString(){
		return "Name: " + name + "Education: " + education;
	}
}
