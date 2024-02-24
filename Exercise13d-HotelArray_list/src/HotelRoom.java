public class HotelRoom {
	private int number;
	private String type;
	private double price;
	private Guest guest;
	private static final double SINGLE_PRICE = 59.50;
	private static final double DOUBLE_PRICE = 68.50;
	private static final double FAMILY_PRICE = 99.25;
	public static final String SINGLE = "Single";
	public static final String DOUBLE = "Double";
	public static final String FAMILY = "Family";

	public HotelRoom(int number, String type){
		this.number = number;
		this.type = type;
		this.price = 0.0;
		this.guest = null;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public Guest getGuest() {
		return guest;
	}

	public int getFloor(){
		return number/100;
	}

	public boolean isOccupied(){
		if (guest.equals(null)){
			return false;
		}
		else return true;
	}

	public void vacate(){
		this.guest = null;
	}

	@Override
	public String toString() {
		return "HotelRoom{" + "number=" + number + ", type='" + type + '\'' + ", price=" + price + ", guest=" + guest + '}';
	}

	public static double getRoomPrice(String type) {
		switch (type) {
			default: return SINGLE_PRICE;
			case DOUBLE: return DOUBLE_PRICE;
			case FAMILY: return FAMILY_PRICE;
		}
	}

}
