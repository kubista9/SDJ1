public abstract class Senior extends ClubMember{

	private char gender;

	public Senior(String name, int age, char gender){
		super(name, age);
		this.gender = gender;
	}

	public String toString(){
		return super.toString() + "Gender" + gender;
	}

	public double getMembershipFee(){
		return 10 * (100 - getAge());
	}
}
