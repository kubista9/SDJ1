public class Person {
	private String name;
	private int age;
	private char gender;

	public Person (String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public String toString()
	{
		String all = name + ", Age " + age + gender;
		return all;
	}

	public String getAgeStatus() {
		if (age < 0)
			return "Error";

		else if  (age <= 12)
			return "Child";

		else if  (age < 20)
			return "Teenager";

		else if  (age < 66)
			return "Adult";

		else
			return "Senior citizen";
	}
}


