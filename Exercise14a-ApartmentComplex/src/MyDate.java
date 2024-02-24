import java.time.LocalDate;

public class MyDate {
	private int day, month, year;

	public MyDate ( int day, int month, int year) {
		set(day, month, year);
	}

	public MyDate() {
		LocalDate now = LocalDate.now();
		this.day = now.getDayOfMonth();
		this.month = now.getMonthValue();
		this.year = now.getYear();
	}
	public void set(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public MyDate copy() {
		MyDate myDate1 = new MyDate(day, month, year);
		return myDate1;
	}

	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		MyDate other = (MyDate)obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}






}
