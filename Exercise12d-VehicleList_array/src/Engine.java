public class Engine {
	private String type;
	private int horsePower, volume;
	private boolean isDiesel;

	public Engine(String type, int horsePower, int volume, boolean isDiesel) {
		this.type = type;
		this.horsePower = horsePower;
		this.volume = volume;
		this.isDiesel = isDiesel;
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

	public boolean isDiesel() {
		return isDiesel;
	}

	@Override
	public String toString() {
		return "Engine{" + "type='" + type + '\'' + ", horsePower=" + horsePower + ", volume=" + volume + ", isDiesel=" + isDiesel + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Engine other = (Engine) obj;
		return type.equals(other.type) && horsePower == other.horsePower && volume == other.volume && isDiesel == other.isDiesel;
	}
}
