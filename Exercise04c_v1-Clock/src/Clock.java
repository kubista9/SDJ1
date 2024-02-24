public class Clock {
	private int hour, minute, second;

	public Clock(int hour, int minute, int second) {
		set(hour, minute, second);
	}

	public void set (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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

	public String toString() {
		return hour+":"+minute+":"+second;
	}

	public String getSimpleTime() {
		return hour+":"+minute;
	}
}
