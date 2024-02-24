import java.util.Scanner;

public class AddressTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter town:");
		String town = input.nextLine();

		System.out.println("Enter street:");
		String street = input.nextLine();

		System.out.println("Enter number:");
		int number = input.nextInt();
		input.nextLine();

		System.out.println("Enter letter:");
		String line = input.nextLine();
		char letter = line.charAt(0);

		System.out.println("Enter floor:");
		int floor = input.nextInt();
		input.nextLine();

		System.out.println("Enter door:");
		String door = input.nextLine();

		Adress address1 = new Adress(town, street, number, letter, floor, door );
		System.out.println(address1.toString());

	}

}
