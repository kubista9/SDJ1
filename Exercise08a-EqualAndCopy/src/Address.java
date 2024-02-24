public class Address {
	private String town;
	private String street;
	private int number;
	private char letter = '-';
	private int floor = Integer.MIN_VALUE;
	private String door = null;

	Address(String town, String street, int number, char letter, int floor, String door  ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.letter = letter;
		this.floor = floor;
		this.door = door;

	}

	Address(String town, String street, int number, char letter, int floor) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.letter = letter;
		this.floor = floor;
	}

	Address(String town, String street, int number, int floor, String door  ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.floor = floor;
		this.door = door;
	}

	Address(String town, String street, int number, int floor ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.floor = floor;
	}

	Address(String town, String street, int number) {
		this.town = town;
		this.street = street;
		this.number = number;
	}

	Address(String town, String street, int number, char letter  ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.letter = letter;
	}

	Address(String town, String street, int number, char letter, String door  ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.letter = letter;
		this.door = door;
	}

	Address(String town, String street, int number, String door  ) {
		this.town = town;
		this.street = street;
		this.number = number;
		this.door = door;
	}

	public String getTown() {
		return town;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public char getLetter() {
		return letter;
	}

	public int getFloor() {
		return floor;
	}

	public String getDoor() {
		return door;
	}

	public boolean isApartment() {
		return floor != Integer.MIN_VALUE;
	}

	public String getFullNumber() {
		if ((letter == '-') && (floor == Integer.MIN_VALUE)) {
			return number + " " + door;
		}
		else if (floor == Integer.MIN_VALUE) {
			return number + " " + letter + " " + door;
		}
		else if (letter == '-') {
			return number + " " + floor + " " + door;
		}
		else return number + " " + letter + " " + floor + " " + door;
	}
	public boolean equals(Object obj) {
		if (obj== null || getClass() != obj.getClass()){
			return false;
		}
		Address other = (Address)obj;
		return town.equals(other.town)&& door.equals(other.door);
	}

	public String toString() {
		return getFullNumber();
	}

}
