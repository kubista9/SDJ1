import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ValidationLoopTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int hour = 0;
		int minute = 0;
		int second = 0;

		while (true) {
			System.out.println("Enter hour in interval 1 an 23 included");
			hour = input.nextInt();
			input.nextLine();

			if (hour > 0 && hour < 24) {
				break;
			}
			System.out.println("Hour has to be between interval 1 an 23 included");
		}

		while (true) {
			System.out.println("Enter minute in interval 1 an 59 included");
			minute = input.nextInt();
			input.nextLine();

			if (minute > 0 && minute < 59) {
				break;
			}
			System.out.println("Minute has to be between interval 1 an 59 included");
		}

		while (true) {
			System.out.println("Enter second in interval 1 an 59 included");
			second = input.nextInt();
			input.nextLine();

			if (second > 0 && second < 59) {
				break;
			}
			System.out.println("Second has to be int interval between 1 an 59 included");
		}

		Clock clock = new Clock(hour,minute,second);
		System.out.println(clock);
	}
}
