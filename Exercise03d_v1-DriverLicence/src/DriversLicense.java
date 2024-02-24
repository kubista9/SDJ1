public class DriversLicense {
	private int number;
	private boolean permitForTruck, permitForBus;

	DriversLicense (int number, boolean permitForTruck, boolean permitForBus) {
		this.number = number;
		this.permitForTruck = permitForTruck;
		this.permitForBus = permitForBus;
	}

	DriversLicense (int number, boolean permitForTruckAndBus) {
		this.number = number;
		this.permitForBus = permitForTruckAndBus;
		this.permitForTruck = permitForTruckAndBus;
	}

	DriversLicense(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public boolean hasPermitForDrivingTruck() {
		return permitForTruck;
	}

	public boolean hasPermitForDrivingBus() {
		return permitForBus;
	}

	@Override
	public String toString() {
		return "Number: " + " " + number + "\n " + "Has permit for bus"+ " " + permitForBus + "\n" + "Has permit for truck" + " " + permitForTruck;
	}
}
