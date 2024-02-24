public abstract class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String name, Date birthday, double weeklySalary) {
		super(name, birthday);
		this.weeklySalary = weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}


}
