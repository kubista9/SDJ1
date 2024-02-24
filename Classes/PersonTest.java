import java.util.Scanner;

public class PersonTest {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.print("Enter gender: ");
		String line = input.nextLine();
		char gender = line.charAt(0);

		System.out.print("Enter age: ");
		int age = input.nextInt();
		input.nextLine();

		Person person1 = new Person(name, gender, age);
		System.out.println("Name: " + person1.getName(), "Gender: " + person1.getGender(), "Age: " + person1.getAge());
	}
}
