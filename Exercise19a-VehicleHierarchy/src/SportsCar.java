public class SportsCar extends Car{
	private int maxVelocity;

	public SportsCar(String theOwner, double thePrice, String regNo, int maxVelocity){
		super(theOwner, thePrice, regNo);
		this.maxVelocity = maxVelocity;
	}

	public int getMaxVelocity(){
		return maxVelocity;
	}

	public String toString() {
		return "Car" + super.toString() + "Maximum velocity" + maxVelocity;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		SportsCar other = (SportsCar) obj;
		return super.equals(obj) && maxVelocity == other.maxVelocity;
	}
}
