public class Van extends Car{
	private int maxLoad;

	public Van(String theOwner, double thePrice, String regNo, int maxLoad){
		super(theOwner, thePrice, regNo);
		this.maxLoad = maxLoad;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	@Override
	public String toString() {
		return "Car" + super.toString() + "Maximum load" + maxLoad;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Van other = (Van) obj;
		return super.equals(obj) && maxLoad == other.maxLoad;
	}
}
