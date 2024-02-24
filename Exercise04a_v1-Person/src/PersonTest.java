import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = input.nextLine();

		System.out.println("Enter age: ");
		int age = input.nextInt();

		input.nextLine();  //idk why

		System.out.println("Enter gender");
		String line = input.nextLine();
		char gender = line.charAt(0);

		Person person1 = new Person(name, age, gender);

		System.out.println("Name = " + person1.getName());
		System.out.println("Age = " + person1.getAge());
		System.out.println("Gender = " + person1.getGender());
		System.out.println(person1.toString());

		person1.setName("Jakub");
		person1.setAge(98);
		person1.setGender('M');
		System.out.println(person1);
	}
}
