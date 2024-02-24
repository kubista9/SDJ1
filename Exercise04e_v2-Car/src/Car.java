public class Car {
	private String make, model, color;
	private boolean manualGear;
	private Engine engine;

	Car (String make, String model, String color, boolean manualGear, Engine engine) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.manualGear = manualGear;
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getHorsePower() {
		return engine.getHorsePower();
	}

	public boolean hasManualGear() {
		return manualGear;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "Make: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Engine: " + engine;
	}
}
