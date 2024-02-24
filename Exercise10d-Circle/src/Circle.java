public class Circle {
	private double radius;
	private Point centerPoint;

	public Circle(double radius, Point centerPoint) {
		this.radius = radius;
		this.centerPoint = centerPoint;
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenterPoint() {
		return centerPoint;
	}

	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}

	public void moveTo(Point centerPoint){
		this.centerPoint = centerPoint;
	}

	@Override
	public String toString() {
		return "Circle{" + "radius=" + radius + ", centerPoint=" + centerPoint + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Circle other = (Circle)obj;
		return  radius == other.radius && centerPoint == other.centerPoint;
	}
}
