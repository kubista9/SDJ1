public class Employee extends Person{
	private String role;
	private int salary;

	public Employee(String name, int SSN, String role, int salary){
		super(name, SSN);
		this.role = role;
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return "Person" + super.toString() + "Role: " + role + "Salary: " +salary;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Employee other = (Employee) obj;
		return super.equals(obj) && role.equals(other.role) && salary == other.salary;
	}
}
