public class MyDate {
	private int day, month, year;

	MyDate(int day, int month, int year) {
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

	public String getAstroSign() {

//		January
		if (month == 1) {
			if (day >= 20)
				return "Aquarius";
			else return "Capricon";
		}

//		February
		else if (month == 2) {
			if (day >= 19)
				return "Pisces";
			else return "Aquarius";
		}

//		march
		else if (month == 3) {
			if (day >= 21)
				return "Aries";
			else return "Pisces";
		}

//		April
		else if (month == 4) {
			if (day >= 20)
				return "Taurus";
			else return "Aries";
		}

//		May
		else if (month == 5) {
			if (day >= 21)
				return "Gemini";
			else return "Taurus";
		}

//		June
		else if (month == 6) {
			if (day >= 21)
				return "Cancer";
			else return "Gemini";
		}

//		July
		else if (month == 7) {
			if (day >= 23)
				return "Leo";
			else return "Cancer";
		}
//		August
		else if (month == 8) {
			if (day >= 23)
				return "Virgo";
			else return "Leo";
		}

//		September
		else if (month == 9) {
			if (day >= 23)
				return "Libra";
			else return "Virgo";
		}

//		October
		else if (month == 10) {
			if (day >= 23)
				return "Scorpio";
			else return "Libra";
		}

//		November
		else if (month == 11) {
			if (day >= 22)
				return "Sagittarius";
			else return "Scorpio";
		}

//		December
		else if (month == 12) {
			if (day >= 22)
				return "Capricorn";
			else return "Sagittarius";
		}
		else return "Error!";

	}

	public String getAstroElement() {
		String sign = getAstroSign();

		if ((sign.equals("Aries")) || (sign.equals("Leo")) || (sign.equals("Sagittarius")) ) {
			return "Element is fire";
		}

		else if ((sign.equals("Taurus")) || (sign.equals("Virgo")) || (sign.equals("Capricon")) ) {
			return "Element is Earth";
		}

		else if ((sign.equals("Cancer")) || (sign.equals("Scorpio")) || (sign.equals("Pisces")) ) {
			return "Element is Water";
		}

		else return "Element is Air";

	}

	public String toString() {
		String all = day + "/" + month + "/" + year;
		return all;
	}
}
