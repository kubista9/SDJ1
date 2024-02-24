public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int day, int month, int year) {
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

	public Date Copy(){
		Date other = new Date(getDay(), getMonth(), getYear());
		return other;
	}

	@Override
	public String toString() {
		return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Date other = (Date) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
}
