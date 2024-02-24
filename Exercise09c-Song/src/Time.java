public class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second){
		this(hour * 3600 + minute * 60 + second);
	}
	public Time(int timeInSeconds){
		if (timeInSeconds < 0){timeInSeconds = 0;
		}
		this.hour = timeInSeconds / 3600;
		this.minute = (timeInSeconds % 3600) / 60;
		this.second = (timeInSeconds % 3600) % 60;
	}
	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	public int getTimeInSeconds(){
		return hour*3600 + minute*60 + second;
	}

	public String toString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
