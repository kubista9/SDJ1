public class Student {
	private String name, nationality;
	private int studyNumber, groupNumber;
	private MyDate birthday;

	public Student(String name, int studyNumber, String nationality, int groupNumber, MyDate birthday){
		this.name = name;
		this.nationality = nationality;
		this.studyNumber = studyNumber;
		this.groupNumber = groupNumber;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}

	public int getStudyNumber() {
		return studyNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", nationality='" + nationality + '\'' + ", studyNumber=" + studyNumber + ", groupNumber=" + groupNumber + ", birthday=" + birthday + '}';
	}

	public boolean equals(Object obj){
		if (obj == null && getClass() != obj.getClass()){
			return false;
		}
		Student other = (Student) obj;
		return name.equals(other.name) && nationality.equals(other.nationality) && studyNumber == other.studyNumber && groupNumber == other.groupNumber && birthday.equals(other.birthday);

	}
}
