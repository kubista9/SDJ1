public class Instructor {
	private String name;
	private int officeNumber;

	public Instructor(String name, int officeNumber) {
		this.name = name;
		this.officeNumber = officeNumber;
	}

	public String getName() {
		return name;
	}

	public int getOfficeNumber() {
		return officeNumber;
	}

	@Override
	public String toString() {
		return "Instructor{" + "name='" + name + '\'' + ", officeNumber=" + officeNumber + '}';
	}
}
