public class Secretary extends Employee{
	private int yearsOfExperience;

	public Secretary(String name, int SNN,String role, int salary, int yearsOfExperience){
		super(name, SNN, role, salary);
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String toString() {
		return "Person" + super.toString() + "Years of experience" + yearsOfExperience;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Secretary other = (Secretary) obj;
		return super.equals(obj) && yearsOfExperience == other.yearsOfExperience;
	}
}
