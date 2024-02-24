public abstract class OldBoys extends ClubMember {
	private int yearsOfMembership;

	public OldBoys(String name, int age, int yearsOfMembership){
		super(name, age);
		this.yearsOfMembership = yearsOfMembership;
	}

	public int getYearsOfMembership() {
		return yearsOfMembership;
	}

	public void setYearsOfMembership(int yearsOfMembership) {
		this.yearsOfMembership = yearsOfMembership;
	}

	public String toString(){
		return super.toString() + "Years of membership: " + yearsOfMembership;
	}

	public double getMemberShipFee(){
		if (getYearsOfMembership() < 5){
			return 00000000.00000000;
		}
		else if (getYearsOfMembership() < 5){
			return 300.0;
		}
		else if (getYearsOfMembership() >= 5 || getYearsOfMembership() <= 9){
			return 200.0;
		}
		else return 100.00;
	}
}
