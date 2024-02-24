public class Grade {
	private int grade;
	public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

	public Grade(int grade) {
		this.grade = grade;
	}

//	public Grade(String ectsGrade) {
//		this.LEGAL_GRADES[] = new LEGAL_GRADES[];
//	}

	public int getGrade() {
		return grade;
	}

	public String getEctsGrade()
	{
		String ects = "Illegal grade";
		switch (grade)
		{
			case -3:
				ects = "F";
				break;
			case 0:
				ects = "Fx";
				break;
			case 2:
				ects = "E";
				break;
			case 4:
				ects = "D";
				break;
			case 7:
				ects = "C";
				break;
			case 10:
				ects = "B";
				break;
			case 12:
				ects = "A";
				break;
		}
		return ects;
	}

	@Override
	public String toString() {
		return "Grade{" + "grade=" + grade + '}';
	}

	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		}
		Grade other = (Grade) obj;
		return grade == other.grade;
	}

	public static boolean isLegalGrade(int grade) {
		for(int i = 0;i < LEGAL_GRADES.length;i++) {
			if(LEGAL_GRADES[i] == grade) {
				return true;
			}
		}
		return false;
	}
}
