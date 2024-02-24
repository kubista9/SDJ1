public class Course {
	private String title;
	private TextBook textBook1;
	private TextBook textBook2;
	private Instructor instructor;   //if it was composition i have to do a copy method not here but in the other classes

	public Course(String title, TextBook textbook1, Instructor instructor) {
		this.title = title;
		this.textBook1 = textBook1;
		this.textBook2 = null;
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public String getInstructorName() {
		return instructor.getName();
	}

	public TextBook getPrimaryTextBook() {
		return textBook1;
	}

	public TextBook getSecondaryTextBook() {
		return textBook2;
	}

	public void setSecondaryTextBook(TextBook textBook2) {
		this.textBook2 = (TextBook)textBook2;    //casting
	}

	public int getNumberOfTextBooks() {
		if (textBook2.equals(null)) {
			return 1;
		}
		return 2;
	}

	@Override
	public String toString() {
		return "Course{" +
				"title='" + title + '\'' +
				", textBook1=" + textBook1 +
				", textBook2=" + textBook2 +
				", instructor=" + instructor +
				'}';
	}
}
