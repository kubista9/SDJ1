package model;

public class GradeListModelManager implements GradeListModel {

	private GradeList gradeList;
	@Override
	public int numberOfGrades() {
		return gradeList.size();
	}

	@Override
	public void addGrade(int grade, String course) {
		gradeList.addGrade(new Grade(grade, course));
	}

	@Override
	public void removeGrade(int index) {
		gradeList.removeGrade(index);
	}

	@Override
	public Grade getGrade(int index) {
		return gradeList.getGrade(index);
	}

	@Override
	public Grade getMaxGrade() {
		return gradeList.getMaxGrade();
	}

	@Override
	public Grade getMinGrade() {
		return gradeList.getMinGrade();
	}

	@Override
	public double getAverage() {
		return getAverage();
	}

	@Override
	public String getAll() {
		return gradeList.toString();
	}
}
