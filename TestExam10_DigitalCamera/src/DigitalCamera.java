public abstract class DigitalCamera extends Camera {
	private double megapixels;
	private int maxNumberOfImages;


	public DigitalCamera(Manufacturer manufacturer, double megapixels, int maxNumberOfImages){
		super(manufacturer);
		this.megapixels = megapixels;
		this.maxNumberOfImages = maxNumberOfImages;
	}

	public void takeAPicture(){
		maxNumberOfImages++;
	}
}
