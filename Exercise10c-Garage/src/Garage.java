public class Garage {
	private Car atPosition0;
	private Car atPosition1;

	public Garage() {
		this.atPosition0 = null;
		this.atPosition1 = null;
	}

	public boolean isParkingAreaTaken(int position) {
		if (position == 0 && atPosition0 != null) {
			return true;
		}
		if (position == 1 && atPosition1 != null) {
			return true;
		}
		else return false;
	}

	public void park(Car car, int position) {
		if (atPosition1.equals(null)) {
			atPosition1.equals(car);
		}
		if (atPosition0.equals(null)) {
			atPosition0.equals(car);
		}
	}

	public Car takeACarRide(int position) {
		if (atPosition1.equals(null)) {
			return null;
		}
		if (atPosition0.equals(null)) {
			return null;
		}
		return null;
	}
}
