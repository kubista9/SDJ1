public class Name {

//	A
	private String firstName, lastName;

//	B
	public Name(String firstName1, String lastName1) {
		this.firstName = firstName1;
		this.lastName = lastName1;
	}

//	C
	public String getFirstName() {   		//getters, I would not be able to access what is in private
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

//	D
	public String getFullName() {
		return firstName + lastName;
	}

//	E
	public String getFormalName() {
		return lastName + "," + firstName;
	}

	@Override
	public String toString() {
		return firstName + " " +lastName;
	}
}

