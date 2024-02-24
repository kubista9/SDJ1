public abstract class Rectangle extends TwoDimensionalShape {
	private double width, height;

	public Rectangle(double x, double y, double width, double height ){
		super(x , y);
		this.height = height;
		this.width = width;

	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setSides(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		return width * height;
	}
}

