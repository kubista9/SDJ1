import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 4;
		int sum = 0;
		for (int i = 0; i < count; i++) {
			System.out.println("Type an integer: ");
			int value = input.nextInt();
			sum += value;
		}
		double average = sum/(double)count;

		Clock clock1 = new Clock(sum);

		System.out.println("The total number of seconds " + sum);
		System.out.println("The average secons: " + average);
		System.out.println("The clock is: " + clock1);
	}
}
