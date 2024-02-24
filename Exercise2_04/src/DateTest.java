import rentalcompany.model.*;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {

//		F
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day ");
		int day = input.nextInt();
		System.out.println("Enter month");
		int month = input.nextInt();
		System.out.println("Enter year");
		int year = input.nextInt();
		input.nextLine();   //safe to do after inputing an int

//      G
		MyDate date1 = new MyDate(day, month, year);

//		H
		System.out.println(date1);		//this is just a reference
		System.out.println(date1.toString());  //this one is better

//		I
		System.out.println("Enter how many days you want to step forward");
		int days = input.nextInt();

//		J
//		Hint: to call a void method (not returning anything) you cannot store it in a variable
//		or put it in a print statement, instead do something like the following:

		date1.stepForward(17);

//		public static void StepForward()  //static means it is for the class not for the object

	}
}

