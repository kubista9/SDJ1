//A
//public class Person {
//	private String name;
//	private int age;
//	private char gender;
//
//	public Person (String name, int age, char gender)
//	{
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
//
//	public String getName()
//	{
//		return this.name;
//	}
//
//	public int getAge()
//	{
//		return this.age;
//	}
//
//	public char getGender()
//	{
//		return this.gender;
//	}
//}

//B
//public class Person {
//	private String name;
//	private char gender;
//	private int age;
//
//
//	public Person (String name, int age, char gender)
//	{
//		this.name = name;
//		this.age = 0;
//		this.gender = gender;
//	}
//
//	public String getName()
//	{
//		return this.name;
//	}
//
//	public char getGender()
//	{
//		return this.gender;
//	}
//
//	public int getAge()
//	{
//		return this.age;
//	}
//}

//C
//public class Person {
//	private String name;
//	private char gender;
//	private int age;
//
//
//	public Person (String name, int age, char gender)
//	{
//		this.name = null;
//		this.age = 0;
//		this.gender = gender;
//	}
//
//	public String getName()
//	{
//		return this.name;
//	}
//
//	public char getGender()
//	{
//		return this.gender;
//	}
//
//	public int getAge()
//	{
//		return this.age;
//	}
//}

// D
//public class Person {
//	private String name;
//	private char gender;
//	private int age;
//
//
//	public Person (String name, int age, char gender)
//	{
//		this.name = name;
//		this.age = 0;
//		this.gender = gender;
//	}
//
//	public String getName()
//	{
//		return this.name;
//	}
//
//	public char getGender()
//	{
//		return this.gender;
//	}
//
//	public int getAge()
//	{
//		return this.age;
//	}
//}

//D and E
public class Person {

	private String name;
	private char gender;
	private int age;

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

	// F:

	public String toString()
	{
		String all = name + ", Age " + age + gender;
		return all;
	}
}


