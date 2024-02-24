import rentalcompany.model.*;

public class DataTest {
	public static void main (String[] args) {

//      A-F
//		MyDate dateForFirstJavaRelease= new MyDate(23, 1, 1996);
//		System.out.println("Java 1st date: "+ dateForFirstJavaRelease);
//
//		MyDate date1= new MyDate(23, 1, 1996);
//		MyDate today= new MyDate();    // today’s date
//		int days = date1.daysBetween(today);     //  calling a method
//		System.out.println("Days since first Java release: "+ days);


//		G
		MyDate theDayIWasBorn = new MyDate(30, 10, 2001);
		System.out.println("I am was born on "+ theDayIWasBorn);

		MyDate date1 = new MyDate(30, 10, 2001);
		MyDate today = new MyDate();    // today’s date
		int days = date1.daysBetween(today);     //  calling a method
		System.out.println("I am "+ days/365);

	}
}
