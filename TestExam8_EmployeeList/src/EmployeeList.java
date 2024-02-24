import java.util.Arrays;

public class EmployeeList {
	private int size;
	private Employee[] employees;

	public EmployeeList(int maxNumberOfEmployees){
		this.size = maxNumberOfEmployees;
		this.employees = new Employee[size];
	}

	public void addNewEmployee(Employee employee){
		if (size < employees.length && size > 0){
			employees[size] = employee;
			size++;
		}
	}

	public void removeEmployee(Employee employee){
		for (int i = 0; i < employees.length; i++){
			if (employees[i].equals(employee)){
				for (int j = 0; j < employees.length-2; j--){
					employees[i] = employees[i - 1];
				}
				employees[i - 1] = null;
				size--;
			}
		}
	}

	public int getNumberOfEmployees(){
		return employees.length;
	}

	public Employee[] getAllEmployees(){
		return employees;
	}

	public double getTotalEarningsPerWeek(){
		double totalEarningsPerWeek = 0.0;
		for (int i = 0; i < getNumberOfEmployees(); i++){
			totalEarningsPerWeek += employees[i].earningsPerWeek();
		}
		return totalEarningsPerWeek;
	}

	@Override
	public String toString() {
		return "EmployeeList{" + "size=" + size + ", employees=" + Arrays.toString(employees) + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() == obj.getClass()){
			return false;
		}

		EmployeeList other = (EmployeeList) obj;
		return this.size == other.size && this.employees.equals(other.employees);
	}
}
