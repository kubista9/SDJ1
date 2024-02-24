public abstract class HourlyEmployee extends Employee{
	private double wagePerHour;
	private double hoursWorkedPerWeek;

	public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek){
		super(name, birthday);
		this.wagePerHour = wagePerHour;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public double getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}

	public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public double earningsPerWeek(){
		double earningsPerWeek = getWagePerHour() * getHoursWorkedPerWeek();
		return earningsPerWeek;
	}

	@Override
	public String toString() {
		return super.toString() + "HourlyEmployee{" + "wagePerHour=" + wagePerHour + ", hoursWorkedPerWeek=" + hoursWorkedPerWeek + '}';
	}

	public boolean Equals(Object obj){
		if (obj == null | getClass() != obj.getClass()){
			return false;
		}

		HourlyEmployee other = (HourlyEmployee) obj;
		return super.equals(other) && this.wagePerHour == other.wagePerHour && this.hoursWorkedPerWeek == other.hoursWorkedPerWeek;
	}
}
