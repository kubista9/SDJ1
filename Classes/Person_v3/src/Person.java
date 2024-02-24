
import static java.lang.Character.compare;

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

	public String getStatus() {
		if (age > 0)
			if (compare(getGender(),'M') == 0 || compare(getGender(),'m') == 0)
				if (age < 18)
					return "Boy";
					else return "Man";
					else if (age < 18)
						return "Girl";
					else return "Woman";
					return "Error";
	}
}


