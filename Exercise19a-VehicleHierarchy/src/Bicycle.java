public class Bicycle extends Vehicle {
	private int gears;

	public Bicycle(String theOwner, double price, int numberOfGears){
		super(theOwner, price);
		this.gears = numberOfGears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return "Car" + super.toString() + "number of gears" + gears;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Bicycle other = (Bicycle) obj;
		return super.equals(obj) && gears == other.gears;
	}
}
