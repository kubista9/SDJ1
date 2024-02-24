import java.util.ArrayList;

public class GradeList
{
	private ArrayList<Grade> grades;
	private int actualNumberOfGrades;
	public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};
	private int maxNumberOfGrades;

	public GradeList(int maxNumberOfGrades) {
		this.grades = new ArrayList<>();
		this.actualNumberOfGrades = 0;
		this.maxNumberOfGrades = maxNumberOfGrades;
	}

	public int size()
	{
		return actualNumberOfGrades;
	}

	public void addGrade(Grade grade) {
		grades.add(grade);
	}

	public void addGrade(int index, Grade grade) {
		for(int i = index; i < actualNumberOfGrades-1; i++) {
			if (grades.size() < maxNumberOfGrades) {
				grades.add(index, grade);
			}
		}
	}

	public void removeGrade(int index) {
		grades.remove(index);
	}

	public Grade getGrade(int index) {
		return grades.get(index);
	}

	public int getMaxGrade() {
		int max = grades.get(0).getGrade();
		for (int i = 1; i < grades.size(); i++) {
			if (grades.get(i).getGrade() > max) {
				max = grades.get(i).getGrade();
			}
		}
		return max;
	}

	public int getMinGrade() {
		int min = grades.get(0).getGrade();
		for (int i = 1; i < grades.size(); i++) {
			if (grades.get(i).getGrade() < min) {
				min = grades.get(i).getGrade();
			}
		}
		return min;
	}

	public double getAverage() {
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < actualNumberOfGrades; i++) {
			sum += grades.get(i).getGrade();
		}
		avg = (double) sum/actualNumberOfGrades;
		return avg;
	}

	public int getGradeCount(int grade)
	{
		int count = 0;
		for(int i = 0;i < actualNumberOfGrades;i++) {
			if(grades.get(i).getGrade() == grade) {
				count++;
			}
		}
		return count;
	}

	public String getGradeDistribution()
	{
		String s = "{";
		int count = 0;
		for(int i = 0;i < LEGAL_GRADES.length;i++) {
			s += LEGAL_GRADES[i] + " (" + getGradeCount(LEGAL_GRADES[i]) + ") ";
			if(i < LEGAL_GRADES.length-1) {
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	@Override
	public String toString()
	{
		String s = "{";
		for(int i = 0;i < actualNumberOfGrades;i++)
		{
			s += grades.get(i);
			if(i < actualNumberOfGrades-1)
			{
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj == null || getClass() != obj.getClass())
			return false;
		GradeList other = (GradeList) obj;
		if(actualNumberOfGrades != other.actualNumberOfGrades || grades.size() != other.grades.size())
			return false;
		for(int i = 0;i < actualNumberOfGrades;i++) {
			if(grades.get(i) != other.grades.get(i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isLegalGrade(int grade)
	{
		for(int i = 0;i < LEGAL_GRADES.length;i++) {
			if(LEGAL_GRADES[i] == grade) {
				return true;
			}
		}
		return false;
	}
}
