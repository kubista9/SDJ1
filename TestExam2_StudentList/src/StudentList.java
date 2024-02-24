public class StudentList {
	private int size;
	private Student[] listOfStudents;

	public StudentList(){
		this.size = 0;
		this.listOfStudents = new Student[1];
	}

	public void addStudent(Student student){
		if (size < listOfStudents.length && size >= 0){
			listOfStudents[size] = student;
			size++;
		}
	}

	public Student getStudent(int index){
		return listOfStudents[index];
	}

	public void removeStudent(Student student){
		for (int i = 0; i < listOfStudents.length; i++){
			if (listOfStudents[i].equals(student)){
				for (int j = i; j <= listOfStudents.length-2; i-- ){
					listOfStudents[i] = listOfStudents[i++];
				}
				listOfStudents[listOfStudents.length-1] = null;
				size--;
				break;
			}
		}
	}

	public int getNumberOfStudent(){
		return size;
	}


	public int getNumberOfStudentByEducation(Education education){
		int counter = 0;
		for (int i = 0; i < listOfStudents.length; i++){
			if (listOfStudents[i].getEducation().equals(education)){
				counter++;
			}
		}
		return counter;
	}

	public Student[] getStudentsByEducation(Education education){
		int counter = 0;

		for (int i = 0; i < size; i++){
			if (listOfStudents[i].getEducation().equals(education)){
				counter++;
			}
		}

		Student[] studentsByEducation = new Student[counter];
		int index = 0;

		for (int i = 0; i < size; i++){
			if (listOfStudents[i].getEducation().equals(education)){
				studentsByEducation[index] = listOfStudents[i];
				index++;
			}
		}
		return studentsByEducation;
	}

	public int getNumberOfHighSchoolStudents(){
		int counter = 0;
		for (int i = 0; i < size; i++){
			if (listOfStudents[i].getEducation().equals(School.HIGH_SCHOOL)){
				counter++;
			}
		}
		return counter;
	}

	public void doubleTheListCapacity(){
		int doubleSize = listOfStudents.length *2;
		Student [] listOfStudentsDouble = new Student[doubleSize];
		for (int i = 0; i < listOfStudents.length; i++){
			listOfStudentsDouble[i] = listOfStudents[i];
		}

		listOfStudents = listOfStudentsDouble;
	}



}
