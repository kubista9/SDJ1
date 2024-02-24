public class Name {

//	A
	private String firstName, lastName;    //instance variables

//	B
	public Name(String firstName1, String lastName1) {    //constructor || "Name" is because the public class is Name
		this.firstName = firstName1;					   //initializing all instanca variable
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

