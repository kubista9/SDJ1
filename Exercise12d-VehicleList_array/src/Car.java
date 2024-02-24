public class Car {
	private String make;
	private String model;
	private boolean manualGear;
	private Engine engine;

	public Car(String make, String model, boolean manualGear, Engine engine) {
		this.make = make;
		this.model = model;
		this.manualGear = manualGear;
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public boolean hasManualGear() {
		return manualGear;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", manualGear=" + manualGear + ", engine=" + engine + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		}

		Car other = (Car) obj;
		return make.equals(other.make) && model.equals(other.model) && manualGear == other.manualGear && engine == other.engine;

	}
}
