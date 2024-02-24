import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter make: ");
		String make = input.next();

		System.out.println("Enter model:");
		String model = input.next();

		System.out.println("Enter color");
		String color = input.next();

		System.out.println("Enter manual gear yes/no:");
		boolean manualGear = input.nextBoolean();

		System.out.println("Enter type");
		String type = input.next();

		System.out.println("Enter horse power");
;		int horsePower = input.nextInt();

		System.out.println("Enter volume");
		int volume = input.nextInt();

		System.out.println("Enter is diesel?  T/F");
		boolean isDiesel = input.nextBoolean();

		Engine engine1 = new Engine(type, horsePower, volume, isDiesel);
		Car car1 = new Car (make, model, color, manualGear, engine1);

		System.out.println(engine1.toString());
		System.out.println(car1.toString());

	}
}
