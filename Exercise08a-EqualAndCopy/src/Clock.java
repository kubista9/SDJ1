public class Clock {
	private int hour, minute, second;

	public Clock(int hour, int minute, int second) {
		set(hour, minute, second);
	}

	public Clock(int seconds) {
		set(seconds/3600, (seconds-hour*3600)/60, seconds-(second*3600)-minute*60 );
	}

	public void set (int hour, int minute, int second) {

		if (hour <= 0 && hour > 24) {
			System.out.println("Error!");
		}

		else {
			this.hour = hour;
		}

		if (minute <= 0 && minute > 60) {
			System.out.println("Error!");
		}
		else {
			this.minute = minute;
		}

		if (second <= 0 && second > 60) {
			System.out.println("Error!");
		}
		else {
			this.second = second;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public int getTimeInSeconds() {
		return hour*3600 + minute*60 + second;
	}

	public void tic(){
		second++;

		if(second==60){
			second=0;
			++minute;
		}
		if(minute==60){
			minute=0;
			++hour;
		}

		if(hour==24){
			hour=0;
			minute=0;
			second=0;
		}
	}

	public boolean isBefore (Clock clock) {
		if (clock.getHour() > hour) {
			return false;
		}
		else if (clock.getHour() < hour) {
			return true;
		}
		else {
			if (clock.getMinute() > minute) {
				return false;
			}
			else if (clock.getMinute() < minute) {
				return true;
			}
			else if (clock.getMinute() == minute) {
				if (clock.getSecond() > second) {
					return false;
				}
				else if (clock.getSecond() > second) {
					return true;
				}
				else {
					return false;
				}

			}

		}
		return false;
	}

	public Clock timeTo (Clock clock) {
		int timeTo = clock.getTimeInSeconds() - this.getTimeInSeconds();
		if (timeTo < 0) {
			timeTo = 86400 + timeTo;
		}
		clock = new Clock(timeTo);
		return clock;
	}

	public String getSimpleTime() {
		String clock1;

		if (hour < 10) {
			clock1 = "0" + (hour);
		} else {
			clock1 = "" + hour;
		}
		if (minute < 10) {
			clock1 += ":0" + minute;
		} else {
			clock1 += ":" + minute;
		}
		if (second < 10) {
			clock1 = clock1 + ":" + second;
		} else {
			clock1 += ":" + second;
		}

		return clock1;
	}

	@Override
	public String toString() {
		String clock1;

		if (hour < 10) {
			clock1 = "0" + (hour);
		} else {
			clock1 = "" + hour;
		}
		if (minute < 10) {
			clock1 += ":0" + minute;
		} else {
			clock1 += ":" + minute;
		}
		if (second < 10) {
			clock1 += ":0" + second;
		} else {
			clock1 += ":" + second;
		}
		return clock1;
	}

	public boolean equals(Object obj) {
		if (obj== null || getClass() != obj.getClass()){
			return false;
		}
		Clock other = (Clock)obj;
		return  hour==other.hour && minute==other.minute && second==other.second;
	}

	public Clock copy(){
		return new Clock(hour, minute,second);
	}

}

