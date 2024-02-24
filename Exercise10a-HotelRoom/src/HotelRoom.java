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

	public HotelRoom(int number, String type, double price, Guest guest) {
		this.number = number;
		this.type = type;
		this.price = price;
		this.guest = guest;
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

	public int getFloor() {
		if(number < 100) {
			return 0;
		}
		else if(number >= 100 && number < 200) {
			return 1;
		}
		else if(number >= 200 && number < 300) {
			return 2;
		}
		else if(number >= 300 && number < 400) {
			return 3;
		}
		else if(number >= 400 && number < 500) {
			return 4;
		}
		else if(number >= 500 && number < 600) {
			return 5;
		}
		else if(number >= 600 && number < 700) {
			return 6;
		}
		else if(number >= 700 && number < 800) {
			return 7;
		}
		else if(number >= 800 && number < 900) {
			return 8;
		}
		else return -69696969;
	}

	public boolean isOccupied() {
		if (guest.equals(null)) {
			return false;
		}
		else return true;
	}

	public void registerGuest(Guest guest) {
		this.guest = (Guest)guest;
	}

	public void vacate() {
		this.guest = null;
	}

	public String toString() {
		return "Guest: " + guest + "type: " + type + "number: " + number + "price: " + price;
	}

	public static double getRoomPrice(String type) {
		if (type.equals("single")) {
			return SINGLE_PRICE;
		}

		if (type.equals("double")) {
			return DOUBLE_PRICE;
		}

		if (type.equals("family")) {
			return FAMILY_PRICE;
		}
		return -696969696969.69;
	}


}
