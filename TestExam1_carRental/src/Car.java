public abstract class Car {
	private String licenseNo;
	private double price;
	private Customer rentTo;

	public Car(String licenceNo, double price){
		this.licenseNo = licenceNo;
		this.price = price;
		this.rentTo = rentTo;
	}

	public String getLicenseNo(){
		return licenseNo;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public abstract String getType();

	public Customer getRentedTo(){
		return rentTo;
	}

	public void setRentedTo(Customer customer){
		this.rentTo = customer;
	}

	public boolean isAvailable(){
		if (getRentedTo() == null){
			return true;
		}
		else return false;
	}
}
