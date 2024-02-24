import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students;

	public StudentList(){
		this.students = new ArrayList<>();
	}

	public StudentList(Student[] initialMembers){

	}

	public int size(){
		return students.size();
	}

	public void addStudent(Student student){
		students.add(student);
	}

	public void removeStudent(int index){
		students.remove(index);
	}

	public Student get(int index){
		return students.get(index);
	}

	public Student getByStudyNumber(int studyNumber){
		for (int i = 0; i < size(); i++){
			if (students.get(i).getStudyNumber() == studyNumber){
				return students.get(i);
			}
		}
		return null;
	}

	public int getNumberOfGroupMembers(int groupNumber){
		int count = 0;
		for (int i = 0; i < size(); i++){
			if (students.get(i).getGroupNumber() == groupNumber){
				count++;
			}
		}
		return count;
	}

	public Student[] getByGroup(int groupNumber){
		int number = 0;
		Student[] groups = new Student[number];
		for (int i = 0; i < size(); i++){
			if (students.get(i).getGroupNumber() == groupNumber){
				groups[getNumberOfGroupMembers(groupNumber)] = students.get(i);
				number++;
			}
		}
		return groups;
	}

	public Student[] getByNationality(String nationality){
		int number = 0;
		Student[] nationalities = new Student[number];
		for (int i = 0; i < size(); i++){
			if (students.get(i).getNationality().equals(nationality)){
				nationalities[number] = students.get(i);
				number++;
			}
		}
		return nationalities;
	}

	public Student[] getStudentsOlderThan(int years) {
		int number = 0;
		Student[] studentsOlderThan = new Student[number];
		for (int i = 0; i < size(); i++){
			if (students.get(i).getAge() > years){
				studentsOlderThan[number] = students.get(i);
				number++;
			}
		}
		return studentsOlderThan;
	}



}
