import java.util.Scanner;

public class MyDateTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter day: ");
		int day = input.nextInt();

		System.out.println("Enter month:");
		int month = input.nextInt();

		System.out.println("Enter year");
		int year = input.nextInt();

		MyDate date1 = new MyDate(day, month, year);

		System.out.println("Day is: " + date1.getDay());
		System.out.println("Month is: " + date1.getMonth());
		System.out.println("Year is: "+ date1.getYear());
		System.out.println(date1.toString());

		date1.set(3, 4, 5);
		System.out.println(date1.getDay());
		System.out.println(date1.getMonth());
		System.out.println(date1.getYear());
		System.out.println(date1.toString());

	}
}

