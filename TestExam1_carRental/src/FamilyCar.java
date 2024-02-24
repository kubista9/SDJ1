public class FamilyCar extends Car {
	private int seats;
	public FamilyCar(String licenceNo, double price, int seats) {
		super(licenceNo, price);
		this.seats = seats;
	}

	public int getSeats(){
		return seats;
	}

	public String getType(){
		return "FamilyCar";
	}
}
