public abstract class Employee {
	private String name;
	private Date birthday;

	public Employee(String name, Date birthday){
		this.name = name;
		this.birthday = birthday.Copy();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirhtday() {
		return birthday;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", birhtday=" + birthday +
				'}';
	}

	public abstract double earningsPerWeek();
}
