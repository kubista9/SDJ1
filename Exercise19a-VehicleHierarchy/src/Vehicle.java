public class Vehicle {
	private String owner;
	private double price;

	public Vehicle(String owner, double price){
		this.owner = owner;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public double getPrice() {
		return price;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car" + super.toString() + "Owner: " + owner + "Price: " + price;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Vehicle other = (Vehicle) obj;
		return super.equals(obj) && owner.equals(other.owner) && (price == other.price);
	}
}
