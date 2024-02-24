public class GradeList
{
	private int[] grades;
	private int actualNumberOfGrades;
	public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

	public GradeList(int maxNumberOfGrades)
	{
		this.grades = new int[maxNumberOfGrades];
		this.actualNumberOfGrades = 0;
	}

	public int size()
	{
		return actualNumberOfGrades;
	}

	public void addGrade(int grade)
	{
		if(isLegalGrade(grade))
		{
			if (actualNumberOfGrades < grades.length)
			{
				grades[actualNumberOfGrades] = grade;
				actualNumberOfGrades++;
			}
		}
	}

	public void addGrade(int index, int grade)
	{
		for(int i = actualNumberOfGrades-1;i > index;i--)
		{
			grades[i] = grades[i-1];
		}
		grades[index] = grade;
		actualNumberOfGrades++;
	}

	public void removeGrade(int index)
	{
		for(int i = index;i < actualNumberOfGrades-1;i++)
		{
			grades[i] = grades [i+1];
		}
		actualNumberOfGrades--;
	}

	public int getGrade(int index)
	{
		if(index >= 0 && index < actualNumberOfGrades)
		{
			return grades[index];
		}
		return -1;
	}

	public int getMaxGrade()
	{
		if(actualNumberOfGrades < 1)
		{
			return -1;
		}
		int max = grades[0];
		for(int i = 1;i < actualNumberOfGrades;i++)
		{
			if(grades[i] > max)
			{
				max = grades[i];
			}
		}
		return max;
	}

	public int getMinGrade()
	{
		if(actualNumberOfGrades < 1)
		{
			return -1;
		}
		int min = grades[0];
		for(int i = 1;i < actualNumberOfGrades;i++)
		{
			if(grades[i] < min)
			{
				min = grades[i];
			}
		}
		return min;
	}

	public double getAverage()
	{
		int sum = 0;
		double avg = 0;
		for(int i = 0;i < actualNumberOfGrades;i++)
		{
			sum = sum + grades[i];
		}
		avg = (double) sum/actualNumberOfGrades;
		return avg;
	}

	public int getGradeCount(int grade)
	{
		int count = 0;
		for(int i = 0;i < actualNumberOfGrades;i++)
		{
			if(grades[i] == grade)
			{
				count++;
			}
		}
		return count;
	}

	public String getGradeDistribution()
	{
		String s = "{";
		int count = 0;
		for(int i = 0;i < LEGAL_GRADES.length;i++)
		{
			s += LEGAL_GRADES[i] + " (" + getGradeCount(LEGAL_GRADES[i]) + ") ";
			if(i < LEGAL_GRADES.length-1)
			{
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
			s += grades[i];
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
		if(actualNumberOfGrades != other.actualNumberOfGrades || grades.length != other.grades.length)
			return false;
		for(int i = 0;i < actualNumberOfGrades;i++)
		{
			if(grades[i] != other.grades[i])
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isLegalGrade(int grade)
	{
		for(int i = 0;i < LEGAL_GRADES.length;i++)
		{
			if(LEGAL_GRADES[i] == grade)
			{
				return true;
			}
		}
		return false;
	}
}
