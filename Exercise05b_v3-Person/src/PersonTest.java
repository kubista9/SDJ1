import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter name");
		String name = input.next();

		System.out.println("Enter age");
		int age = input.nextInt();

		System.out.println("Enter gender");
		String line = input.next();
		char gender = line.charAt(0);

		Person person1 = new Person ( name, age, gender);

		System.out.println(person1.toString());
	}
}
