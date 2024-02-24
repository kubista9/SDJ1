public class Job {
	private String title;
	private double salary;
	private Person employee;

	public Job(String title, double salary, Person employee ) {
		this.title = title;
		this.salary = salary;
		this.employee = employee;
	}

	public Job(String title, double salary) {
		this.title = title;
		this.salary = salary;
		this.employee = null;
	}

	public String getTitle() {
		return title;
	}

	public double getSalary() {
		return salary;
	}

	public Person getEmployee() {
		return employee;
	}

	public boolean isAvailable() {
		if (employee.equals(null)) {
			return true;
		}
		return false;
	}

	public void hire(Person employee) {
		this.employee = employee;
	}

	public void fire(Person employee) {
		this.employee = null;
	}

	public String toString() {
		return "Person" + employee + "title: " + title + "salary: " + salary;
	}

	@Override public boolean equals(Object obj)
	{
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Job other = (Job)obj;
		return title.equals(other.title) && salary == other.salary && employee.equals(other.employee);
	}



}
