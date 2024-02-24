import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter start year: ");
		int startYear = input.nextInt();

		System.out.println("Enter end year: ");
		int endYear = input.nextInt();

		for (int i=startYear; i <= endYear; i++)
		{
			int year = i;
			MyDate mydate = new MyDate(0,0,year);
			if (mydate.isLeapYear() == true)
			{
				System.out.println(year);
			}
		}
	}
}
