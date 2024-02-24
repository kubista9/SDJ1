package model;

public class Time {
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time(int timeInSeconds) {
		this.hour = hour*3600;
		this.minute = minute*60;
		this.second = second*1;
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

	@Override
	public String toString() {
		return "Time{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
	}
}
