public class Grade {
	private int grade;

	public Grade (int grade) {
		grade = this.grade;

		if(getEctsGrade() == "Illegal Grade") {
			grade = -3;
		}
	}

	public int getGrade () {
		return grade;
	}

	public string getEctsGrade() {
		String ects  = "Illegal Grade";
		switch(grade) {
			case -3 : ects = "F";
			case 0 : ects ="Fx";
			case 2 : ects ="E";
			case 4 : ects ="D";
			case 7 : ects ="C";
			case 10 : ects ="B";
			case 12 : ects ="A";
		}
		return ects;
	}

	@Override public String toString() {
		return grade + " (" + getEctsGrade() + " )" ;
	}
}
