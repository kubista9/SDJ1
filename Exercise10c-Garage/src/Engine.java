public class Engine {
	private String type;
	private int horsePower, volume;
	private boolean isDiesel;

	Engine(String type, int horsePower, int volume, boolean isDiesel) {
		this.type = type;
		this.horsePower = horsePower;
		this.volume = volume;
		this.isDiesel = isDiesel;
	}

	Engine(String type, int horsePower, int volume) {
		this.type = type;
		this.horsePower = horsePower;
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getIsDiesel() {
		return isDiesel;
	}

	public String toString() {
		return "Type = " + type + "\n" + "Horsepower = " +  horsePower + "\n" + "Volume in m3 = " + volume + "\n" + "Is diesel? = " + isDiesel;
	}
}
