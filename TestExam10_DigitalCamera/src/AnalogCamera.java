public abstract class AnalogCamera extends Camera {

	public AnalogCamera(Manufacturer manufacturer){
		super(manufacturer);
	}

	public abstract void TakeAPicture();
}
