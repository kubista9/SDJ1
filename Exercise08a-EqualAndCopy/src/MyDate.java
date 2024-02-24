public class MyDate {
	private int day, month, year;

	public MyDate(int day, int month, int year) {
		set(day, month, year);
	}

	public MyDate() {
		LocalDate today = LocalDate.now();          //c) last question??
		this.day = today.getDayOfMonth();
		this.month = today.getMonthValue();
		this.year = today.getYear();
	}

	public void set(int day, int month, int year) {
		if (year < 1) {
			this.day = 1;
		}
		else if (month <1) {
			this.month = 1;
		}
		else if(month > 12) {
			this.month = 12;
		}
		else if (day < 1) {
			this.day = 1;
		}
		else if (day > this.numberOfDaysInMonth()) {
			this.day = numberOfDaysInMonth()-1;
		}
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

	public boolean isLeapYear() {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	public int numberOfDaysInMonth() {
		if (month == 2 ) {
			if (isLeapYear())
			return 29;
			else return 28;
		}
		if ( month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else return 31;
	}

//	SOLVING THIS USING A SWITCH

//	public int numberOfDaysInMonth() {
//		switch(month) {
//			case 4,6,9,11:         //not semicolon " ; " but colon " : "
//				return 30;
//			case 1,3,5,7,8,10,12:  //not semicolon " ; " but colon " : "
//				return 31;
//			case 2:
//				if (isLeapYear()) {return 29;}
//					else { return 28;
//				}
//		default:
//		return Integer.MIN_VALUE;
//		}
//
//	}

	public String getMonthName() {
		switch(month) {
			case 1:   return "January";
			case 2:   return "February";
			case 3:   return "March";
			case 4:   return "April";
			case 5:   return "May";
			case 6:   return "June";
			case 7:   return "July";
			case 8:   return "August";
			case 9:   return "September";
			case 10:  return "October";
			case 11:  return "November";
			case 12:  return "December";
			default:  return "";
		}
	}

	public void stepForwardOneDay()
	{
		switch(month){
			case 2: {
				if(day<28)    day++;
				else if(this.isLeapYear() && day<29)  day++;
				else{
					month++;
					day=1;
				}
				break;
			}
			case 1, 3, 5, 7, 8, 10: {
				if(day<31)  day++;
				else{
					month++;
					day=1;
				}
				break;
			}
			case 4,6,9,11:{
				if(day<30)  day++;
				else{
					month++;
					day=1;
				}
				break;
			}
			case 12:{
				if(day<31)  day++;
				else{
					year++;
					month=1;
					day=1;
				}
				break;
			}
			default:break;
		}
	}

	public boolean isBefore(MyDate date)
	{
		if(this.year<date.year)   return true;
		if(this.year>date.year)   return false;
		if(this.month<date.month) return true;
		if(this.month>date.month) return false;
		return this.day<date.day;
	}

	public int yearsBetween(MyDate date)
	{
		if(this.isBefore(date)==false){
			MyDate date2 = new MyDate(this.day, this.month, date.year);
			if (date.isBefore(date2) == true)
				return this.year - date.year;
			else
				return this.year - date.year - 1;
		}
		else
		{
			MyDate date2 = new MyDate(date.day, date.month, this.year);
			if (this.isBefore(date2) == true)
				return date.year - this.year;
			else
				return date.year - this.year - 1;
		}
	}

	public boolean equals(Object obj)
	{
		if(obj==null || getClass() != obj.getClass()) return false;
		MyDate other= (MyDate)obj;
		return day==other.day && month==other.month && year==other.year;
	}

	public MyDate copy()
	{
		MyDate other=new MyDate(day, month, year);
		return other;
	}

	public String toString()
	{
		String line="";
		if(day<10)  line+="0";
		line+=day+"/";
		if(month<10)line+="0";
		line+=month+"/";
		line+=year;
		return line;
	}


}























