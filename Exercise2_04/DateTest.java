importrentalcompany.model.*;
public class DateTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a variable (DD/MM/YY): ");
		MyDate date1 = new MyDate(d,m,y);
		String str = scanner.nextLine();
		System.out.println("The date is: " + toString(MyDate));
		System.out.println("How many days you want to step forward: ");
		date1.stepForward();

	}
}
