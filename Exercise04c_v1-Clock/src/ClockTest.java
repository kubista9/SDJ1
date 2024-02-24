import java.util.Scanner;

public class ClockTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter hour: ");
		int hour = input.nextInt();

		input.nextLine();

		System.out.println("Enter minute:");
		int minute = input.nextInt();

		input.nextLine();

		System.out.println("Enter second");
		int second = input.nextInt();

		input.nextLine();

		Clock clock1 = new Clock (hour, minute, second);

		System.out.println("Hour = " + clock1.getHour());
		System.out.println("Minute = " + clock1.getMinute());
		System.out.println("Second = " + clock1.getSecond());
		System.out.println("Time in seconds = " + clock1.getTimeInSeconds());
		System.out.println("To string " + clock1.toString());
		clock1.set(1,2,3);
		System.out.println(clock1.toString());
		System.out.println(clock1.getSimpleTime());



	}
}
