import java.util.Scanner;

public class EngineTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter type: ");
		String type = input.nextLine();

		System.out.println("Enter horse power");
		int horsePower = input.nextInt();

		System.out.println("Enter volume in m3");
		int volume = input.nextInt();

		System.out.println("Is the engine petrol?");
		boolean isDiesel = input.nextBoolean();

		Engine engine1 = new Engine(type, horsePower, volume);
		Engine engine2 = new Engine(type, horsePower, volume, isDiesel);

		System.out.println(engine1.toString());


	}

}
