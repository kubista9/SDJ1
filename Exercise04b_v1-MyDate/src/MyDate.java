public class MyDate {
	private int day, month, year;

	public MyDate(int day, int month, int year) {
		set(day, month, year);
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

	public String toString() {
		String all = day + "/" + month + "/" + year;
		return all;
	}
}
