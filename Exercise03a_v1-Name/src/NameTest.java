import java.util.Scanner;

public class NameTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name");
		String firstName = input.nextLine();

		System.out.println("Enter your last name");
		String lastName = input.nextLine();

		Name name1 = new Name(firstName, lastName);

		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(name1);
		System.out.println(lastName + " " + firstName);
	}
}
