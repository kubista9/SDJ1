public class VehicleList {
	private int size;
	private Car[] list;

	public VehicleList(int maxSize) {
		this.list = new Car[maxSize];
		this.size = 0;
	}

	public int size() {
		return list.length;
	}

	public boolean isFull() {
    return size() == list.length;
  }

	public void addVehicle(Car vehicle) {
		if (!isFull())
			list[size] = vehicle;
			size++;
	}

	public void remove(Car vehicle) {
		int position = 0;
		for (int i = 0; i < size(); i++) {
			if (list[i].equals(vehicle)) {
				position = i;
			}
		}

		for (int i = position; i < size(); i++) {
			list[i] = list[i + 1];
		}
		size--;
	}

	public Car get(int index) {
		return list[index];
	}

	public int getNumberOfCarsByMake(String make){
		int carsByMake = 0;
		for (int i = 0; i < list.length; i++){
			if (list[i].getMake().equals(make)){
				carsByMake++;
			}
		}
		return carsByMake;
	}

	public int getNumberOfCarsWithManualGear(){
		int carsWithManualGear = 0;
		for (int i = 0; i < list.length; i++){
			if (list[i].hasManualGear() == true){
				carsWithManualGear++;
			}
			carsWithManualGear++;
		}
		return carsWithManualGear;
	}

	public int getNumberOfDieselCars(){
		int dieselCars = 0;
		for (int i = 0; i < list.length; i++){
			if (list[i].getEngine().isDiesel() == true){
				dieselCars++;
			}
		}
		return dieselCars;
	}

	public Car[] getCarsByMake(String make) {
		int index = 0;
		Car[] carsByMake = new Car[getNumberOfCarsByMake(make)];

		for (int i = 0; i < size(); i++) {
			if (list[i].getMake().equals(make)) {
				carsByMake[index] = list[i];
				index++;
			}
		}
		return carsByMake;
	}

	public Car[] getCarsByGearType(boolean manualGear){
		int index = 0;
		Car[] carsByGearType;
		if (manualGear == true) {
			carsByGearType = new Car[getNumberOfCarsWithManualGear()];
			for (int i = 0; i < size(); i++) {
				if (list[i].hasManualGear()) {
					carsByGearType[index] = list[i];
					index++;
				}
			}
		}
		else {
			carsByGearType = new Car[size() - getNumberOfCarsWithManualGear()];
			for (int i = 0; i < size(); i++) {
				if (!list[i].hasManualGear()) {
					carsByGearType[index] = list[i];
					index++;
				}
			}
		}
		return carsByGearType;
	}

	public Car getFirstCarByHorsePower(int minHorsePower) {

		for (int i = 0; i < size(); i++) {
			if (list[i].getEngine().getHorsePower() >= minHorsePower){
				return list[i];
			}
		}
		return null;
	}
}
