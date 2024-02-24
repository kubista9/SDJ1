public class Grade {
	private int grade;

	public Grade(int grade) {
		this.grade = grade;
	}

	public Grade(String ectsGrade) {
		int ects = 0;

		switch (ectsGrade) {
			case "A": ects = 12;
			break;
			case "B": ects = 10;
			break;
			case "C": ects = 7;
			break;
			case "D": ects = 4;
			break;
			case "E": ects = 2;
			break;
			case "F": ects = 0;
			break;
			case "Fx": ects = -3;
			break;
		}
	}

	public int getGrade() {
		return grade;
	}

	public String getEctsGrade() {
		String ects = "Illegal value";
		switch (grade) {
			case -3: ects = "Fx";
			break;
			case 0: ects = "F";
			break;
			case 2: ects = "E";
			break;
			case 4: ects = "D";
			break;
			case 7: ects = "C";
			break;
			case 10: ects = "B";
			break;
			case 12: ects = "A";
			break;
		}
		return ects;
	}
}
