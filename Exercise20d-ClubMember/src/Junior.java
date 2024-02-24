public abstract class Junior extends ClubMember {
	private char gender;

	public Junior(String name, int age, char gender){
		super(name, age);
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

	public String toString(){
		return super.toString() + "Gender: " + gender;
	}

	public double getMembershipFee(){
		if(gender == 'F' || gender == 'f'){
			return 300.0;
		}
		else if (gender == 'M' || gender == 'm'){
			return 400.0;
		}
		return 00.000000;
	}
}
