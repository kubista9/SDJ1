public class Car {
	private String make, model, color;
	private boolean manualGear;

	Car (String make, String model, String color, boolean manualgear) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.manualGear = manualGear;
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

	public boolean hasManualGear() {
		return manualGear;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Make: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color;
	}
}
