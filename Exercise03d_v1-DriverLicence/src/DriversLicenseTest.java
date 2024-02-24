import java.util.Scanner;

public class DriversLicenseTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input number");
		int number = input.nextInt();

		System.out.println("Has permit for trucks?");
		boolean hasPermitFortrucks = input.nextBoolean();

		System.out.println("Has permit for buses?");
		boolean hasPermitForBuses = input.nextBoolean();

		DriversLicense driversLicense1 = new DriversLicense(number, hasPermitFortrucks, hasPermitForBuses);
		System.out.println(driversLicense1.toString());
	}
}
