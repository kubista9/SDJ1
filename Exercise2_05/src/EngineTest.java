import rentalcompany.model.*;

import java.util.Scanner;

public class EngineTest {
	public static void main(String[] args) {

//		A
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String type = scanner.nextLine();

//		B
		System.out.println("Enter a integer: ");
		int horsePower = scanner.nextInt();

//		C
		System.out.println("Enter a integer: ");
		int volume = scanner.nextInt();

		System.out.println("Enter if it is a diesel");
		boolean diesel = scanner.nextBoolean();

		Engine engine1 = new Engine(type, horsePower, volume, false);
		System.out.println(engine1);

	}
}
