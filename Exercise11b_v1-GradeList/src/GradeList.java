public class GradeList {
	private int[] grades;
	private int actualNumberOfGrades;
	public static final int[] LEGAL_GRADES = {12,10,7,4,2,0,-3};

	public GradeList (int maxNumberOfGrades) {
		this.grades = new int [maxNumberOfGrades];
		this.actualNumberOfGrades = 0;
	}

	public int size() {
		return actualNumberOfGrades;
	}

	public void addGrade(int grade) {
		if (islegalGrade(grade))
		{
			if (actualNumberOfGrades < grades.length)
			{
				grades[actualNumberOfGrades] = grade;
				actualNumberOfGrades++;
			}
		}
	}

	public int getGrade(int index)
	{
		if (index >= 0 && index < actualNumberOfGrades) {
			return grades[index];
		}
		return -1;
	}

	public int getMaxGrade()
	{
		if(actualNumberOfGrades > 1) {
			return -1;
		}
		int max = grades[0];
		for (int i=1; i<actualNumberOfGrades; i++) {
			if (grades[i] > max) {
				max = grades[i];
			}
		}
		return max;
	}

	public int getMinGrade()
	{
		if(actualNumberOfGrades > 1) {
			return -1;
		}
		int min = grades[0];
		for (int i=1; i<actualNumberOfGrades; i++) {
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		return min;
	}

	public double getAverage() {
		int sum = 0;
		for (int i=0; i<actualNumberOfGrades; i++) {
			sum += grades[i];
		}
		return (double) sum/actualNumberOfGrades;
	}

	public int getGradeCount (int grade) {
		int count = 0;
		for (int i=0; i<actualNumberOfGrades; i++) {
			if (grades[i] == grade) {
				count++;
			}
		}
		return count;
	}

	public String getGradeDistribution() {
		String s = "{";
		for (int i=0; i<LEGAL_GRADES.length; i++) {
			s += LEGAL_GRADES[i] + " (" + getGradeCount(LEGAL_GRADES[i]) + ")";
			if (i<LEGAL_GRADES.length-1) {
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	@Override public String toString() {
		String s = "Grades: {";
		for (int i=0; i<LEGAL_GRADES.length; i++) {
			s += grades[i];
			if (i<LEGAL_GRADES.length-1) {
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	@Override public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		GradeList other = (GradeList) obj;
		if (actualNumberOfGrades != other.actualNumberOfGrades || grades.length != other.grades.length) {
			return false;
		}
		for (int i=0; i<actualNumberOfGrades; i++) {
			if (grades[i] != other.grades[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean islegalGrade(int grade) {
		for (int i=0; i<LEGAL_GRADES.length; i++) {
			if (LEGAL_GRADES[i] == grade) {
				return true;
			}
		}
		return false;
	}
}
