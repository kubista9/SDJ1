public class Rectangle {
	private double lenght, width;

	public Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}

	public void setLenght(double lenght) {

		this.lenght = lenght;
	}

	public void setWidth(double width) {

		this.width = width;
	}

	public void set(double lenght, double width) {

		this.lenght = lenght;
		this.width = width;
	}

	public double getLenght() {

		return lenght;
	}

	public double getWidth() {

		return width;
	}

	public double getArea() {

		return lenght * width;
	}

}
