import java.util.Scanner;

public class MyDateTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter day");
		int day = input.nextInt();
		input.nextLine();

		System.out.println("Enter month");
		int month = input.nextInt();
		input.nextLine();

		System.out.println("Enter year");
		int year = input.nextInt();
		input.nextLine();

		MyDate myDate1 = new MyDate(day, month, year);

		System.out.println("To string" + myDate1.toString());
		System.out.println("Astro sign" + myDate1.getAstroSign());
		System.out.println("Element is" + myDate1.getAstroElement());


	}
}
