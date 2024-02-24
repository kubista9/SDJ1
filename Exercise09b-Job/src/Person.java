public class Person {
	private String name;
	private int age;
	private char gender;

	public Person(String name, int age, char gender) {
		setName(name);
		setGender(gender);
		setAge(age);
	}

	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
		this.age = 0;
	}

	public Person(char gender) {
		this.gender = gender;
		this.name = null;
		this.age = 0;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Name: " + name + "age:" + age + "gender:" + gender;
	}
}
