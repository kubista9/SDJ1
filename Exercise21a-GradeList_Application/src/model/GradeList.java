package model;

import java.util.ArrayList;

public class GradeList
{
	private ArrayList<Grade> grades;

	public GradeList()
	{
		this.grades = new ArrayList<>();
	}

	public int size()
	{
		return grades.size();
	}

	public void addGrade(Grade grade)
	{
		grades.add(grade);
	}

	public void addGrade(int index, Grade grade)
	{
		grades.add(index, grade);
	}

	public void removeGrade(int index)
	{
		grades.remove(index);
	}

	public void removeGrade(Grade grade)
	{
		grades.remove(grade);
	}

	public Grade getGrade(int index)
	{
		return grades.get(index);
	}

	public Grade getMaxGrade()
	{
		String course = null;
		int max = Grade.LEGAL_GRADES[Grade.LEGAL_GRADES.length - 1] - 1;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i).getGrade() > max)
			{
				max = grades.get(i).getGrade();
				course = grades.get(i).getCourse();
			}
		}
		return new Grade(max, course);
	}

	public Grade getMinGrade()
	{
		String course = null;
		int min = Grade.LEGAL_GRADES[0] + 1;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i).getGrade() < min)
			{
				min = grades.get(i).getGrade();
				course = grades.get(i).getCourse();
			}
		}
		return new Grade(min, course);
	}

	public double getAverage()
	{
		int sum = 0;

		for (int i = 0; i < grades.size(); i++)
		{
			sum += grades.get(i).getGrade();
		}
		double average = (double) sum / grades.size();
		return average;
	}

	public int getGradeCount(int grade)
	{
		int count = 0;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i).getGrade() == grade)
			{
				count++;
			}
		}
		return count;
	}

	public String getGradeDistribution()
	{
		String s = "{";
		for (int i = 0; i < Grade.LEGAL_GRADES.length; i++)
		{
			s += Grade.LEGAL_GRADES[i] + " (" + getGradeCount(Grade.LEGAL_GRADES[i])
					+ ")";
			if (i < Grade.LEGAL_GRADES.length - 1)
			{
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	public String toString()
	{
		String s = "{";
		for (int i = 0; i < grades.size(); i++)
		{
			s += grades.get(i);
			if (i < grades.size() - 1)
			{
				s += ", ";
			}
		}
		s += "}";
		return s;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof GradeList))
		{
			return false;
		}
		GradeList other = (GradeList) obj;
		if (grades.size() != other.grades.size())
		{
			return false;
		}
		for (int i = 0; i < grades.size(); i++)
		{
			if (!grades.get(i).equals(other.grades.get(i)))
			{
				return false;
			}
		}
		return true;
	}

	public boolean hasGrade(Grade grade)
	{
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i).equals(grade))
			{
				return true;
			}
		}
		return false;
	}
}
